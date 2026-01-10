import os
import asyncio
import random
from dotenv import load_dotenv
from playwright.async_api import async_playwright

load_dotenv()

EMAIL = os.getenv("NAUKRI_EMAIL")
PWD = os.getenv("NAUKRI_PASSWORD")

PROFILE_URL = "https://www.naukri.com/mnjuser/profile"

# ---------------- HUMAN-LIKE HELPERS (ADDED) ----------------
async def human_delay(min_sec=1.5, max_sec=4.0):
    await asyncio.sleep(random.uniform(min_sec, max_sec))

async def human_scroll(page):
    for _ in range(random.randint(2, 4)):
        await page.mouse.wheel(0, random.randint(300, 700))
        await human_delay(1, 2)
# ------------------------------------------------------------

async def run():
    if not EMAIL or not PWD:
        raise SystemExit("Set NAUKRI_EMAIL and NAUKRI_PASSWORD environment variables")

    async with async_playwright() as p:
        # Slightly slower browser actions (human-like)
        browser = await p.chromium.launch(
            headless=False,
            slow_mo=random.randint(50, 120)
        )
        context = await browser.new_context()
        page = await context.new_page()

        # ---------------- LOGIN ----------------
        await page.goto("https://www.naukri.com/nlogin/login")
        await human_delay(3, 6)

        await page.wait_for_selector("#usernameField", timeout=60000)
        await page.fill("#usernameField", EMAIL)
        await human_delay(1, 2)

        await page.fill("#passwordField", PWD)
        await human_delay(1, 2)

        await page.click('button[type="submit"]')

        # wait for captcha / otp / login
        await human_delay(8, 12)

        print("Login submitted")

        # ---------------- PROFILE ----------------
        await page.goto(PROFILE_URL)
        await human_delay(4, 7)

        # Gentle scroll like a real user
        await human_scroll(page)

        print("Profile page opened")

        # ---------------- RESUME UPLOAD ----------------
        resume_dir = os.path.join(os.getcwd(), "resume")
        resume_files = [f for f in os.listdir(resume_dir) if f.lower().endswith(".pdf")]

        if not resume_files:
            raise Exception("No PDF found in ./resume folder")

        resume_path = os.path.join(resume_dir, resume_files[0])
        print(f"Uploading resume: {resume_path}")

        # Click Update Resume button
        await page.wait_for_selector('input[value="Update resume"]', timeout=60000)
        await human_delay(2, 4)
        await page.click('input[value="Update resume"]')

        await human_delay(2, 4)

        # Resume file input (explicit)
        await page.wait_for_selector('#attachCV', timeout=60000)
        file_input = page.locator('#attachCV')
        await file_input.set_input_files(resume_path)

        print("Resume uploaded successfully")

        # wait for upload to finish
        await human_delay(8, 12)

        await context.close()
        await browser.close()

if __name__ == "__main__":
    asyncio.run(run())

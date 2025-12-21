public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "a.";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        String removeCharacters = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println("remove characters: " + removeCharacters);

        String reverseString = reverse(s);
        System.out.println("toLowerCase string with characters: " + reverseString);

        if (removeCharacters.equals(reverseString)) {
            return true;
        }

        return false;
    }

    public static String reverse(String s) {
        String rev = s.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(rev.toLowerCase());
        StringBuilder reverse = stringBuilder.reverse();
        String reverse1 = String.valueOf(reverse);
        return reverse1.toLowerCase();
    }
}

package Multithreading.MonitorLockExample;

public class MonitorLockExample {

    public synchronized void task1() {
        try {
            System.out.println("Inside Task1 started");
            Thread.sleep(1000);
            System.out.println("Task1 completed");
        } catch (Exception e) {

        }
    }

    public void task2() {
        System.out.println("Task 2 before synchronized");
        synchronized (this) {
            System.out.println("Task 2 inside synchronized block");
        }
        System.out.println("Task 2 completed");
    }

    public void task3() {
        System.out.println("Task3 completed");
    }
}

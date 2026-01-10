package Multithreading.Deprecatedmethods;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main thread started its work");
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            sharedResource.produce();
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("Thread2 calling produce method");
            sharedResource.produce();
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        System.out.println("Thread1 is suspended");
        thread1.suspend();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        thread1.resume();
        // the thread1 lock gets release here once the thread1 is back from the suspended state the shared object will gets released
        // and now the thread2 will get access of the same object which is accessed by thread1

        System.out.println("Main thread is finishes its work");

    }
}

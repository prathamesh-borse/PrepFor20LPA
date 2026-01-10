package Multithreading.ImplementingRunnableInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("inside main thread: " + Thread.currentThread().getName());
        MultithreadingLearning runnableObj = new MultithreadingLearning();
        Thread thread = new Thread(runnableObj); // Thread is created not started
        thread.start();
        System.out.println("Finish main thread: " + Thread.currentThread().getName());
    }
}

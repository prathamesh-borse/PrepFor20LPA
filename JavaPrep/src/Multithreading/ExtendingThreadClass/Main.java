package Multithreading.ExtendingThreadClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main thread: " + Thread.currentThread().getName());
        MultithreadingLearning threadClassObj = new MultithreadingLearning();
        threadClassObj.start();
        System.out.println("Finish main thread: " + Thread.currentThread().getName());
    }
}

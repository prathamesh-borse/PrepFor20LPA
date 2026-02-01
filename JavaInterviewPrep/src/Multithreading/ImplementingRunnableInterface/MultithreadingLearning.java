package Multithreading.ImplementingRunnableInterface;

public class MultithreadingLearning implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed by Thread: " + Thread.currentThread().getName());
    }
}

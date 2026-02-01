package Multithreading.ExtendingThreadClass;

public class MultithreadingLearning extends Thread {

    @Override
    public void run() {
        System.out.println("Code executed in thread: " + Thread.currentThread().getName());
    }
}

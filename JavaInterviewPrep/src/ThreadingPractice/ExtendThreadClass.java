package ThreadingPractice;

public class ExtendThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is executed using extend thread class." + Thread.currentThread().getName());
    }
}

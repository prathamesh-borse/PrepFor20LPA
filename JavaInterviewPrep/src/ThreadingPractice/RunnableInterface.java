package ThreadingPractice;

public class RunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is execute using runnable interface");
    }
}

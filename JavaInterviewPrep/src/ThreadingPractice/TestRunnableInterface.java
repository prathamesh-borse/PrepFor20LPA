package ThreadingPractice;

public class TestRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Inside main method: " + Thread.currentThread().getName());
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread thread = new Thread(runnableInterface);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
        System.out.println();
        System.out.println("Extending Thread Class Example Below: ");
        System.out.println();
        System.out.println("Inside main method: " + Thread.currentThread().getName());
        ExtendThreadClass extendThreadClass = new ExtendThreadClass();
        extendThreadClass.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}

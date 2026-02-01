package Multithreading.MonitorLockRealExample;

public class SharedResource {

    boolean isItemAvailable = false;

    public synchronized void addItem() {
        System.out.println("Producer Thread inside the add Item Method");
        isItemAvailable = true;
        System.out.println("Producer Thread calling notify Method");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consumer Thread inside consume Item Method");
        while (!isItemAvailable) {
            try {
                System.out.println("Consumer Thread is waiting");
                wait(); // it will release all the monitor lock here because thread is in waiting state
            } catch (Exception e) {
                // exception handling
            }
        }
        System.out.println("Consumer thread consumed the item");
        isItemAvailable = false;
    }
}

package Multithreading.MonitorLockRealExample;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResourceObj = new SharedResource();

        Thread producerThread = new Thread((() -> {
            try {
                Thread.sleep(3000); // to make sure consumer thread go first
            } catch (Exception e) {
                // exception handling
            }
            ;
            sharedResourceObj.addItem();
        }));

        Thread consumerThread = new Thread(() -> {
            sharedResourceObj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}

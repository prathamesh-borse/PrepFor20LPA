package Multithreading.Assignment;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread;

        for (int i = 0; i < 5; i++) {
            int finalCount = i;
            producerThread = new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    sharedResource.addElementsInQueue(finalCount);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            producerThread.start();
        }


        Thread consumerThread;

        for (int i = 0; i < 5; i++) {
            consumerThread = new Thread(() -> {
                try {
                    sharedResource.consumeItemFromQueue();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            consumerThread.start();
        }
    }
}

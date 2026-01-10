package Multithreading.Assignment;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        SharedFixedQueue sharedFixedQueue = new SharedFixedQueue();

        Thread producerThread;

        for (int i = 0; i < 5; i++) {
            int finalCount = i;
            producerThread = new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    sharedFixedQueue.addElementsInQueue(finalCount);
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
                    sharedFixedQueue.consumeItemFromQueue();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            consumerThread.start();
        }
    }
}

package Multithreading.Assignment;

import java.util.concurrent.LinkedBlockingQueue;

public class SharedResource {
    private int capacityOfQueue = 5;
    private LinkedBlockingQueue<Integer> BQ = new LinkedBlockingQueue<>(capacityOfQueue);

    public void addElementsInQueue(int ele) throws InterruptedException {
        System.out.println("Producer thread inside addElementsInQueue Method");
        BQ.put(ele); // blocks if the queue is full
    }

    public void consumeItemFromQueue() throws InterruptedException {
        System.out.println("Consumer Thread inside consumeItemFromQueue Method");
        System.out.println("Consumer waiting...");
        Integer value = BQ.take();
        System.out.println("Consumer got: " + value);
    }
}

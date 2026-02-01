package Multithreading.AssignmentSolution;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedQueue;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        sharedQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception {
        if (sharedQueue.size() == bufferSize) {
            // queue is full
            System.out.println("Buffer is full, Producer is waiting for consumer ");
            wait();
        }
        sharedQueue.add(item);
        System.out.println("Produced: " + item);
        // Notify the consumer that there is an item inserted in the queue
        notify();
    }

    public synchronized int consume() throws Exception {
        if (sharedQueue.isEmpty()) {
            System.out.println("Buffer is empty wait for producer to insert data ");
            wait();
        }
        Integer item = sharedQueue.poll();
        System.out.println("Consume item: " + item);
        notify();
        return item;
    }
}

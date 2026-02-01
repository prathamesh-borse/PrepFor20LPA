package Multithreading.RaceCondition;

// here the count = 2000 is the correct output
// but we have race condition here, because two threads are working simultaneously on the shared mutable data count
// which is getting incremented by both the threads and here we don't have any synchronization

class Counter {
    int count = 0;

    void increment() {
        // here the count is getting incremented
        count++;
    }
}

public class RaceConditionDemoWithoutSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // t1 and t2 threads are working simultaneously means incrementing the counter
        t1.start();
        t2.start();

        // join make sure that one thread wait until another thread completes its execution
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.count);
    }
}

package Multithreading.MonitorLockExample;

/*
Inside Task1 started
Task3 completed
Task 2 before synchronized
Task1 completed
Task 2 inside synchronized block
Task 2 completed

First the task1 -> t1 thread started its execution by means we have call the start method -> so it will internally call the run() method
Task3 completed before because we have monitor lock obj and t1 is not completed it yet Task3 gets completed
Task3 do not have any require any resource which is getting blocked by Task1 and Task2 because they both require the same object for completion of t1 and t2 thread.
Task 2 before synchronized gets printed because after task3 completed its execution Task2(t2) thread comes for its execution so it will print the statement of before synchronization
when the monitor lock task1(t1) gets released means Task1(t1) gets completed, that means the monitor lock of obj object is now free and
t2 thread can use it That's why Task2 inside synchronized block gets printed and after that task2 finishes its execution.

 */

public class MonitorLockExampleMain {
    public static void main(String[] args) {
        // MonitorLockExample class all the tasks which needs to be executed
        MonitorLockExample obj = new MonitorLockExample();

        // MonitorThreadRunnable class is implementing the runnable interface
        MonitorThreadRunnable runnableObj = new MonitorThreadRunnable(obj);

        // t1 = This thread is using the runnable object for creation and then starting itself to execute task1
        Thread t1 = new Thread(runnableObj);

        // we are using lambda function to implement run method of the runnable interface
        // Runnable Interface is a functional interface which contains only one abstract method
        // so Instead of creating one separate class for implementing runnable interface and inside that using the object
        // of MonitorLockExample we can directly use lambda function to define the body of run method which basically for
        // executing the tasks of MonitorLockExample
        Thread t2 = new Thread(() -> {
            obj.task2();
        });
        Thread t3 = new Thread(() -> {
            obj.task3();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

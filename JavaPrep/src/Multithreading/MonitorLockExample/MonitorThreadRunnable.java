package Multithreading.MonitorLockExample;

public class MonitorThreadRunnable implements Runnable {
    MonitorLockExample obj;

    public MonitorThreadRunnable(MonitorLockExample obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}

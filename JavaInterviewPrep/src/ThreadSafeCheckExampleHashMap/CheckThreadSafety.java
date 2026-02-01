package ThreadSafeCheckExampleHashMap;

import java.util.HashMap;

public class CheckThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(i, i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Map size: " + hashMap.size());
    }
}

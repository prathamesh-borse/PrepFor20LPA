package ConcurrentModificationException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapThrowsCME {
    public static void main(String[] args) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('A', 1);
//        map.put('B', 2);
        // Throw Concurrent Modification Exception
        // Because hashmap uses the modCount
        // which tracks the structural modifications have done inside the code
//        for (Character key : map.keySet()) {
//            map.put('C', 3);
//        }

        // If we change HashMap to concurrentHashMap then we will not get the concurrentModificationException
        Map<Character, Integer> map = new ConcurrentHashMap<>();
        map.put('A', 1);
        map.put('B', 2);

        for (Character key : map.keySet()) {
            map.put('C', 3);
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ToggleLightBulbs {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(100);
        List<Integer> ans = toggleLightBulbs(arr);
        System.out.println(ans);
    }

    private static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < bulbs.size(); i++) {
            if (set.contains(bulbs.get(i))) {
                set.remove(bulbs.get(i));
            } else {
                set.add(bulbs.get(i));
            }
        }
        return new ArrayList<>(set);
    }
}

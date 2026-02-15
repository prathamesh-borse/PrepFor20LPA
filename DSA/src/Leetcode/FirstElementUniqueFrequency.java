package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstElementUniqueFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20};
        int ans = firstUniqueFreq(arr);
        System.out.println(ans);
    }

    private static int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer value : map.values()) {
            frequencyCount.put(value, frequencyCount.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int freq = map.get(nums[i]);
            if (frequencyCount.get(freq) == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}

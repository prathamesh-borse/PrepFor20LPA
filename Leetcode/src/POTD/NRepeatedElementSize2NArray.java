package POTD;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElementSize2NArray {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        int ans = repeatedNTimesSet(nums);
        System.out.println(ans);

    }

    public static int repeatedNTimesSet(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (!s.add(i))
                return i;
        }
        return nums[nums.length - 1];
    }

    public static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.println(map.toString());

        for (Integer key : map.keySet()) {
            if (map.get(key) >= n) {
                return key;
            }
        }
        return 0;
    }
}

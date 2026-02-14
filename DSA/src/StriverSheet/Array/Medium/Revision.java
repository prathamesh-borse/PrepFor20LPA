package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumRevision {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ans = twoSumOptimal(arr, 6);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{-1, -1};
    }

    private static boolean twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    // TC: O(NlogN)
    // SC: O(1)
    private static int[] twoSumBetter(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{i, map.get(target - arr[i])};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

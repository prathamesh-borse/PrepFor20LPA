package StriverSheet.Array.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        int ans = longestSubArraySumKContainsNegatives(arr, k);
        System.out.println(ans);
    }

    private static int longestSubArraySumKContainsNegatives(int[] arr, int k) {
        int prefixSum = 0, maxLen = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (prefixSumMap.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(prefixSum - k));
            }

            prefixSumMap.put(prefixSum, i);
        }

        return maxLen;
    }

    private static int longestSubArraySumK(int[] arr, int k) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += arr[l];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    // If the array is postives + zeros this is the optimal one
    private static int longestSubArraySumKOptimal(int[] arr, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        long sum = arr[0];
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }

        return maxLen;
    }
}

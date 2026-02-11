package Leetcode;

import java.util.HashSet;

public class LongestBalancedSubarrayI {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5, 4};
        int ans = longestBalanced(arr);
        System.out.println(ans);
    }

    // Balanced Subarray = equal number of even and equal number of odd elements
    public static int longestBalanced(int[] arr) {
        int max = 0;
        for (int left = 0; left < arr.length; left++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            for (int right = left; right < arr.length; right++) {
                if (arr[right] % 2 == 0)
                    even.add(arr[right]);
                else
                    odd.add(arr[right]);

                if (even.size() == odd.size()) {
                    max = Math.max(max, right - left + 1);
                }
            }
        }
        return max;
    }
}

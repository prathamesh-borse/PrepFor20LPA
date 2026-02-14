package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revision {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = printSubarrayofMaxiumSubarraySum(arr);
        System.out.println(ans);
    }

    public static int printSubarrayofMaxiumSubarraySum(int[] arr) {
        int n = arr.length, maxiSum = Integer.MIN_VALUE, currentSum = 0, start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int left = 0; left < n; left++) {
            if (left == 0) {
                start = left;
            }

            currentSum += arr[left];

            if (currentSum > maxiSum) {
                maxiSum = currentSum;
                ansStart = start;
                ansEnd = left;
            }

            if (currentSum < 0) {
                currentSum = 0;
                start = left + 1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = ansStart; i <= ansEnd; i++) {
            ans.add(arr[i]);
        }
        System.out.println(Arrays.asList(ans));
        return maxiSum;
    }
}

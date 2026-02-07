package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        List<List<Integer>> subarrays = maximumSubarraySum(arr);
//        System.out.println(Arrays.asList(subarrays));

        int ans = maxSubArraySumKadanesAlgorithm(arr);
        System.out.println(ans);
    }

    private static int maxSubArraySumKadanesAlgorithm(int[] nums) {
        int maxi = Integer.MIN_VALUE, sum = 0, start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = i;
            }
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = ansStart; i <= ansEnd; i++) {
            ans.add(nums[i]);
        }
        System.out.println(Arrays.asList(ans));
        return maxi;
    }

    private static List<List<Integer>> maximumSubarraySum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                List<Integer> temp = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    temp.add(nums[k]);
                }
                maxSum = Math.max(maxSum, sum);
                ans.add(temp);
            }
        }
        System.out.println(maxSum);
        return ans;
    }
}

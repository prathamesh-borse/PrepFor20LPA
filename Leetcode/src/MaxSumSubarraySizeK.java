import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] nums = {100, 200, 300, 400};
        int k = 2;
        List<Integer> list = printAllSubarrays(nums);
        System.out.println(list);
//        int ans = maxSubArraySum(nums, k);
//        System.out.println(ans);
        List<Integer> list1 = maxSumOfSubarrays(nums, k);
        System.out.println(list1);
    }

    public static List<Integer> printAllSubarrays(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int l = i; l <= j; l++) {
                    res.add(nums[l]);
                }
            }
        }
        return res;
    }

    public static List<Integer> maxSumOfSubarrays(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int currSum = 0;
            for (int j = 0; j < k; j++) {
                currSum += nums[i + j];
            }
            res.add(currSum);
        }
        return res;
    }

    public static int maxSubArraySum(int[] nums, int k) {
        int n = nums.length, low = 0, high = k - 1, sum = 0;

        for (int i = low; i <= high; i++) {
            sum += nums[i];
        }

        int res = 0;
        while (high < n) {
            res = Math.max(res, sum);
            low++;
            high++;

            sum = sum - nums[low - 1];

            if (high == n) {
                break;
            }

            sum = sum + nums[high];
        }
        return res;
    }
}

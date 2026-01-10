public class MaximumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int ans = minSubArrayLen(target, nums);
        System.out.println(ans);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0, high = 0, sum = 0, res = Integer.MAX_VALUE;
        while (high < n) {
            sum += nums[high];
            while (sum >= target) {
                int length = high - low + 1;
                res = Math.min(res, length);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }

        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}

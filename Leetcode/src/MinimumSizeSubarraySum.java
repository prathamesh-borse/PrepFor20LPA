public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int ans = minSubArrayLen(target, arr);
        System.out.println(ans);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int low = 0, sum = 0, res = Integer.MAX_VALUE;
        int n = nums.length;
        for (int high = 0; high < n; high++) {
            sum += nums[high];

            while (sum >= target) {
                res = Math.min(res, high - low + 1);
                sum = sum - nums[low];
                low++;
            }
        }

        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}

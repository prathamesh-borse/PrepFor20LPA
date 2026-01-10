import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = pivotIndex2(nums);
        System.out.println(ans);
    }

    public static int[] findPrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        return prefixSum;
    }

    public static int[] findSuffixSum(int[] nums) {
        int[] suffixSum = new int[nums.length];
        suffixSum[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i + 1];
        }
        return suffixSum;
    }

    public static int pivotIndex1(int[] nums) {
        int[] prefixSum = findPrefixSum(nums);
        int[] suffixSum = findSuffixSum(nums);
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getTotalSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int pivotIndex2(int[] nums) {
        int left = 0, right = 0, sum = getTotalSum(nums);
        for (int i = 0; i < nums.length; i++) {
            right = sum - left - nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}

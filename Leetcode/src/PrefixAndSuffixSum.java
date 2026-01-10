import java.util.Arrays;

public class PrefixAndSuffixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = findPrefixSum(arr);
        System.out.println(Arrays.toString(prefixSum));
        int[] suffixSum = findSuffixSum(arr);
        System.out.println(Arrays.toString(suffixSum));
    }

    public static int[] findPrefixSum(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        return pre;
    }

    public static int[] findSuffixSum(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i + 1];
        }
        return suffix;
    }
}

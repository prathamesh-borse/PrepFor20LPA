import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }

            if (nums[i] + nums[j] > target) {
                j--;
            }

            if (nums[i] + nums[j] < target) {
                i++;
            }
        }
        return new int[]{-1, -1};
    }
}
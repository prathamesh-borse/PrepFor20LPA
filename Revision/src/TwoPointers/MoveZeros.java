package TwoPointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] ans = moveZeros(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] moveZeros(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            }
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
        return nums;
    }
}

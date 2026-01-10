package TwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0, right = 1;
        while (right < n) {
            if (nums[left] == nums[right]) {
                right++;
            } else {
                left++;
                nums[left] = nums[right];
            }
        }
        System.out.println(Arrays.toString(nums));
        return left + 1;
    }
}

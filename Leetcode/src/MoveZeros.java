import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] ans = moveZeros(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] moveZeros(int[] nums) {
        int n = nums.length, curr = 0, next = 1;
        while (next < n) {
            if (nums[next] != 0) {
                if (nums[curr] != 0) {
                    curr++;
                }
                int temp = nums[curr];
                nums[curr] = nums[next];
                nums[next] = temp;
            }

            next++;
        }
        return nums;
    }
}

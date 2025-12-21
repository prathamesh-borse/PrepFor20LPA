public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int ans = removeDuplicates(arr);
        System.out.println(ans);

    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int j = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

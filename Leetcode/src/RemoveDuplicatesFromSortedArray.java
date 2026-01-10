public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(arr);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int curr = 0, next = 1, uniqueEle = 1;
        while (next < nums.length) {
            if (nums[curr] == nums[next]) {
                next++;
                continue;
            }

            if (nums[curr] != nums[next]) {
                nums[curr + 1] = nums[next];
                uniqueEle++;
                curr++;
                next++;
            }

        }
        return uniqueEle;
    }
}

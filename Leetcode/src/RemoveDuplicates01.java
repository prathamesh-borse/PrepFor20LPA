import java.util.Arrays;

public class RemoveDuplicates01 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] arr) {
        int curr = 0, next = 1, n = arr.length, uniqueEle = 1;
        while (next < n) {
            if (arr[curr] == arr[next]) {
                next++;
                continue;
            }
            if (arr[next] != arr[curr]) {
                arr[curr + 1] = arr[next];
                uniqueEle++;
                curr++;
                next++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return uniqueEle;
    }
}

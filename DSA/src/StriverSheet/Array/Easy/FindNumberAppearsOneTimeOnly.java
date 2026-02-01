package StriverSheet.Array.Easy;

public class FindNumberAppearsOneTimeOnly {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int ans = findOneNumber(arr);
        System.out.println(ans);
    }

    private static int findOneNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

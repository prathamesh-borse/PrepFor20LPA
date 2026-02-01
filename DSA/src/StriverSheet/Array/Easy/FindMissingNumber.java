package StriverSheet.Array.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1};
        int n = arr.length;
        int ans = missingNumberOptimal(arr, n);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr, int n) {
        for (int i = 0; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int missingNumberOptimal(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;
        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        for (int i = 0; i <= n - 1; i++) {
            xor2 = xor2 ^ arr[i];
        }

        int ans = xor1 ^ xor2;
        return ans;
    }
}

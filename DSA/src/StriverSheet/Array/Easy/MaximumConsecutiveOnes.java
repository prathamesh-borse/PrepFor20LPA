package StriverSheet.Array.Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int n = arr.length;
        int ans = countMaximumOnes(arr, n);
        System.out.println(ans);
    }

    private static int countMaximumOnes(int[] arr, int n) {
        int maxi = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                if (cnt > maxi) {
                    maxi = cnt;
                }
            } else if (arr[i] != 1) {
                cnt = 0;
            }
        }
        return maxi;
    }
}

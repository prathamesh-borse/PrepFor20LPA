public class MinimumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -3};
        int ans = smallestSumSubArray1(arr);
        System.out.println(ans);
    }

    static int smallestSumSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] < sum) {
                sum = arr[i];
            }
            min = Math.min(min, sum);
        }
        return min;
    }

    static int smallestSumSubArray1(int[] arr) {
        int bestending = arr[0], ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int v1 = arr[i];
            int v2 = bestending + arr[i];
            bestending = Math.min(v1, v2);
            ans = Math.min(ans, bestending);
        }
        return ans;
    }
}

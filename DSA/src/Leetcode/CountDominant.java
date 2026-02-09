package Leetcode;

public class CountDominant {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2};
        int ans = dominantIndices(arr);
        System.out.println(ans);
    }

    public static int dominantIndices(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            double average = average(arr, i);
            if (arr[i] > average) {
                count++;
            }
        }
        return count;
    }

    public static double average(int[] arr, int i) {
        int sum = 0, count = 0;
        for (int j = i + 1; j < arr.length; j++) {
            sum += arr[j];
            count++;
        }

        return (double) sum / count;
    }
}

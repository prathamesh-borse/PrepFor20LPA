package StriverSheet.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int[] ans = BubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] BubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}
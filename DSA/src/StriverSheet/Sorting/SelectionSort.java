package StriverSheet.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swap(arr, mini, i);
        }
        return arr;
    }

    private static void swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}

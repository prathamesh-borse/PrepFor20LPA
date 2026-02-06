package StriverSheet.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int[] ans = InsertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] InsertionSort(int[] arr) {
        int n = arr.length;

        // code here
        // select one element and place it at its correct position
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i; // pick one element
            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap the element till if we find j - 1 element is greater than
                // the current array index j element
                swap(arr, j - 1, j);
                j--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }

    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        // select one element and place it at its correct position
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i; // pick one element
            while (j > 0 && arr[j - 1] > arr[j]) {
                // swap the element till if we find j - 1 element is greater than
                // the current array index j element
                swap(arr, j - 1, j);
                j--;
            }
        }
    }
}

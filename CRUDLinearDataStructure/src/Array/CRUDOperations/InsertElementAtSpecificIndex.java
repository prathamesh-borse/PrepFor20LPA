package Array.CRUDOperations;

import java.util.Arrays;

public class InsertElementAtSpecificIndex {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 8;
        int pos = 2;
        int size = 5;

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = 20;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

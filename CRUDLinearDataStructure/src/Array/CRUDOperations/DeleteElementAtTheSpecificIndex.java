package Array.CRUDOperations;

import java.util.Arrays;

public class DeleteElementAtTheSpecificIndex {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 8;
        arr[4] = 10;
        int n = arr.length;
        int pos = 1;
        System.out.println(Arrays.toString(arr));

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // pos = 1 ; i = 1 ; 1<5;
        // arr[1] = arr[2] = [3,2,8,10];

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

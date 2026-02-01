package StriverSheet.Array.Easy;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = leftRotateArrayByOnePlaceGFG(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] leftRotateArrayByOnePlace(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i <= n - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }

    private static int[] leftRotateArrayByOnePlaceGFG(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;

    }
}

package POTD;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        boolean isIncrement = false;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i] += 1;
                isIncrement = true;
                break;
            }
        }

        if (!isIncrement) {
            int[] arr1 = new int[n + 1];
            arr1[0] = 1;
            return arr1;
        }
        return arr;
    }
}

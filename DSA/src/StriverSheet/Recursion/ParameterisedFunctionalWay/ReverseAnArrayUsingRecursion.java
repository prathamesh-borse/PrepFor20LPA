package StriverSheet.Recursion.ParameterisedFunctionalWay;

import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int left = 0, right = a.length - 1;
        int[] ans = reverseArray(a, left, right);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] reverseArrayUsingOneVariable(int[] a, int i) {
        int n = a.length;
        if (i >= n / 2) {
            return a;
        }
        swap(a, i, n - i - 1);
        return reverseArrayUsingOneVariable(a, i + 1);
    }

    private static int[] reverseArray(int[] a, int left, int right) {
        if (left >= right) {
            return a;
        }
        swap(a, left, right);
        return reverseArray(a, left + 1, right - 1);
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}

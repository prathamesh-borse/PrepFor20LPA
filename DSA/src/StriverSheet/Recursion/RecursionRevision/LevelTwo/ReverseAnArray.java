package StriverSheet.Recursion.RecursionRevision.LevelTwo;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] copy = Arrays.copyOf(a, a.length);
        int left = 0, right = a.length - 1;
        int[] ans = reverseAnArray(a, left, right);
        System.out.println(Arrays.toString(ans));

        // One variable
        int[] reverseAnArrayOneVariable = reverseAnArrayOneVariable(copy, 0);
        System.out.println(Arrays.toString(reverseAnArrayOneVariable));
    }

    private static int[] reverseAnArrayOneVariable(int[] a, int i) {
        int n = a.length;
        if (i >= n / 2) {
            return a;
        }
        swap(a, i, n - i - 1);
        return reverseAnArrayOneVariable(a, i + 1);
    }

    private static int[] reverseAnArray(int[] a, int left, int right) {
        if (left >= right) {
            return a;
        }
        swap(a, left, right);
        return reverseAnArray(a, left + 1, right - 1);
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}

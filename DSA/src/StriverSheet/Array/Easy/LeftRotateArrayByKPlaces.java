package StriverSheet.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] ans = rightRotateArrayByDPlaces(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rightRotateArrayByDPlaces(int[] arr, int k) {
        // step 1: reduce k to something lesser than the multiple array size n
        k = k % arr.length;

        // step 2: store everything till the d position from the array inside temp list
        List<Integer> tempList = new ArrayList<>();
        for (int i = arr.length - k; i < arr.length; i++) {
            tempList.add(arr[i]);
        }

        // step 3: shift array elements by d places
        for (int i = arr.length - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // step 4: put everything from temp to arr index position
        for (int i = 0; i < k; i++) {
            arr[i] = tempList.get(i);
        }
        return arr;
    }

    private static int[] leftRotateArrayByDPlaces(int[] arr, int k) {
        // step 1: reduce k to something lesser than the multiple array size n
        k = k % arr.length;

        // step 2: store everything till the d position from the array inside temp list
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            tempList.add(arr[i]);
        }

        // step 3: shift array elements by d places
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        // step 4: put everything from temp to arr index position
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = tempList.get(i - (arr.length - k));
        }
        return arr;
    }
}

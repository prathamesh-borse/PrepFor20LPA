package StriverSheet.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheEndOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 1};
        moveAllZerosToEndOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] moveAllZerosToEndBrute(int[] arr) {
        // step 1: store all non zero elements
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempList.add(arr[i]);
            }
        }

        // step 2: insert all non zero element in arr
        for (int i = 0; i < tempList.size(); i++) {
            arr[i] = tempList.get(i);
        }

        // step 3: insert the remaining with zeros
        for (int i = tempList.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    private static void moveAllZerosToEndOptimal(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        // step 1: find one non zero element
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // step 2: if no zero element found, nothing to move
        if (j == -1) return;

        // step 3: find the non zero element and swap it with index j element
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        int[] ans = sortArrayOptimal(arr);
//        System.out.println(Arrays.toString(ans));

        sortArray(arr);
    }

    public static void sortArray(int[] nums) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero.add(nums[i]);
            } else if (nums[i] == 1) {
                ones.add(nums[i]);
            } else {
                twos.add(nums[i]);
            }
        }

        int zerosSize = zero.size();
        int onesSize = ones.size();
        int twosSize = twos.size();
        int index = 0;
        for (int i = 0; i < zerosSize; i++) {
            nums[index] = zero.get(i);
            index++;
        }

        for (int i = 0; i < onesSize; i++) {
            nums[index] = ones.get(i);
            index++;
        }

        for (int i = 0; i < twosSize; i++) {
            nums[index] = twos.get(i);
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }

    private static int[] sortArrayOptimal(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int[] sortArrayBrute(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }
}

package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutationsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = permuteSwappingOptimalTC(arr);
        System.out.println(Arrays.asList(ans));
    }

    private static List<List<Integer>> permuteSwappingOptimalTC(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, arr, ans);
        return ans;
    }

    private static void recurPermute(int index, int[] arr, List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(ds);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            recurPermute(index + 1, arr, ans);
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        recurPermute(arr, ds, ans, freq);
        return ans;
    }

    private static void recurPermute(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recurPermute(arr, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

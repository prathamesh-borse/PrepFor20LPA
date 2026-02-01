package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);

            if (diff < minAbs) {
                minAbs = diff;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minAbs) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                result.add(temp);
            }
        }
        System.out.println(minAbs);
        return result;
    }
}

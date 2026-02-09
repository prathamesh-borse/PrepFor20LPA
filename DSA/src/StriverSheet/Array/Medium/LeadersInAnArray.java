package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.List;

// Solved this problem by myself = 10:18PM 09/02/2026

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> ans = leadersInArray(arr);
        System.out.println(List.of(ans));
    }

    private static List<Integer> leadersInArray(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = checkEverythingOnTheRightIsSmallerOrNot(i, arr);
            if (ele == -1) {
                continue;
            }else {
                ans.add(ele);
            }
        }
        return ans;
    }

    private static int checkEverythingOnTheRightIsSmallerOrNot(int currentIndex, int[] arr) {
        int nextIndex = currentIndex + 1;
        while (nextIndex < arr.length) {
            if (arr[currentIndex] >= arr[nextIndex]) {
                nextIndex++;
            } else if (arr[currentIndex] <= arr[nextIndex]) {
                return -1;
            }
        }
        return arr[currentIndex];
    }
}

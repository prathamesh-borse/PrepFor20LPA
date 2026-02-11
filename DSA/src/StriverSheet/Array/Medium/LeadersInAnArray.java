package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.List;

// Solved this problem by myself = 10:18PM 09/02/2026

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> ans = leadersInArrayOptimal(arr);
        System.out.println(List.of(ans));
    }

    private static List<Integer> leadersInArrayOptimal(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxi) {
                maxi = arr[i];
                ans.add(arr[i]);
            }
        }
        reverse(ans);
        return ans;
    }

    private static void reverse(List<Integer> ans) {
        int start = 0, end = ans.size() - 1;
        while (start < end) {
            int temp = ans.get(start);
            ans.set(start, ans.get(end));
            ans.set(end, temp);
            start++;
            end--;
        }
    }

    private static List<Integer> leadersInArray(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = checkEverythingOnTheRightIsSmallerOrNot(i, arr);
            if (ele == -1) {
                continue;
            } else {
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

package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans = spiralOrderLC(arr);
        System.out.println(List.of(ans));
    }

    private static List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    private static List<Integer> spiralOrderLC(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}

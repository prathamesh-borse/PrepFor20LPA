package StriverSheet.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {4, 9, 5};
        int[] B = {9, 4, 9, 8, 4};
        int[] ans = intersectionOptimal(A, B);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] intersectionOptimal(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int n1 = A.length, n2 = B.length;
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                if (!ans.contains(A[i])) {
                    ans.add(A[i]);
                }
                i++;
                j++;
            }
        }

        int[] arr = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            arr[k] = ans.get(k);
        }
        return arr;
    }

    private static int[] intersectionBrute(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int n1 = A.length, n2 = B.length;
        int[] vis = new int[n2];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (A[i] == B[j] && vis[j] == 0) {
                    ans.add(A[i]);
                    vis[j] = 1;
                    break;
                }

                if (B[j] >= A[i]) break;
            }
        }

        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}

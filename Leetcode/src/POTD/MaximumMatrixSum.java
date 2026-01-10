package POTD;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumMatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, -1}, {-1, 1}};
        long ans = maxMatrixSum(matrix);
        System.out.println(ans);
    }

    public static long maxMatrixSum(int[][] matrix) {
        long maxAbsoluteSum = 0;
        long smallestAbsoluteSum = Long.MAX_VALUE;
        long countNegatives = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int ele = matrix[i][j];
                if (ele < 0) {
                    countNegatives++;
                }
                int absVal = Math.abs(ele);
                if (absVal < smallestAbsoluteSum) {
                    smallestAbsoluteSum = absVal;
                }
                maxAbsoluteSum += absVal;
            }
        }

        if (countNegatives % 2 != 0) {
            return maxAbsoluteSum - 2 * smallestAbsoluteSum;
        }
        return maxAbsoluteSum;
    }
}

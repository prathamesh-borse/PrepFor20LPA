package MergeInterval;

import java.util.Arrays;
import java.util.LinkedList;

public class IntervalListIntersections {
    public static void main(String[] args) {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] ans = intervalIntersection(firstList, secondList);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        LinkedList<int[]> result = new LinkedList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            if (start1 <= start2) {
                if (end1 >= start2) {
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);
                    result.add(new int[]{s, e});
                }
            } else {
                if (end2 >= start1) {
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);
                    result.add(new int[]{s, e});
                }
            }

            if (end1 <= end2) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

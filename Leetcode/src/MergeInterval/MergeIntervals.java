package MergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        int[][] ans = merge(intervals);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] merge(int[][] a) {
        // Intervals needs to be sorted first
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        int n = a.length;
        List<int[]> result = new ArrayList<>();
        int start1 = a[0][0];
        int end1 = a[0][1];
        for (int i = 1; i < n; i++) {
            int start2 = a[i][0];
            int end2 = a[i][1];
            if (end1 >= start2) {
                start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            }
            result.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;
        }
        result.add(new int[]{start1, end1});
        return result.toArray(new int[result.size()][]);
    }
}

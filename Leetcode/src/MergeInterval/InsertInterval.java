package MergeInterval;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] ans = insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] merge(int[][] a) {
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        int n = a.length;
        LinkedList<int[]> result = new LinkedList<>();
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

    public static int[][] insert(int[][] a, int[] newInterval) {
        int n = a.length;
        LinkedList<int[]> result = new LinkedList<>();
        boolean insert = false;
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (!insert && start >= newInterval[0]) {
                result.add(newInterval);
                insert = true;
            }
            result.add(a[i]);
        }

        if (!insert) {
            result.add(newInterval);
        }
        return merge(result.toArray(new int[result.size()][]));
    }
}

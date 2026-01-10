import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SqauresOfSortedArray {

    public static void main(String[] args) {

    }


    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }

        // all positive elements
        if (neg.size() == 0) {
            for (int p = 0; p < pos.size(); p++) {
                pos.set(p, pos.get(p) * pos.get(p));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }


        // all negative elements
        if (pos.size() == 0) {
            for (int l = 0; l < neg.size(); l++) {
                neg.set(l, neg.get(l) * neg.get(l));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        // sqaure neg list
        for (int a = 0; a < neg.size(); a++) {
            neg.set(a, neg.get(a) * neg.get(a));
        }
        Collections.reverse(neg);

        // sqaure pos list
        for (int k = 0; k < pos.size(); k++) {
            pos.set(k, pos.get(k) * pos.get(k));
        }

        // contains neg and pos elements
        int i = 0, j = 0, id = 0;
        int n1 = neg.size(), n2 = pos.size();
        int[] res = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[id++] = neg.get(i++);
            } else {
                res[id++] = pos.get(j++);
            }
        }

        while (i < n1) {
            res[id++] = neg.get(i++);
        }

        while (j < n2) {
            res[id++] = pos.get(j++);
        }

        return res;
    }
}

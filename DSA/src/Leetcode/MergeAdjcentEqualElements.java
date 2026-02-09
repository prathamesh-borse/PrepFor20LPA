package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAdjcentEqualElements {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 2};
        List<Long> ans = mergeAdjcent(arr);
        System.out.println(Arrays.asList(ans));
    }

    public static List<Long> mergeAdjcent(int[] nums) {
        List<Long> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add((long) nums[i]);

            while (ans.size() >= 2) {
                int last = ans.size() - 1;
                if (ans.get(last).equals(ans.get(last - 1))) {
                    long merged = (long) ans.get(last) + ans.get(last - 1);
                    ans.remove(last);
                    ans.remove(last - 1);
                    ans.add(merged);
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}

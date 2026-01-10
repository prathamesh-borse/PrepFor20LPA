import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, -10};
        int k = 15;
        List<Integer> ans = printAllSubArrays(nums, k);
        System.out.println(ans);
//        int ans = longestSubarray(nums, k);
//        System.out.println(ans);
    }

    public static List<Integer> printAllSubArrays(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int l = i; l <= j; l++) {
                    res.add(arr[l]);
                }
            }
        }
        return res;
    }

    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length, maxLen = 0;
        long sum = 0;
        Map<Long, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;
            if (freq.containsKey(rem)) {
                int len = i - freq.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!freq.containsKey(sum)) {
                freq.put(sum, i);
            }
        }
        return maxLen;
    }
}

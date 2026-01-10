import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        int k = 6;
        int[] prefixSum = PrefixSum(arr);
        int ans = findLongestSubArraySumK(arr, k);
        System.out.println(ans);
//        System.out.println(Arrays.toString(prefixSum));
    }

    public static int[] PrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = 0;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        return prefixSum;
    }

    public static int findLongestSubArraySumK(int[] arr, int k) {
        int prefixSum = 0, maxLen = 0;
        Map<Integer, Integer> firstIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (firstIndex.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - firstIndex.get(prefixSum - k));
            }

            firstIndex.putIfAbsent(prefixSum, i);
        }
        return maxLen;
    }
}

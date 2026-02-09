package Leetcode;

import java.util.TreeMap;

public class CountSubarraysWithCostLessthanEqualToK {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        int k = 4;
        long ans = countSubarrays(arr, k);
        System.out.println(ans);
    }

    private static long countSubarrays(int[] arr, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long ans = 0;
        int l = 0;

        for (int r = 0; r < arr.length; r++) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while ((long) (map.lastKey() - map.firstKey()) * (r - l + 1) > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            ans += (r - l + 1);
        }

        return ans;
    }
}

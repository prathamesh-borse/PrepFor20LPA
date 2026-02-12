package StriverSheet.Array.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, -3, 1, 1, 1};
        int k = 3;
        int ans = subarraySumOptimal(arr, k);
        System.out.println(ans);
    }

    private static int subarraySumOptimal(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }

    private static int subarraySum(int[] arr, int k) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    cnt = cnt + 1;
                }
            }

        }
        return cnt;
    }
}

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        int i = subarraySum(arr, k);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        int preSum = 0, cnt = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            if (freq.containsKey(remove)) {
                cnt += freq.get(remove);
            }
            freq.put(preSum, freq.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}

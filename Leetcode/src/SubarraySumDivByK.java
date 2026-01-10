import java.util.HashMap;
import java.util.Map;

public class SubarraySumDivByK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int ans = subarraysDivByK(nums, k);
        System.out.println(ans);
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int res = 0, sum = 0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) {
                rem = rem + k;
            }

            if (map.containsKey(rem)) {
                res += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return res;
    }
}

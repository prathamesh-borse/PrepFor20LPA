import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        int ans = findMaxLength(nums);
        System.out.println(ans);
    }

    public static int findMaxLength(int[] nums) {
        int res = 0, zeros = 0, ones = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                ones++;
            }

            int diff = zeros - ones;
            if (diff == 0) {
                res = Math.max(res, i + 1);
            }

            if (!map.containsKey(diff)) {
                map.put(diff, i);
            } else {
                int idx = map.get(diff);
                int len = i - idx;
                res = Math.max(len, res);
            }
        }
        return res;
    }
}

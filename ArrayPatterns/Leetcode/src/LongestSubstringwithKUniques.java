import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithKUniques {
    public static void main(String[] args) {
        String s = "aaaa";
        int k = 2;

        int i = longestKSubstr(s, k);
        System.out.println(i);
    }

    public static int longestKSubstr(String s, int k) {
        int low = 0, res = -1, n = s.length();
        Map<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char rightChar = s.charAt(high);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                low++;
            }

            if (freq.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }
        return res;
    }
}

import java.util.*;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }


    public static int lengthOfLongestSubstring(String s) {
        int low = 0, n = s.length(), res = Integer.MIN_VALUE;
        Map<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char rightChar = s.charAt(high);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            int k = high - low + 1;

            while (freq.size() < k) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                low++;
                k = high - low + 1;
            }
            k = high - low + 1;
            res = Math.max(res, k);
        }
        return res;
    }
}

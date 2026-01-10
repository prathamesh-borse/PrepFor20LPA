import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        List<String> res = printAllSubstring(s);
        System.out.println(res);
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static List<String> printAllSubstring(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                res.add(s.substring(i, j + 1));
            }
        }
        return res;
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), low = 0, res = Integer.MIN_VALUE;
        Map<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char rightChar = s.charAt(high);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            int k = high - low + 1;
            // we are calculating k because we this is a variable window questions and we do not have given k
            // k means the length of the substring, and in that substring it will contain all the characters
            // if the map.size() is less than k means map contains the character is duplicated and its frequency is increased
            // so we need to reduce frequency of characters from left and add the next character inside the map and again
            // check if freq.size() == k if this is true means we found the unqiue substring now we add that inside the result
            // and lastly we return it

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

        return (res == Integer.MIN_VALUE) ? 0 : res;
    }
}

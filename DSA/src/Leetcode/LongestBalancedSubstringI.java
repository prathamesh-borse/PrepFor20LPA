package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestBalancedSubstringI {
    public static void main(String[] args) {
        String s = "abbac";
        int ans = longestBalanced(s);
        System.out.println(ans);
    }

    private static int longestBalanced(String s) {
        int longest = 1;
        // ek ek character la traverse krava lagel string madhlya tya nanter
        // traverse kartana jar same character sampdl tr tychi frequency increase krayachi
        // and traverse krtana he pan check krave lagel ki characters chi ji frequency ahe
        // jar ti equal ahe tr mg tyachi substring length calculate krayachi and longest return kraycha
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(c));

                int length = j - i + 1;
                int distinctCount = map.size();
                if (length == maxFreq * distinctCount) {
                    longest = Math.max(longest, length);
                }
            }
        }
        return longest;
    }
}

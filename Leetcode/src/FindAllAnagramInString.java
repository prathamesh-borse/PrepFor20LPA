import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramInString {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return null;
        List<Integer> result = new ArrayList<>();

        int low = 0, n1 = p.length(), n2 = s.length();
        int[] scount = new int[26];
        int[] pcount = new int[26];
        int windowSize = p.length();

        for (int i = 0; i < n1; i++) {
            pcount[p.charAt(i) - 'a']++;
        }

        for (int high = 0; high < n2; high++) {
            scount[s.charAt(high) - 'a']++;

            if (high - low + 1 > windowSize) {
                scount[s.charAt(low) - 'a']--;
                low++;
            }

            if (high - low + 1 == windowSize) {
                if (Arrays.equals(pcount, scount)) {
                    result.add(low);
                }
            }
        }
        return result;
    }
}

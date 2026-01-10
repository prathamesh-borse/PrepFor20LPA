import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = checkInclusion(s1, s2);
        System.out.println(ans);
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int low = 0, n1 = s1.length(), n2 = s2.length();
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        int windowSize = s1.length();

        for (int i = 0; i < n1; i++) {
            char ch = s1.charAt(i);
            s1count[ch - 'a']++;
        }

        for (int high = 0; high < n2; high++) {
            char rightChar = s2.charAt(high);
            s2count[rightChar - 'a']++;

            if (high - low + 1 > windowSize) {
                char leftChar = s2.charAt(low);
                s2count[leftChar - 'a']--;
                low++;
            }

            if (high - low + 1 == windowSize) {
                if (Arrays.equals(s1count, s2count)) {
                    return true;
                }
            }
        }
        return false;
    }
}

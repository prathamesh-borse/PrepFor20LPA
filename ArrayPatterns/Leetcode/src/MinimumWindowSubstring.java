public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "";
        String t = "aa";

        String s1 = minWindow(s, t);
        System.out.println(s1);
    }

    public static boolean isInformationCorrect(int[] have, int[] need) {
        for (int i = 0; i < 256; i++) {
            if (have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }

    public static String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if (n < m) return "";
        int low = 0, res = Integer.MAX_VALUE, start = -1;
        int[] have = new int[256];
        int[] need = new int[256];

        for (int k = 0; k < m; k++) {
            need[t.charAt(k)]++;
        }

        for (int high = 0; high < n; high++) {
            have[s.charAt(high)]++;

            while (isInformationCorrect(have, need)) {
                int len = high - low + 1;
                if (res > len) {
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if (res == Integer.MAX_VALUE) return "";
        return s.substring(start, start + res);
    }
}

package Leetcode;

public class LongestAlmostPalindromeSubstring {
    public static void main(String[] args) {
        String s = "zzabba";
        int ans = almostPalindromic(s);
        System.out.println(ans);  // Expected: 4
    }

    public static int almostPalindromic(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            // odd-length center
            maxLength = Math.max(maxLength, expand(s, i, i));

            // even-length center
            maxLength = Math.max(maxLength, expand(s, i, i + 1));
        }

        return maxLength;
    }

    private static int expand(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n) {

            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                // try removing exactly one char
                if (isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1)) {

                    return right - left + 1;
                }
                return 0;
            }
        }

        // if fully palindrome, removing one char still valid
        return right - left - 1;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
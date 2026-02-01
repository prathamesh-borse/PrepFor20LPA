package StriverSheet.Recursion.ParameterisedFunctionalWay;

public class ValidPalindromeLC125 {
    public static void main(String[] args) {
        String s = "race a car";
        boolean ans = isPalindrome(s, 0);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String str, int i) {
        String newString = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int n = newString.length();
        if (i >= n / 2) {
            return true;
        }
        if (newString.charAt(i) != newString.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(newString, i + 1);

    }
}

package StriverSheet.Recursion.RecursionRevision.LevelTwo;

public class CheckStringPalindromeOrNot {
    public static void main(String[] args) {
        String str = "MARKRAM";
        boolean ans = checkPalindromeString(str, 0);
        System.out.println(ans);
    }

    private static boolean checkPalindromeString(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return checkPalindromeString(str, i + 1);
    }
}

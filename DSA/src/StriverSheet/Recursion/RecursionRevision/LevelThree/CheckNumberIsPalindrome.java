package StriverSheet.Recursion.RecursionRevision.LevelThree;

public class CheckNumberIsPalindrome {
    public static void main(String[] args) {
        int n = 121;
        boolean ans = checkNumberIsPalindrome(n);
        System.out.println(ans);
    }

    private static boolean checkNumberIsPalindrome(int n) {
        int copy = n;
        int reverse = reverseNumber(n, 0);

        if (copy == reverse) {
            return true;
        }
        return false;
    }

    private static int reverseNumber(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        int lastDigit = n % 10;
        reverse = (reverse * 10) + lastDigit;
        n = n / 10;
        return reverseNumber(n, reverse);
    }
}

package StriverSheet.Recursion.RecursionRevision.LevelTwo;

public class CheckArrayIsPalindrome {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        boolean ans = checkArrayPalindromeOrNot(a, 0);
        System.out.println(ans);
    }

    private static boolean checkArrayPalindromeOrNot(int[] a, int i) {
        int n = a.length;
        if (i >= n / 2) {
            return true;
        }
        if (a[i] != a[n - i - 1]) {
            return false;
        }
        return checkArrayPalindromeOrNot(a, i + 1);
    }
}

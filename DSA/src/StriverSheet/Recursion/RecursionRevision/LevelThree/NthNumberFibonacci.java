package StriverSheet.Recursion.RecursionRevision.LevelThree;

public class NthNumberFibonacci {
    public static void main(String[] args) {
        int n = 4;
        int ans = findNthNumberFibonacci(n);
        System.out.println(ans);
    }

    private static int findNthNumberFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findNthNumberFibonacci(n - 1) + findNthNumberFibonacci(n - 2);
    }
}

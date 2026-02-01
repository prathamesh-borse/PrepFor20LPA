package StriverSheet.Recursion.RecursionRevision.LevelThree;

public class CheckNumberIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 18;
        boolean ans = checkNumberIsPowerOfTwo(n);
        System.out.println(ans);
    }

    private static boolean checkNumberIsPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n > 1 && n % 2 != 0) {
            return false;
        }
        return checkNumberIsPowerOfTwo(n / 2);
    }
}

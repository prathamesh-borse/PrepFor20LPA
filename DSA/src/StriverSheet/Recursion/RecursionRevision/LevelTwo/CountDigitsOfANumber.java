package StriverSheet.Recursion.RecursionRevision.LevelTwo;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        int n = 234567;
        int ans = countDigits(n, 0);
        System.out.println(ans);
    }

    private static int countDigits(int n, int i) {
        if (n <= 0) {
            return i;
        }
        i++;
        n = n / 10;
        return countDigits(n, i);
    }
}

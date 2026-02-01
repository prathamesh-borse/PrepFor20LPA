package StriverSheet.Recursion.RecursionRevision.LevelThree;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int n = 1234;
        int ans = sumOfDigits(n, 0);
        System.out.println(ans);
    }

    private static int sumOfDigits(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int lastDigit = n % 10;
        sum += lastDigit;
        n = n / 10;
        return sumOfDigits(n, sum);
    }
}

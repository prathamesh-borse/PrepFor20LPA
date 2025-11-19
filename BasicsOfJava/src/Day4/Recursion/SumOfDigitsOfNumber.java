package Day4.Recursion;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int n = 123;
        int sum = sumOfDigits(n);
        System.out.println(sum);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}

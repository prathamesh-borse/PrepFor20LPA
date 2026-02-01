package StriverSheet.BasicMath;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = -121;
        int copyOfN = n;
        int reversedNumber = reverseNumber(n);
        System.out.println(reversedNumber);
    }

    // 1534236469
    // 2147483647

    private static int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            if (reverseNumber > Integer.MAX_VALUE / 10 || reverseNumber < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n = n / 10;
        }

        return reverseNumber;
    }
}

package StriverSheet.BasicMath;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123;
        int ans = reverseNumber(n);
        System.out.println(ans);
    }

    private static int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n /= 10;
        }
        return reverseNumber;
    }
}

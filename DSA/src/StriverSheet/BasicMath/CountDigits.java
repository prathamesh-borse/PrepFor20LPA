package StriverSheet.BasicMath;

public class CountDigits {
    public static void main(String[] args) {
        int n = 1234;
        int ans = countDigits(n);
        System.out.println(ans);
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

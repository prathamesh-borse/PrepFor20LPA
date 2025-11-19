package Day4.Recursion;

public class CountdigitsUsingRecursion {
    public static void main(String[] args) {
        int n = 12345;
        int digits = countDigits(n);
        System.out.println(digits);
    }

    private static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }
}

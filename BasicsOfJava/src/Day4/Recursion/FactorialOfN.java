package Day4.Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int n = 10;
        int result = factorialOfN(n);
        System.out.println(result);
    }

    static int factorialOfN(int n) {
        if (n == 1) return 1;
        return n * factorialOfN(n - 1);
    }
}

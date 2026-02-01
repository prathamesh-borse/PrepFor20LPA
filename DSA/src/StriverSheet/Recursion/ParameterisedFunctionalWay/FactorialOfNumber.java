package StriverSheet.Recursion.ParameterisedFunctionalWay;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorialParameterised(n, 1);
        System.out.println(ans);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    private static int factorialParameterised(int i, int fact) {
        if (i == 0) {
            return fact;
        }
        return factorialParameterised(i - 1, fact * i);
    }
}

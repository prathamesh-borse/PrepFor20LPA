package StriverSheet.Recursion.RecursionRevision.LevelOne;

public class FactorialOfN {
    public static void main(String[] args) {
        int n = 5;
        int factorialOfN = printFactorialOfNParameterised(n, 1);
        System.out.println(factorialOfN);
    }

    private static int printFactorialOfNParameterised(int i, int fact) {
        if (i == 0) {
            return fact;
        }
        return printFactorialOfNParameterised(i - 1, fact * i);
    }

    private static int printFactorialOfN(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * printFactorialOfN(n - 1);
    }
}

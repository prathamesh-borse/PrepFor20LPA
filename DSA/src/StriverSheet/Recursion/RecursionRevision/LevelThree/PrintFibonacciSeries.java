package StriverSheet.Recursion.RecursionRevision.LevelThree;

public class PrintFibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(printFibonacciSeries(i) + " ");
        }
    }

    private static int printFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacciSeries(n - 1) + printFibonacciSeries(n - 2);
    }
}

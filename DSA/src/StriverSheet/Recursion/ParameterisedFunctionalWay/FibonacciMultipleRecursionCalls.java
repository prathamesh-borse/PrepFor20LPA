package StriverSheet.Recursion.ParameterisedFunctionalWay;

public class FibonacciMultipleRecursionCalls {
    public static void main(String[] args) {
        int n = 5;
        int ans = printFibonacciNumberMultipleRecursionCalls(n);
        System.out.println(ans);
    }

    private static int printFibonacciNumberMultipleRecursionCalls(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacciNumberMultipleRecursionCalls(n - 1) + printFibonacciNumberMultipleRecursionCalls(n - 2);
    }
}

package StriverSheet.Recursion.ParameterisedFunctionalWay;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 3;
        int ans = printSumOfNNumbersFunctional(n);
        System.out.println(ans);
    }

    private static void printSumOfNNumbers(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        printSumOfNNumbers(i - 1, sum + i);
    }

    private static int printSumOfNNumbersFunctional(int n) {
        if (n == 0) {
            return 0;
        }
        return n + printSumOfNNumbersFunctional(n - 1);
    }
}

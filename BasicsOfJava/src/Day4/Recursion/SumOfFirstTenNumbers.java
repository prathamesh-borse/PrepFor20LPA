package Day4.Recursion;

import java.util.Scanner;

public class SumOfFirstTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int result = printSum(n, sum);
        System.out.println(result);
    }

    static int printSum(int n, int sum) {
        if (n > 10) {
            return sum;
        }

        sum = sum + n;
        return printSum(n + 1, sum);
    }
}

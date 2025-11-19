package Day4.Recursion;

import java.util.Scanner;

public class FindNthFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0, 1, 1, 2, 3, 5, 8
        int n = scanner.nextInt();
        int result = findFib(n);
        System.out.println(result);
    }

    static int findFib(int n) {
        if (n < 2) return n;
        return findFib(n - 1) + findFib(n - 2);
    }
}

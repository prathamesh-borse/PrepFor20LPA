package Day4.Recursion;

import java.util.Scanner;

public class PrintFirstFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printfiveNumbers(n);
    }

    static void printfiveNumbers(int n) {
        if (n == 5) { // base condition; where function execution will break
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printfiveNumbers(n + 1);
    }
}

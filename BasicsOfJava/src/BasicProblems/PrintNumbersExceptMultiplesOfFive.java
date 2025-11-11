package BasicProblems;

import java.util.Scanner;

public class PrintNumbersExceptMultiplesOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

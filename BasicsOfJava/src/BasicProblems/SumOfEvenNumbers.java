package BasicProblems;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Your sum is: " + sum);
    }
}

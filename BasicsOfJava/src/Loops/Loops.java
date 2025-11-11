package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q. Print numbers 1 to 5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        // using while loop
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int i = 1;
//        while (i <= n) {
//            System.out.println(i);
//            i++;
//        }

        // using do while loop
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= n);
    }
}

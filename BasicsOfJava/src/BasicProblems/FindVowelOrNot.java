package BasicProblems;

import java.util.Scanner;

public class FindVowelOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char c = input.next().charAt(0);

        switch (c) {
            case 'A', 'E', 'O', 'U', 'I' -> System.out.println("Your character " + c + " is vowel");
            case 'a', 'e', 'o', 'u', 'i' -> System.out.println("Your entered character " + c + " is vowel");
            default -> System.out.println("Please recheck your entered character");
        }
    }
}

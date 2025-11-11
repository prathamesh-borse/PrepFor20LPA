package BasicProblems;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = input.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = input.nextInt();

        System.out.println("Please choose operation you want to perform: +, -, *, /");
        char operator = input.next().charAt(0);
        int result;

        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.println("Your Addition result is: " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Your Subtraction result is: " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Your Multiplication result is: " + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println("Your Division result is: " + result);
                break;
            default:
                System.out.println("Please choose operation like: +, -, *, /");

        }
    }
}

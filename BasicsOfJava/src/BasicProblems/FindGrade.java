package BasicProblems;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("A+");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}

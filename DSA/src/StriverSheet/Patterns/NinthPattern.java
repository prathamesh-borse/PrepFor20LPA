package StriverSheet.Patterns;

// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
public class NinthPattern {
    public static void main(String[] args) {
        // diamond pattern
        for (int i = 0; i < 5; i++) {
            // space, star, space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            // space, star, space
            int reversedRow = 5 - i - 1;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * reversedRow + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

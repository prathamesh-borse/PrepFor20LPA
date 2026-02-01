package StriverSheet.Patterns;

public class TenthPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // star, space
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            // star, space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 2 * 5 - 1; i++) {
            int stars = i;
            if (i > 5) stars = 2 * 5 - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

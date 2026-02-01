package StriverSheet.Patterns;

public class TwelvePattern {
    public static void main(String[] args) {
        int space = 2 * (5 - 1);
        for (int i = 1; i < 5; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            space -= 2;
            System.out.println();
        }
    }
}

package StriverSheet.Patterns;

public class FourteenPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                // character print and increase character
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

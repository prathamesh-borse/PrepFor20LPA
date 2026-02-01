package StriverSheet.Patterns;

public class SeventiethPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }

            //character
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

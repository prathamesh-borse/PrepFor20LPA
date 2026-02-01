package StriverSheet.Recursion.BasicPrograms;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 1;
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if (n == 6) { // Base Condition
            return;
        }
        System.out.println("Number: " + n);
        n++;
        printOneToN(n);
    }
}

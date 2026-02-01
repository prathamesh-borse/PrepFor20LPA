package StriverSheet.Recursion.BasicPrograms;

public class PrintLinearOneToN {
    public static void main(String[] args) {
        int n = 5;
        printLinearOneToN(1, n);
    }

    private static void printLinearOneToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printLinearOneToN(i + 1, n);
    }
}

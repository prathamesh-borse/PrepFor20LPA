package StriverSheet.Recursion.RecursionRevision.LevelOne;

public class PrintNumbersOneToN {
    public static void main(String[] args) {
        int n = 5;
        printNumbersFromOneToN(1, n);
    }

    private static void printNumbersFromOneToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        i++;
        printNumbersFromOneToN(i, n);
    }
}

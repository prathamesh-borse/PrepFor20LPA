package StriverSheet.Recursion.RecursionRevision.LevelOne;

public class PrintNumbersNToOne {
    public static void main(String[] args) {
        int n = 5;
        printNumbersNToOne(n);
    }

    private static void printNumbersNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        n--;
        printNumbersNToOne(n);
    }
}

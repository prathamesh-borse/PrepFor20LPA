package StriverSheet.Recursion.BasicPrograms;

public class PrintNToOneBacktrack {
    public static void main(String[] args) {
        int n = 5;
        printLinearNToOneBacktrack(1, n);
    }

    private static void printLinearNToOneBacktrack(int i, int n) {
        if (i > n) {
            return;
        }

        printLinearNToOneBacktrack(i + 1, n);
        System.out.println(i);
    }
}

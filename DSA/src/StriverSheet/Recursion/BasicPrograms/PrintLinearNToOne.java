package StriverSheet.Recursion.BasicPrograms;

public class PrintLinearNToOne {
    public static void main(String[] args) {
        int n = 5;
        printLinearNToOne(n);
    }

    private static void printLinearNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n--;
        printLinearNToOne(n);
    }

    private static void printLinearNToOneStriver(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printLinearNToOneStriver(i - 1, n);
    }
}

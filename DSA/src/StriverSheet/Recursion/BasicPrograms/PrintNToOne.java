package StriverSheet.Recursion.BasicPrograms;

public class PrintNToOne {
    public static void main(String[] args) {
        int n = 5;
//        printNToOne(5, n);
        printNToOneMyApproach(n);
    }

    private static void printNToOneMyApproach(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n--;
        printNToOneMyApproach(n);
    }

    private static void printNToOne(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printNToOne(i - 1, n);
    }
}

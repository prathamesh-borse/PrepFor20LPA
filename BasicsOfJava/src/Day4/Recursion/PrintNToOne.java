package Day4.Recursion;

// Tail Recursion = Work Done before recursive call
public class PrintNToOne {
    public static void main(String[] args) {
        int n = 10;
        printNToOne(n);
    }

    static void printNToOne(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNToOne(n - 1);
    }
}

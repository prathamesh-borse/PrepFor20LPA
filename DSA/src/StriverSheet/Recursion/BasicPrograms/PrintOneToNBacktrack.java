package StriverSheet.Recursion.BasicPrograms;

public class PrintOneToNBacktrack {
    public static void main(String[] args) {
        int n = 3;
        printLinearOneToNBacktrack(n, n);
    }

    private static void printLinearOneToNBacktrack(int i, int n) {
        if (i < 1) {
            return;
        }
        printLinearOneToNBacktrack(i - 1, n);
        System.out.println(i);
    }
}

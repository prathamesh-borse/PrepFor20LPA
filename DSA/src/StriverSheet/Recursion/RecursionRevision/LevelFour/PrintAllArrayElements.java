package StriverSheet.Recursion.RecursionRevision.LevelFour;

public class PrintAllArrayElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        printAllArrayElements(a, 0);
    }

    private static void printAllArrayElements(int[] a, int i) {
        int n = a.length;
        if (i >= n) {
            return;
        }
        System.out.print(a[i] + " ");
        printAllArrayElements(a, i + 1);
    }
}

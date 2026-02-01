package StriverSheet.Recursion.RecursionRevision.LevelFour;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 56, 3, 45, 100};
        boolean ans = checkArrayIsSortedOrNot(a, 1);
        System.out.println(ans);
    }

    private static boolean checkArrayIsSortedOrNot(int[] a, int i) {
        int n = a.length;
        // base case = if i reached the end of the array we will return true;
        if (i == n) {
            return true;
        }

        // we are checking for each pair, if it is sorted or not we will return false
        if (a[i] < a[i - 1]) {
            return false;
        }

        // increment the i (index)
        return checkArrayIsSortedOrNot(a, i + 1);
    }
}

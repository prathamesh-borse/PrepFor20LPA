package StriverSheet.Recursion.RecursionRevision.LevelFour;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 45, 100};
        boolean ans = findElementUsingRecursion(a, 90, 0);
        System.out.println(ans);
    }

    private static boolean findElementUsingRecursion(int[] a, int ele, int i) {
        int n = a.length;
        if (i >= n) {
            return false;
        }
        if (a[i] == ele) {
            return true;
        }
        return findElementUsingRecursion(a, ele, i + 1);
    }
}

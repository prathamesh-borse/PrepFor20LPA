package StriverSheet.Recursion.RecursionRevision.LevelFour;

public class FindMinElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 45, 100};
        int minEle = Integer.MAX_VALUE;
        int ans = findMinElement(a, 0, minEle);
        System.out.println(ans);
    }

    private static int findMinElement(int[] a, int i, int minEle) {
        int n = a.length;
        if (i >= n) {
            return minEle;
        }
        if (a[i] < minEle) {
            minEle = a[i];
        }
        return findMinElement(a, i + 1, minEle);
    }
}

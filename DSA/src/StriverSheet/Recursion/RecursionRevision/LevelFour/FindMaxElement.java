package StriverSheet.Recursion.RecursionRevision.LevelFour;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 45, 100};
        int maxEle = Integer.MIN_VALUE;
        int ans = findMaxElement(a, 0, maxEle);
        System.out.println(ans);
    }

    private static int findMaxElement(int[] a, int i, int maxEle) {
        int n = a.length;
        if (i >= n) {
            return maxEle;
        }
        if (a[i] > maxEle) {
            maxEle = a[i];
        }
        return findMaxElement(a, i + 1, maxEle);
    }
}

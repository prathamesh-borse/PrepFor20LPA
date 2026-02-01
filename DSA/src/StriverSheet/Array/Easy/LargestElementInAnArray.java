package StriverSheet.Array.Easy;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2, 10, 50, 300};
        int ans = findMaxElement(arr);
        System.out.println(ans);
    }

    private static int findMaxElement(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}

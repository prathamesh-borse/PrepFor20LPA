package StriverSheet.Array.Easy;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}

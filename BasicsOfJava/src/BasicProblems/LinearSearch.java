package BasicProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 30, 3, 20, 50, 80};
        int target = 80;

        boolean result = findTargetNumber(arr, target);
        System.out.println("Result: " + result);
    }

    static boolean findTargetNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}

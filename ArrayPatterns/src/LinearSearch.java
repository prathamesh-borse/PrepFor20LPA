public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, -6, 14, 3, 18, 30};
        int index = linearSearchInRange(arr, 18, 1, 5);
        System.out.println(index);
    }

    // linear search in a range
    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

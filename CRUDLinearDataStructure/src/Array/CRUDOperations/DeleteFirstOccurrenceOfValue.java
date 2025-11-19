package Array.CRUDOperations;

public class DeleteFirstOccurrenceOfValue {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 10;

        int n = arr.length;
        int ele = 10;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = idx; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }


        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

package Array.CRUDOperations;

public class DeleteAllOccurrenceOfValue {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 2;

        int n = arr.length;
        int size = n;
        int ele = 2;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                size--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

package Array.CRUDOperations;

public class InsertElementAtTheBeginning {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 8;
        arr[4] = 10;

        int pos = 1;
        int size = 5;
        // when inserting array element at the beginning we need to traverse array element from right to left till the
        // 0th element
        // when inserting array element at the specific index we need to traverse elements from right to till the position
        // where we want to insert element and use arr[pos] = 10;
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = 20;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

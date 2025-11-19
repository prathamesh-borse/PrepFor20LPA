package Array.CRUDOperations;

public class CountOccurrencesOfValue {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 1;

        int size = 5;
        int count = 0;
        int ele = 1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }

        System.out.println(count);
    }
}

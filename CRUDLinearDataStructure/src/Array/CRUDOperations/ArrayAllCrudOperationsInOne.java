package Array.CRUDOperations;

public class ArrayAllCrudOperationsInOne {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 10;
        arr[4] = 20;

        System.out.println("Before Inserting Element: ");
        printArray(arr);

        int[] insertElementAtBeginning = insertElementAtBeginning(arr);
        printArray(insertElementAtBeginning);

        int[] insertElementAtSpecificIndex = insertElementAtSpecificIndex(arr);
        printArray(insertElementAtSpecificIndex);

        int[] insertElementAtTheEnd = insertElementAtTheEnd(arr);
        printArray(insertElementAtTheEnd);

        int[] deleteElementFromSpecificIndex = deleteElementFromSpecificIndex(arr);
        printArray(deleteElementFromSpecificIndex);

        int[] deleteElementFirstOccurrence = deleteElementFirstOccurrence(arr);
        printArray(deleteElementFirstOccurrence);

        int[] deleteElementAllOccurrence = deleteElementAllOccurrence(arr);
        printArray(deleteElementAllOccurrence);

    }

    static int[] insertElementAtBeginning(int[] arr) {
        int size = 5;
        int pos = 0;
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = 20;
        return arr;
    }

    static int[] insertElementAtSpecificIndex(int[] arr) {
        int size = 5;
        int pos = 1;
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = 23;
        return arr;
    }

    static int[] insertElementAtTheEnd(int[] arr) {
        arr[arr.length - 1] = 30;
        return arr;
    }

    static int[] deleteElementFromSpecificIndex(int[] arr) {
        int size = 5;
        int pos = 1;
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }

    static int[] deleteElementFirstOccurrence(int[] arr) {
        int idx = -1;
        int n = arr.length;
        int ele = 10;
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
        return arr;
    }

    static int[] deleteElementAllOccurrence(int[] arr) {
        int ele = 10;
        int n = arr.length;
        int size = n;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                size--;
            }
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

package Array.CRUDOperations;

import java.util.Scanner;

public class DeleteArrayElementsInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number of elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Enter the position from which you want to delete the element
        int pos = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[pos] = -1;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

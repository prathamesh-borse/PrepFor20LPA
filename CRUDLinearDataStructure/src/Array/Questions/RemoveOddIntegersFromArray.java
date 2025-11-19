package Array.Questions;

import java.util.Scanner;

public class RemoveOddIntegersFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements which you want to insert in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = removeOddIntegers(arr);
        printArray(result);

    }

    static int[] removeOddIntegers(int[] arr) {
        int n = arr.length;
        int evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        int idx = 0;
        int[] result = new int[evenCount];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

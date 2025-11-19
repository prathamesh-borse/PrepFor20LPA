package Array.Questions;

import java.util.Scanner;

public class RemoveEvenIntegersFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number of elements which you want to insert in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = removeIntegers(arr);
        printArrayDemo(result);

    }

    static int[] removeIntegers(int[] arr) {
        int n = arr.length;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    static void printArrayDemo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

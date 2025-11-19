package Array.CRUDOperations;

import java.util.Scanner;

public class CreateArrayInJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n]; // 5 size array will be created, index will start from 0

        System.out.println("Enter the number of elements you want to insert: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Read array elements and print it on the console
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

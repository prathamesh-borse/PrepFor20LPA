package Day2.Codes;

import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            // for every row ask user how many cols it wants
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];

            // now, ask user for the values which he/she wanted to insert in that row
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe Jagged Array is:");
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}

package Day2.Codes;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int row = scanner.nextInt();
//        int col = scanner.nextInt();

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }

        }
        // arr[row].length = individual size of the row only that we need
        /* suppose we have below example of 2d array
        {
            {1,2,3},
            {4,5},
            {6,7,8}
        }

        then in this our first loop will iterate till 3 (which is no. of rows)
        second for loop will be going execute till the size of row so
        -> outer loop -> for(int i=0;i<row;i++)
        -> inner loop -> for(int j=0;j<arr[row].length;j++) // we are doing because in 2d array every row is an array itself

         */

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*
        When taking 2D Arrays input from user
        -> In 2D Array each row is itself is an array, By using arr[row].length we are getting the specific length(number of column) of an array
        -> Because in java, The 2D array can be a jagged array means the number of columns will be different than the number of rows
        -> Each row, in 2D row can be of three column, two columns or anything.
         */

    }
}

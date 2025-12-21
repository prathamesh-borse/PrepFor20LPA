import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 10, 30, 40},
                {12, 34, 17},
                {21, 56, 20, 9}
        };

        int[] ans = searchInTwoD(arr, 40);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInTwoD(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

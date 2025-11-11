package BasicProblems;

public class SmallestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 15, 3};
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number from the array is: " + smallest);
    }
}

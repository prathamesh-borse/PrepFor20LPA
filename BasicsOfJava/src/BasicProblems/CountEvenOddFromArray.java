package BasicProblems;

public class CountEvenOddFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 5, 7, 12, 14, 20};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even Count: " + countEven);
        System.out.println("Odd Count: " + countOdd);
    }
}

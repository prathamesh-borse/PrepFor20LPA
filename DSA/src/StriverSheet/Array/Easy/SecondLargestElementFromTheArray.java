package StriverSheet.Array.Easy;

public class SecondLargestElementFromTheArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = getSecondLargest(arr);
        System.out.println(secondLargest);
    }

    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int slargest = -1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

//    private static int getSecondLargest(int[] arr) {
//        // code here
//        int largest = findLargest(arr);
//        int slargest = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > slargest && arr[i] != largest) {
//                slargest = arr[i];
//            }
//        }
//        return slargest;
//    }

    private static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

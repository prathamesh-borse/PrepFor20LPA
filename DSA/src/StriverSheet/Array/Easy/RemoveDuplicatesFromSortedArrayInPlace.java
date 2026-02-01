package StriverSheet.Array.Easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 5};
        int ans = removeDuplicatesInPlaceOptimized(arr);
        System.out.println(ans);
    }

    // Brute Solution : Take set store elements in it, traverse set and add those elements inside array index position
    private static int removeDuplicatesInPlaceBrute(int[] arr) {
        Set<Integer> set = new HashSet<>();

        // Insert unique elements inside set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Traverse set using iterator and retrieve the value using iterator
        // and insert that retrieved value inside the array index which is given and increment it
        int index = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int retrieved = iterator.next();
            arr[index] = retrieved;
            index++;
        }
        return index;
    }

    // Optimized Solution : Take Two Pointers
    // 1. i = is at index 0 position which is unique in itself 2. j = will be at the first unique element which is not equal to first pointer
    private static int removeDuplicatesInPlaceOptimized(int[] arr) {
        int current = 0;
        for (int next = 1; next < arr.length; next++) {
            if (arr[next] != arr[current]) {
                arr[current + 1] = arr[next];
                current++;
            }
        }
        return current + 1;
    }
}

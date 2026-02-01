package StriverSheet.Array.Easy;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        ArrayList<Integer> ans = unionOfTwoSortedArraysOptimal(arr1, arr2);
        System.out.println(Arrays.asList(ans));
    }

    private static ArrayList<Integer> unionOfTwoSortedArraysOptimal(int[] a, int[] b) {
        // code here
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }

    private static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int[] union = new int[set.size()];
        int index = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer retrievedValue = iterator.next();
            union[index] = retrievedValue;
            index++;
        }
        return union;
    }
}

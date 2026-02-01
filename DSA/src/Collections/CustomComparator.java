package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparator {
    public static Comparator<Integer> getComparator() {
        return new Comparator<Integer>() {
            // [num1, num2]
            @Override
            public int compare(Integer num1, Integer num2) {
                // to sort in descending order
                // if num1 < num2 = 1 < 4 < 5 = that means it is ascending order first number is smaller than the other number
                // order is wrong, reverse the order
                if (num1 < num2) {
                    return 1;
                } else if (num1 > num2) { // num1 > num2 = the order is correct no need to do anything
                    return -1;
                }
                // if they are equal, maintain the order
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        System.out.println(arrayList); // currently, this is not sorted
        Collections.sort(arrayList);
        System.out.println(arrayList); // sorting will be done in ascending order but if we want in descending order then
        // custom comparator we need to use [5, 4, 1];
        Collections.sort(arrayList, getComparator());
        System.out.println(arrayList);
    }
}

package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1};
        int[] ans = rearrangeArrayElements(arr);
        System.out.printf(Arrays.toString(ans));
    }

    private static int[] rearrangeArrayElements(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            }else if (arr[i] < 0) {
                neg.add(arr[i]);
            }
        }

        int[] ans = new int[arr.length];
        int n1 = pos.size(), n2 = neg.size();
        int i = 0, j = 0, position = 0;
        while (i < n1 && j < n2) {
            ans[position] = pos.get(i);
            i++;
            position++;
            ans[position] = neg.get(j);
            j++;
            position++;
        }

        while (i < n1) {
            ans[position++] = pos.get(i++);
        }

        while (j < n2) {
            ans[position++] = neg.get(j++);
        }
        System.out.printf(Arrays.toString(ans));
        System.out.println();
        return ans;
    }
}

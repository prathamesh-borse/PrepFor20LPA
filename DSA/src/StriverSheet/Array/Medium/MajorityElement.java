package StriverSheet.Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3};
        int ans = majorityElementOptimal(arr);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    private static int majorityElementBrute(int[] arr) {
        int cnt;
        for (int i = 0; i < arr.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > arr.length / 2) {
                return arr[i];
            }
        }

        return -1;
    }

    // Applying moore voting algorithm
    private static int majorityElementOptimal(int[] arr) {
        int ele = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt++;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                cnt1++;
            }
        }

        if (cnt1 > arr.length / 2) {
            return ele;
        }

        return -1;
    }
}

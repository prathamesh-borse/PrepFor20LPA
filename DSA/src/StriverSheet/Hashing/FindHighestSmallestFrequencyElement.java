package StriverSheet.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindHighestSmallestFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 2, 5, 4};
        int ans = findHighestSmallestElement(arr);
        System.out.println(ans);
    }

    private static int findHighestSmallestElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0, mostFrequent = -1;

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println(freq);
        return mostFrequent;
    }
}

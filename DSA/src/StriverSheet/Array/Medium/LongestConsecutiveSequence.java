package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int ans = longestConsecutiveSequenceBetter(arr);
        System.out.println(ans);
    }

    private static int longestConsecutiveSequenceOptimal(int[] arr) {
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // iterate through every element in the set
        for (int it : set) {
            // if there is no number before it we will start a new sequence
            if (!set.contains(it - 1)) {
                // start a count for this sequence
                int cnt = 1;
                // store the current number
                int x = it;

                // start looking x+1 element inside the set
                while (set.contains(x + 1)) {
                    // move to the next number in the sequence
                    x++;
                    // increment the length of the current sequence
                    cnt++;
                }
                // Update the longest sequence length if needed
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    private static int longestConsecutiveSequenceBetter(int[] arr) {
        Arrays.sort(arr);
        int longest = 1, cntCurrent = 0, lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // here we are checking if current element arr[i] - 1 is equal to lastSmaller element
            // means we are checking if the current element is 100
            // 100 - 1 = 99 == lastSmaller[99 == lastSmaller] ahe ka nsel tr mg tithun new sequence star krayacha ahe
            if (arr[i] - 1 == lastSmaller) {
                cntCurrent++;
                lastSmaller = arr[i];
            }
            // if the currentElement is not equal to lastSmaller element, then we start a new sequence
            else if (arr[i] != lastSmaller) {
                cntCurrent = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, cntCurrent);
        }
        return longest;
    }

    private static boolean linearSearch(int[] arr, int ele) {
        for (int j : arr) {
            if (j == ele) {
                return true;
            }
        }
        return false;
    }

    private static int longestConsecutiveSequenceBrute(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x + 1)) {
                x++;
                cnt++;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}

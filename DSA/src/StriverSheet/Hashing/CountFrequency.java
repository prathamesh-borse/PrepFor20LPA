package StriverSheet.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1, 3, 2, 1, 3};
        int n = a.length;
        int[] countFrequency = countFrequency(a, n);

        int q = scanner.nextInt();
        while (q-- > 0) {
            int number = scanner.nextInt();
            if (number < countFrequency.length) {
                System.out.println(countFrequency[number]);
            } else {
                System.out.println(0);
            }
        }

        System.out.println(Arrays.toString(countFrequency));
    }

    private static int[] countFrequency(int[] a, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++; // for every element we have to go to that index and increment the index
        }
        return freq;
    }
}

package Day3.Problems;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(isPalindromeString(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverseString = stringBuilder.reverse();
        String reversedString = reverseString.toString();

        if (str.equals(reversedString)) {
            return true;
        }
        return false;
    }

    static boolean isPalindromeString(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

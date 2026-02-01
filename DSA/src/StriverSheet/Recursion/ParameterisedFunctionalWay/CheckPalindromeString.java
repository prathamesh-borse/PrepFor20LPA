package StriverSheet.Recursion.ParameterisedFunctionalWay;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        int left = 0, right = str.length() - 1;
        char[] charArray = str.toCharArray();
//        String ans = reverseString(charArray, str, left, right);

        boolean ans = checkStringPalindromeOrNot(str, 0);
        System.out.println(ans);
    }

    private static String reverseString(char[] charArray, String str, int left, int right) {
        if (left >= right) {
            return str;
        }
        swap(charArray, left, right);
        String newString = String.valueOf(charArray);
        return reverseString(charArray, newString, left + 1, right - 1);
    }

    private static void swap(char[] str, int left, int right) {
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }

    private static boolean checkStringPalindromeOrNot(String str, int i) {
        int n = str.length();
        if (i >= n / 2) return true;
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return checkStringPalindromeOrNot(str, i + 1);
    }
}

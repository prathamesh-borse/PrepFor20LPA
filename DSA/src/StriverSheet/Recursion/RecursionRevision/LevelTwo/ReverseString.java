package StriverSheet.Recursion.RecursionRevision.LevelTwo;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String copy = str;
        char[] charArray = str.toCharArray();
        char[] chars = copy.toCharArray();
        int left = 0, right = charArray.length - 1;
        String newStr = reverseString(charArray, left, right);
        System.out.println(newStr);

        String ans = reverseStringOneVariable(chars, 0);
        System.out.println(ans);
    }

    private static String reverseStringOneVariable(char[] chars, int i) {
        int n = chars.length;
        String ansString = String.valueOf(chars);
        if (i >= n / 2) {
            return ansString;
        }
        swap(chars, i, n - i - 1);
        return reverseStringOneVariable(chars, i + 1);
    }

    private static String reverseString(char[] chars, int left, int right) {
        String ansString = String.valueOf(chars);
        if (left >= right) {
            return ansString;
        }
        swap(chars, left, right);
        return reverseString(chars, left + 1, right - 1);
    }

    private static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}

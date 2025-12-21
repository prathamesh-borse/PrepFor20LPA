import java.util.Arrays;

public class ReverseVowelsString {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] charArray = s.toCharArray();
        System.out.println(Arrays.toString(charArray));
        String reverseString = reverseString(s);
        System.out.println(reverseString);

    }

    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            // left pointer
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }

            // right pointer
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }

            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
        }
        return new String(charArray);
    }

    public static boolean isVowel(char c) {
        String str = "aeiouAEIOU";
        return str.indexOf(c) != -1;
    }
}

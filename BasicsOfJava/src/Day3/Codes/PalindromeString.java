package Day3.Codes;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
//        StringBuilder stringBuilder = new StringBuilder(str);
//        StringBuilder reverseString = stringBuilder.reverse();
//        System.out.println(reverseString);
//
//        String reverse = reverseString.toString();
//        System.out.println(reverse);
//
//        if (str.equals(reverse)) {
//            System.out.println("The string is palindrome");
//        } else {
//            System.out.println("The string is not palindrome");
//        }

        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        for (int i = 0; i <= str.length(); i++) {
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

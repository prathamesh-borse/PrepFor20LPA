public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "b";

        boolean ans = backspaceCompare(s, t);
        System.out.println(ans);
    }

    public static boolean backspaceCompare(String s, String t) {
        String s1 = reconstructString(s);
        System.out.println(s1);

        String s2 = reconstructString(t);
        System.out.println(s2);

        return s1.equals(s2);
    }

    public static String reconstructString(String s) {
        StringBuilder actualString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (actualString.length() > 0) {
                    actualString.deleteCharAt(actualString.length() - 1);
                }
            } else {
                actualString.append(ch);
            }
        }
        return actualString.toString();
    }
}

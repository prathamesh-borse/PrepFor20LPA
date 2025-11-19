package Day3.Codes;

public class SBCharacterSeries {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder = builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}

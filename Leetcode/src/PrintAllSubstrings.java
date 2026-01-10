import java.util.ArrayList;
import java.util.List;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String s = "abcabcbb";
        List<String> stringList = printAllSubstrings(s);
        System.out.println(stringList);
    }

    public static List<String> printAllSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                list.add(s.substring(i, j + 1));
            }
        }
        return list;
    }
}

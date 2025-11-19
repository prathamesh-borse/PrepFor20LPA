package Day3.Problems;

public class CountVowelsInString {
    public static void main(String[] args) {
        String vowels = "aeoiuAEIOU";
        String str = "Prathamesh";
        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            // here I was confused means how to convert character to string
            // 1. String.valueOf(ch); // we can use this to convert character to a string
            // 2. "" + ch; // this also we can use to convert character to a string
            // 3. Character.toString(ch); // this a third way to any character to a string
            if (vowels.contains(Character.toString(ch))) {
                count++;
            }
        }
        System.out.println("Total vowels present is: " + count);
    }
}

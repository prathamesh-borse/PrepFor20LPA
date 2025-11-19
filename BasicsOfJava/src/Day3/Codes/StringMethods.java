package Day3.Codes;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "         Prat ha me sh B or s e               ";
        System.out.println("Original String: " + name);
        System.out.println("Character Array: " + Arrays.toString(name.toCharArray()));
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("Length: " + name.length());
        System.out.println("Char At: " + name.charAt(3));
        System.out.println("Print String from specific index: " + name.indexOf('r', 0));
        System.out.println("String Contains: " + name.contains("B"));
        System.out.println("Replace String: " + name.replace("Borse", "Barke"));
        System.out.println("Split String: " + Arrays.toString(name.split("")));
        // Trim = is used for to remove starting and ending whitespaces from the string
        System.out.println("Trim:" + name.trim());
    }
}

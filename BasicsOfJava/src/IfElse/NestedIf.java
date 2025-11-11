package IfElse;

public class NestedIf {
    public static void main(String[] args) {
        int count = 15;

        if (count >= 10) {
            System.out.println("count is equal to ten");
            if (count >= 11) {
                System.out.println("count is greater than eleven");
            }
        }
    }
}

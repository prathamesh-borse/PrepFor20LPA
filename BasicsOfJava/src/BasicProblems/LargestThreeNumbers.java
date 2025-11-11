package BasicProblems;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int n3 = 30;

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is greater than all other numbers");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is greater than all other numbers");
        } else {
            System.out.println(n3 + " is greater than all other numbers");
        }
    }
}

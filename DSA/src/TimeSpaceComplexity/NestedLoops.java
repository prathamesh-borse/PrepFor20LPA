package TimeSpaceComplexity;

public class NestedLoops {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}

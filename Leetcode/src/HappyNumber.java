import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = squareNumber(n);
        }
        return true;
    }

    public static int squareNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int no = n % 10;
            sum += no * no;
            n = n / 10;
        }
        return sum;
    }
}

package StriverSheet.BasicMath;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 34, cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            System.out.println("Number is prime number");
        }else {
            System.out.println("Number is not prime");
        }
    }
}

package StriverSheet.BasicMath;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        int n = 1101;
        String ans = numberisArmStrongORNot(n);
        System.out.println(ans);
    }

    private static String numberisArmStrongORNot(int n) {
        int copyOfN = n;
        int temp = n;
        int numberOfDigits = 0;
        while (n != 0) {
            numberOfDigits++;
            n /= 10;
        }

        int sum = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, numberOfDigits);
            temp /= 10;
        }

        if (copyOfN == sum) {
            return "Number is Armstrong number";
        }
        return "Number is not armstrong number";
    }
}

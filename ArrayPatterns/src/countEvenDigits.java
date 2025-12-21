// leetcode 1295
public class countEvenDigits {
    public static void main(String[] args) {
        int[] arr = {555, 901, 482, 1771};
        int ans = countDigitsEven(arr);
        System.out.println(ans);
    }

    static int countDigitsEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (countEven(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean countEven(int num) {
        int count = reduceDigit(num);
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    static int reduceDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}

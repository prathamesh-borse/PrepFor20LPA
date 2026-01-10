package POTD;

import java.util.ArrayList;
import java.util.List;

public class FourDivisors {
    public static void main(String[] args) {
        int[] nums = {7286, 18704, 70773, 8224, 91675};
//        List<Integer> ans = calculateDivisorsOfNumber(n);
        int result = sumFourDivisorsOptimized(nums);
        System.out.println(result);
//        System.out.println(Arrays.asList(ans));
    }

    public static List<Integer> calculateDivisiors(int n) {
        List<Integer> result = new ArrayList<>();
        // instead of storing divisors in a list we use count to count them
        // as soon as count == 4 then do not any extra divisors just break from the loop


        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (result.size() > 4) {
                break;
            }
            if (n % i == 0) {
                if (i == n / i) {
                    result.add(i);
                } else {
                    result.add(i);
                    result.add(n / i);
                }
            }
        }
        return result;
    }

    public static int sumFourDivisors(int[] nums) {
        int n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> allDivisorsForANumber = calculateDivisiors(nums[i]);
            if (allDivisorsForANumber.size() == 4) {
                for (int j = 0; j < allDivisorsForANumber.size(); j++) {
                    sum += allDivisorsForANumber.get(j);
                }
            }
        }
        return sum;
    }

    public static int sumFourDivisorsOptimized(int[] nums) {
        int total = 0;
        for (int x : nums) {
            int count = 0, sum = 0;
            for (int j = 1; j * j <= x; j++) {
                if (x % j == 0) {
                    if (j == x / j) {
                        count++;
                        sum += j;
                    } else {
                        count += 2;
                        sum += j + x / j;
                    }
                }

                if (count > 4) {
                    break;
                }
            }
            if (count == 4) {
                total += sum;
            }
        }
        return total;
    }
}

package StriverSheet.Recursion.RecursionRevision.LevelOne;

public class FindSumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 3;
        int ans = findSumOfFirstNNumbersMyApproach(n);
        System.out.println(ans);
    }

    private static int findSumOfFirstNNumbersMyApproach(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumOfFirstNNumbersMyApproach(n - 1);
    }

    private static void findSumOfFirstNNumbers(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        findSumOfFirstNNumbers(i - 1, sum + i);
    }
}

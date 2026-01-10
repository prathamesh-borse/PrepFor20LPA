package POTD;

public class NumberOfWaysToPaint {
    public static void main(String[] args) {
        int n = 5000;
        final int MOD = 1000000007;
        // memo[n][prev] = number of ways for n remaining columns after pattern prev
        Long[][] memo = new Long[0][];

        // 12 possible first rows
        String states[] = {"RYG", "RGY", "RYR", "RGR", "YRG", "YGR", "YGY", "YRY", "GRY", "GYR", "GRG", "GYG"};

        int ans = numOfWays(n, MOD, states, memo);
        System.out.println(ans);
    }

    public static int solve(int n, int prev, int M, String[] states, Long[][] memo) {
        if (n == 0) return 1;

        if (memo[n][prev] != null)
            return memo[n][prev].intValue();

        long result = 0;
        String last = states[prev];

        for (int curr = 0; curr < 12; curr++) {
            if (curr == prev) continue;
            String currPattern = states[curr];
            boolean conflict = false;
            for (int col = 0; col < 3; col++) {
                if (currPattern.charAt(col) == last.charAt(col)) {
                    conflict = true;
                    break;
                }
            }

            if (!conflict) {
                result = (result + solve(n - 1, curr, M, states, memo)) % M;
            }
        }
        memo[n][prev] = result;
        return (int) result;
    }

    public static int numOfWays(int n, int M, String[] states, Long[][] memo) {
        memo = new Long[n + 1][12];
        long result = 0;

        for (int i = 0; i < 12; i++) { // choosing 1st row
            // now remaining n-1 rows painting
            result = (result + solve(n - 1, i, M, states, memo)) % M;
        }
        return (int) result;
    }
}

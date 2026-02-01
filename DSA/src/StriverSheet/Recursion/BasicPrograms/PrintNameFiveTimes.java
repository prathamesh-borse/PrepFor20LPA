package StriverSheet.Recursion.BasicPrograms;

public class PrintNameFiveTimes {
    public static void main(String[] args) {
        int n = 5;
        printNameFiveTimesStriver(1, n);
    }

    private static void printNameFiveTimes(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Prathamesh");
        n--;
        printNameFiveTimes(n);
    }

    private static void printNameFiveTimesStriver(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Prathamesh");
        printNameFiveTimesStriver(i + 1, n);
    }
}

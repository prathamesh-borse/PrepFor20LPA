package StriverSheet.Recursion.RecursionRevision.LevelOne;

public class PrintNameNTimes {
    public static void main(String[] args) {
        String name = "Prathamesh";
        printNameNTimes(name, 5);
    }

    private static void printNameNTimes(String str, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(str);
        n--;
        printNameNTimes(str, n);
    }
}

package Day4.Recursion;

// Head Recursion = Work Done After processing recursive call
public class PrintOneToN {
    public static void main(String[] args) {
        int n = 10;
        printOneToN(n);
    }

    static void printOneToN(int n) {
        if (n == 0)
            return;
        printOneToN(n - 1);
        System.out.print(n + " ");
    }
}

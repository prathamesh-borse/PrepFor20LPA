## Scanner

- Using the Scanner class, we can take input from the user.
- Scanner is a class that specifies an InputStream, and using the object of that class, a variable of that class, we can take input from the user in Java.
- Scanner is in **java.util** package.

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
```
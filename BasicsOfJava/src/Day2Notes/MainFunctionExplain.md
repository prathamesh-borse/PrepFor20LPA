

### Static

- Because we don't want to create and then call the function, and main is the starting point of the Java program.
- Static means only one object is created, and then using the class Main, it is called to execute the program.

### String[]

- This is a String array command line arguments means we can pass arguments in the terminal and use them in our program.
- Here we are printing the 0th argument, which is being passed by the terminal

```java
public class Main{ 
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
```
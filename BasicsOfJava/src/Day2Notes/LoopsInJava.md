## When to choose what loop to use:

- Use the while loop when you don’t know how many times the loop is going to run
- Use the for loop when you know how many times the loop is going to run

## While loop:

A while loop only if the conditions are met, if the condition is true, and then inside block of code inside the while loop will be executed.

```java
public class LoopsInJava {
	public static void main(String[] args) {
		int count = 1;
		while(count != 5) {
			System.out.println(count);
			count++;
		}
	}
}
```

This program will run the count value is 5, once the count value is 5, then the condition becomes false, and the loop will be terminated.

## For loop

```java
public class LoopsInJava {
	public static void main(String[] args) {
		for(int count=1;count!=5;count++) {
			System.out.println(count);
		}
	}
}
```

## Do While Loop

A do-while loop runs at least one time, and the while loop only runs when the condition is met

```java
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i <= n);
	}
}
```
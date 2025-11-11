- Primitive Datatypes cannot be divided further.
- for example: String name = “Prathamesh”; this can be further divider into separate character like
- char name = ‘p’; char  name1 = ‘r’; // like wise we cannot divide the primitive datatypes like
- int, boolean, char, float, double, long
- We have long because sometimes the size of int is not useful, so we have long in Java, same way, double for float.

## Type Casting In Java

When one type of data is assigned to another type of data, the automatic type conversion will take place if the following conditions are place:

1. The two datatypes should be compatible
2. Destination type should be greater than the source type

Whatever you have on the left side, should be greater than the right side.

```java
public class TypeCasting{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float no1 = input.nextFloat();
		float no2 = input.nextFloat();
		
		float sum = no1 + no2;
		
		// int num = no1.nextFloat(); 
		// this will give you an error because int is not greater than float 
		System.out.println(sum);
	}
}
```

## Narrowing Conversion:

You have explicitly do the conversion from int to float.

```java
public class NarrowingTypeCasting{
	public static void main(String[] args) {
		int no1 = (int) (67.78f); // this way you need to explicitly do the conversion 
		System.out.println(no1);
	}
}
```

Pressing the bigger number to a smaller number explicitly.
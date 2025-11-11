

### Array Notes
- An array is a fixed-size data structure
- In the array, we can create the same data type homogeneous values
- We can traverse an array through the index; the array index starts from 0
- We can use the for loop to traverse the array and print all the array elements

```java
public class SimpleArray { 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

This is a simple array with 5 size.
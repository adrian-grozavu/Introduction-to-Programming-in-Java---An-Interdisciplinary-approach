/*
Ch. 1 Arrays
1.4.1
Write a program that declares and initializes an array a[] of size 1000 and
accesses a[1000] . Does your program compile? What happens when you run it?

The program will compile, but will throw a runtime exception when executed
*/

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        // Declare array. Initialization is done automatically (NULL string values)
        String[] a = new String[1000];  
        // Try to access a[1000];
        System.out.println(a[1000]);
    }
}
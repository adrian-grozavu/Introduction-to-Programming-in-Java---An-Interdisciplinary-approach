/*
1.4.4
Write a code fragment that reverses the order of a one-dimensional array
a[] of String values. Do not create another array to hold the result. Hint : Use the
code in the text for exchanging two elements.
*/

public class ArrayReverse {
    public static void main(String[] args) {
        String[] a = {"node.js", "Scala", "Rust", "Swift"};
        // reverse elements order
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[a.length - 1 -i];
            a[a.length - 1 - i] = temp;
        }
        for (int j = 0; j < a.length; j++)
            System.out.println(a[j]);
    }
}
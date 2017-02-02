/*
1.2.14 Write a program that takes two positive integers as command-line argu-
ments and prints true if either evenly divides the other.
*/
public class EvenlyDivide {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        boolean boolDivide = (x % y == 0) || (y % x == 0);
        System.out.println(boolDivide);
    }
}
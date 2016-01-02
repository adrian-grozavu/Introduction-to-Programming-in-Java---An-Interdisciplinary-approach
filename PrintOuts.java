/*
1.2.7
What do each of the following print?
System.out.println(2 + "bc");
System.out.println(2 + 3 + "bc");
System.out.println((2+3) + "bc");
System.out.println("bc" + (2+3));
System.out.println("bc" + 2 + 3);
Explain each outcome.
*/

public class PrintOuts {
    public static void main(String[] args) {
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
        double a = 3.14159;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(8/(int) a);
        System.out.println(8/a);
        System.out.println((int) (8/a));
        System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
    }
}
/*  
Program 1.2.2 Integer Operations
Illustrates basic operations for manipulating integers
*/
public class IntOps {
    public static void main(String[] args) {
        // convert String values on the command-line to int values
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = a * b;  // product
        int q = a / b;
        int r = a % b;  // remainder
        
        System.out.println(a + " * " + b + " = " +p);
        System.out.println(a + " / " + b + " = " +q);
        System.out.println(a + " % " + b + " = " +r);
        System.out.println(a + " = " + q + " * " + b + " + " + r);
    }
}
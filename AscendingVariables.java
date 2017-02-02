/*
1.2.28 Order check. Write a program that takes three double values x , y , and z
as command-line arguments and prints true if the values are strictly ascending or
descending ( x < y < z or x > y > z ), and false otherwise.
*/
public class AscendingVariables {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        
        boolean ascOrderCheck = x < y && y < z;
        boolean descOrderCheck = x > y && y > z;
        boolean orderCheck = ascOrderCheck || descOrderCheck;
        System.out.println(orderCheck);
    }
}
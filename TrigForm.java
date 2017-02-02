/* 1.2 Built-in Types of Data
    Exercise 1.2.2
    Write a program that uses Math.sin() and Math.cos() to check that the
value of cos 2 ␪ + sin 2 ␪ is approximately 1 for any ␪ entered as a command-line argu-
ment. Just print the value. Why are the values not always exactly 1?
*/

public class TrigForm {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double formula = Math.pow(Math.cos(theta), 2) + Math.pow(Math.sin(theta), 2);
        System.out.println(formula);
    }
}
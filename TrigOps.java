/*
Write a program that uses Math.sin() and Math.cos() to check that the
value of cos2 & + sin2 & is approximately 1 for any & entered as a command-line argument.
Just print the value.
*/

public class TrigOps {
	public static void main(String[] args) {
		double theta = Double.parseDouble(args[0]);
		double result = Math.pow(Math.sin(theta), 2) + Math.pow(Math.cos(theta), 2);
		System.out.println("Result is: " + result);
	}
}
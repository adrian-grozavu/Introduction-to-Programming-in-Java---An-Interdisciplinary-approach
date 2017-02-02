/* 1.3.1 Write a program that takes three integer command-line arguments and
prints equal if all three are equal, and not equal otherwise.
*/
public class CommandLineArgs {
	public static void main(String args[]) {
		// parseInt is a class method
		int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		int int3 = Integer.parseInt(args[2]);
		// Test if all 3 numbers are equal
		if (int1 == int2 && int1 == int3)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
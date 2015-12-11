/*
Rewrite TenHellos to make a program Hellos that takes the number of
lines to print as a command-line argument. You may assume that the argument is
less than 1000. Hint: Use i % 10 and i % 100 to determine when to use st, nd, rd, or
th for printing the ith Hello.
*/

public class TenHellos {
	public static void main(String args[]) {
		// Get no. of lines to print
		int numLines = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= numLines; i++) {
			if ((i % 10 == 0) && (i % 100 == 0))
					System.out.println(i + "th " + " hello");
			else if (i % 10 == 1)
				System.out.println(i + "st " + " hello");
			else if (i % 10 == 2)
				System.out.println(i + "nd " + " hello");
			else if (i % 10 == 3)
				System.out.println(i + "rd " + " hello");
			else
				System.out.println(i + "th " + "hello");
			
		}
	}
}
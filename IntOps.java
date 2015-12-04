// Integer multiplication and division

public class IntOps {
	public static void main(String args[]) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// Multiplication
		int p = a * b;
		// Division
		int q = a / b;
		// Reminder
		int r = a % b;

		System.out.println(a + " * " + b + " = " + p);
		System.out.println(a + " / " + b + " = " + q);
		System.out.println(a + " = " + b + " * " + q + r);
	}
}
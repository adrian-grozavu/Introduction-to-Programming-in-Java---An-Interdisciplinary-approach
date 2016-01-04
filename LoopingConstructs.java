// Introduction to Programming in Java - An Interdisciplinary approach

public class LoopingConstructs {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		
		//Print largest powers of two, less than or equal to N
		int v = 1;
		while (v <= N/2)
			v *= 2;
		System.out.println(v);
		
		// Compute a finite sum	1 + 2 + ... + N
		int sum = 0;
		for (int i = 0; i <= N; i++)
			sum += i;
		System.out.println(sum);
		
		// Compute a finite product		1 * 2 *... * N
		int product = 0;
		for (int i = 0; i <= N; i++)
			product *= i;
		System.out.println(product);		
		
	}
}
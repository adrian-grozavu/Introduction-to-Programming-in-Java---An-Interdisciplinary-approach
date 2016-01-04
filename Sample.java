/*
Prints a random sample of M integers
from 0...N-1

M  sample size
N  range
*/
public class Sample {
	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		// permutations of 0 to N-1
		int[] perm = new int[N];
		
		// Initialize permutations
		for (int j = 0; j < N; j++)
			perm[j] = j;
		
		// Take sample, of size M
		for (int i = 0; i < M; i++) {
			// Exchange perm[i] with a random element to its right
			int r = i + (int) (Math.random() * (N - i));
			int t = perm[r];
			perm[r] = perm[i];
			perm[i] = t;
		}
		//Print sample
		for (int i = 0; i < M; i++) {
			System.out.print(perm[i] + " ");
		}
		System.out.println();
	}
}
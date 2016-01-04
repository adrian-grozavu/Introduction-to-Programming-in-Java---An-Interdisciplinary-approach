<<<<<<< HEAD
// Program 1.2.5 Casting to get a random integer

public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();   // generate a random number in the interval [0, 1)
        int n = (int) (r * N);
        System.out.println(n);        
    }
=======
// Casting to get a random integer

public class RandomInt {
	public static void main(String args[]) {
			int N = Integer.parseInt(args[0]);
			double r = Math.random();	// uniform between 0 and 1
			int n = (int) (r * N);	// uniform between 0 and N -1
			
			System.out.println(n);
	}
>>>>>>> 71687e831488162c62883903b3ba2bfc77fe961f
}
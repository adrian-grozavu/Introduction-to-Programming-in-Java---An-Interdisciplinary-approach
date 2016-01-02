// Program 1.2.5 Casting to get a random integer

public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();   // generate a random number in the interval [0, 1)
        int n = (int) (r * N);
        System.out.println(n);        
    }
}
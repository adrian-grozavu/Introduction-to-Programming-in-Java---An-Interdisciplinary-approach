// Program 1.3.3 Computing powers of two

public class PowersOfTwo {
    public static void main(String[] args) {
        // Print the first N powers f two
        // N: loop termination value
        int N = Integer.parseInt(args[0]);
        int v = 1;  // current power of two
        int i = 0;  // loop control counter
        while (i < N) {
            System.out.println(i + " " + v);
            v = 2 * v;
            i = i + 1;
        }    
    }
}
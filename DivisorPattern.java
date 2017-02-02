/*
Print an N-by- N table with an asterisk in row i and column j if either
i divides j, or j divides i.

* * * * * * * 1
* *   *   *   2
*   *     *   3
* *   *       4
*       *     5
* * *     *   6
*           * 7

*/
public class DivisorPattern {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++) {
            // print the i-th line
            for (int j = 1; j <= N; j++) {
                if ((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
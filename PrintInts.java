/*
1.3.8 Write a program that, using one for loop and one if statement, prints the integers from 1,000 to 2,000 with five integers per line. Hint: Use the % operation
*/
public class PrintInts {
	public static void main(String args[]) {
			for (int i = 1000; i <= 2000; i++) {
				System.out.print(i + " ");
				if ((i % 5) == 0)
					System.out.println();
			}
	}
}
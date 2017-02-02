/*
1.4.2 Describe and explain what happens when you try to compile a program
with the following statement:
int N = 1000;
int[] a = new int[N*N*N*N];

NegativeArraySize exception at runtime
array size overflow
*/
public class ArrayOps {
    public static void main(String[] args) {
        int N = 1000;
        int[] a = new int[N*N*N*N];
    }
}
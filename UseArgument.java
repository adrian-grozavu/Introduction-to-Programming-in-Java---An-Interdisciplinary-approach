/* Source code for Ch.1
   Program 1.1.2 Using a command-line argument   
    This program shows a way in which we can control the actions of our programs, by providing an argument at the command-line.
    Doing so allows us to tailor the behavior of a program.  
   */
   
public class UseArgument {
    public static void main(String[] args) {
        System.out.print("Hi ");
        System.out.print(args[0]);
        System.out.print(". How are you?");
    }
}  

/*
Simplify UseArgument by replacing its 3 statements with this single statement:
    System.out.println("Hi, " + args[0] + ". How are you?");
*/
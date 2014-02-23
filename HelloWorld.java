import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[]args)
    {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        s = in.nextLine();
        System.out.printf("Hello, %s.\n", s);
        System.exit(0);
    }
}
        
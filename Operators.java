import java.util.Scanner;


public class Operators
{
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    

    System.out.print("Enter the first number: ");
    
    int x = in.nextInt();
    

    System.out.print("Enter the second number: ");
    
    int y = in.nextInt();

    
    System.out.println(x + " + " + y + " = " + (x + y));

    System.out.println(x + " - " + y + " = " + (x - y));

    System.out.println(x + " * " + y + " = " + (x * y));

    System.out.println(x + " / " + y + " = " + (x / y));

    System.out.println(x + " % " + y + " = " + (x % y));
  }
}


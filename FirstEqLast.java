import java.util.Scanner;


public class FirstEqLast
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    

    System.out.print("Enter a word: ");
    
    String str = in.next();
    
    if (str.charAt(0) == str.charAt(str.length() - 1)) {
        
       System.out.println("Yes");

    }

    else {

       System.out.println("No");
    }
  }
}

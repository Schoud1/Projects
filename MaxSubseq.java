
import java.util.Scanner;


public class MaxSubseq
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

       // Read in a string and print the maximum increasing subsequences
       // in the input string
       // Define the necessary variables and write the algorithm below.

  
    System.out.print("Enter input: "); // This will print out the statement to 
                                       // enter the input

    
    String x = input.next();
    
    int i = 0;
    
    while (i < x.length()) // The while loop will first check how the characters are      			   // ordered in the given output
                           // Then each character will be compared to each other
                           // It will then find the longest increasing sequence 
                           // consisting of characters 
                           // That are increasing in alphabetical order

    {

       int j = i + 1;
      

    while (j < x.length() && x.charAt (j - 1) <= x.charAt(j))

    {

        j++;

    }
      


    String y = x.substring(i, j); // String y will be identified as the longest increasing 
                                  // Sequence in the given input

	i = j;

    System.out.println( "The (longest possible) increasing subsequence: "  + y); 

// This statement will print the results of the while loop of the given input
      
        


      }

   }

}

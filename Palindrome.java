
/**
 * Class Palindrome - check if a word is a palindrome
 * 
 */
public class Palindrome
{
    public static boolean isPalindrome( String s )
    {
       // **********************************************
       //   Write your algorithm inside this method
       // **********************************************
       // Return true   if input s is a palindrome
       // Return false  if input s is NOT a palindrome
       //
       // DO NOT make a Scanner (no input from keyboard used)
       //
       // Algorithm summary:
       //         0           n=s.length()-1
       //    s = "..............."
       //         ^             ^
       //         |             |
       //       s.charAt(i) == s.charAt(j) ???
       //
       // Where should you start i and j ?
       // How can you tell when you are done ???
       // What do you do if s.charAt(i) == s.charAt(j) ???
       // What do you do if s.charAt(i) != s.charAt(j) ???
       //
       // Note: you can use "return(true);" or "return(false);"
       //       to make the method exit immediately with
       //       return value specified.


     int j = s.length();
      
     for (int i = 0; i < (j / 2) + 1; i++)

      {

        if (s.charAt(i) != s.charAt(j - i - 1))

        {

          return false;

      }

      }

          return true;

      }

  

    /* ==========================================================
       Do not change the main method.

       This method will call the "isPalindrome()" method with
       variable string values ("aruba", "abba", and so on)
       and print the result
       ========================================================== */
    public static void main(String[] args)
    {
       String x;
       boolean r;

       x = "aruba";
       r = isPalindrome(x);
       System.out.println("String '"+x+"' is a palindrome: "+r);

       x = "abba";
       r = isPalindrome(x);
       System.out.println("String '"+x+"' is a palindrome: "+r);

       x = "deified";
       r = isPalindrome(x);
       System.out.println("String '"+x+"' is a palindrome: "+r);

       x = "kayak";
       r = isPalindrome(x);
       System.out.println("String '"+x+"' is a palindrome: "+r);

       x = "atlanta";
       r = isPalindrome(x);
       System.out.println("String '"+x+"' is a palindrome: "+r);

    }
}



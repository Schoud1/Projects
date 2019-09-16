


public class TestOverlap
{
   // Write the overlap() method here

public static boolean overlap(String s1, int i, String s2)

   {
    
    for (int j = 0; i < s1.length(); j++)

    {
        if (s1.charAt(i) != s2.charAt(j))

        {
            
            return false;

        }
        
        i++;
        
        }
        
        return true;

    }


   public static void main(String[] args)

   {
      String x1, x2;
      int i, j;

      x1 = "abcabcab"; x2 = "abcabc";

//        first s1Start position (= 2)
//            v
//          01234567
//          abcabcab
//            abcabc
//
//        last s1Start position (= 7)
//                 v
//          01234567
//          abcabcab
//                 abcabc
//
      for ( i = 2; i < 8; i++ )
      {
         System.out.println();
         System.out.println( x1 );    // Print x1 with no leading spaces
         for ( j = 0; j < i; j++ )
            System.out.print( " " );  // Print i leading spaces
         System.out.println( x2 );    // Then print x2

         System.out.print( "Overlap: " );
         if ( overlap( x1, i, x2 ) )
            System.out.println( " **** YES ! " );
         else
            System.out.println( " no " );
      }
   }
}


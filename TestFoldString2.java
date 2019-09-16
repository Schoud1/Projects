



public class TestFoldString2
{

   public static void main(String[] args)
   {
      String s, o;
      
      s = "a";
      o = Fold.foldString(s);
      o = Fold.unfoldString(o);
      System.out.print( "s = " + s + ", unfolded(fold(s)) = " + o);
      if ( s.equals(o) )
         System.out.println("    correct");
      else
         System.out.println("  **** INCORRECT");

      s = "ab";
      o = Fold.foldString(s);
      o = Fold.unfoldString(o);
      System.out.print( "s = " + s + ", unfolded(fold(s)) = " + o);
      if ( s.equals(o) )
         System.out.println("    correct");
      else
         System.out.println("  **** INCORRECT");

      s = "abcdefgh";
      o = Fold.foldString(s);
      o = Fold.unfoldString(o);
      System.out.print( "s = " + s + ", unfolded(fold(s)) = " + o);
      if ( s.equals(o) )
         System.out.println("    correct");
      else
         System.out.println("  **** INCORRECT");

      s = "abcdefghi";
      o = Fold.foldString(s);
      o = Fold.unfoldString(o);
      System.out.print( "s = " + s + ", unfolded(fold(s)) = " + o);
      if ( s.equals(o) )
         System.out.println("    correct");
      else
         System.out.println("  **** INCORRECT");
   }
}

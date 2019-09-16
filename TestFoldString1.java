



public class TestFoldString1
{

   public static void main(String[] args)
   {
      String s, o;
      
      s = "a";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("a") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );

      s = "ab";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("ab") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );

      s = "abc";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("acb") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );

      s = "abcd";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("adbc") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );

      s = "abcdegh";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("ahbgced") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );

      s = "abcdefghi";
      o = Fold.foldString(s);
      System.out.print( "s = " + s + ", folded = " + o );
      if ( o.equals("aibhcgdfe") )
         System.out.println( "  correct" );
      else
         System.out.println( " *** INCORRECT !!!" );
   }
}

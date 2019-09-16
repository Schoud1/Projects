



import java.awt.*;
import java.awt.image.*;

public class PlotSin
{

   static public void main(String[] args) throws Exception
   {
      final int YELLOW = 0xFFFF00;
      final int RED    = 0xFF0000;
      final int BLACK  = 0x000000;

      /* ------------------------------------------------
         Preparing to draw picture...
         ------------------------------------------------ */
      MyCanvas pic = new MyCanvas();        // Make a canvas (2 dim array)
      Frame f = new Frame( "My image" );    // Create a window

      f.add("Center", pic);                 // Put the canvas in the window
      f.setSize(400,300);                   // Set size of the window
      f.setVisible(true);                   // Make window visible 

      int[][] a = new int[400][300];        // This array hold the picture
      int row, col;


      /* ********************************************************
         Put your Java statements to draw the sin plot here

         The Java statement must change the color code in
         the 2-dim array a[][] so that the method
         pic.draw(a) can draw the correct picture
         ******************************************************** */

         for ( col = 0; col < 400; col++ ) // for loop contains conditions

         {

         for (row = 0; row < 300; row++) {   // for loop contains conditions and draws a red line for the x - axis

               a[col][150] = RED;
         }
      }


        for( col = 0; col < 400; col++ )    // for loop contains conditions and 
                                            // draws a line in the whole canvas that's 400 x 300

         {
     
         for (row = 0; row < 300; row++) {   // for loop contains conditions

         
         if (150 = (int) 100 * Math.sin(1(2 * Math.PI * 200) + 200) + 150  ){   // when the condition is true, then the
                                                                                // graph will be drawn in yellow

         Math.round(a); // will convert double to int 

         a[col][row] = YELLOW;

         }
     } 
  }





      /* ----------------------------------------------------------
         This method will draw the picture in the 2-dim array a[][] 
         ---------------------------------------------------------- */
      pic.draw(a);     // Don't touch !
   }
}


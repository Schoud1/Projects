


public class Roulette
{

   public String[] value;
   public String[] color;

   public int outcome;

   /* ================================================
      Task 1: write the constructor
      ================================================ */

   public Roulette( )

   {
    
    String[] X = new String[] {"B","R"};
    
    String[] Y = new String[] {"R","B"};

    value = new String[38];
  
    color = new String[38];

    value[0] = "0";

    color[0] = "G";


    for (int i = 1; i < 37; i++){

    value[i] = String.valueOf(i); 

    if ((i < 11) || (i >= 19 && i < 29)){

    color[i] = Y [i % 2];
    
    }
    
    else if ((i >= 11 && i < 19) || (i >= 29)){ 

    color[i] = X [(i % 2)];
  
}

} 

value[37] = "00";

color[37] = "G";

       

    
   }


   /* ================================================
      Task 2: write the spin() method
      ================================================ */
   public void spin()

   {

    outcome = (int)(Math.random() * (38));

   }


   /* ************************************************
      Task 2b: change the instance variable to  

                   private

      and 

         *** recompile Test1.java and Test2.java ***

      You should get errors 
      (That's OK because the other test programs
      will not access the variables directly !)
      ************************************************ */




   /* ================================================
      Task 3: write the value() method
      ================================================ */
   public String value()

   {
     String Value = value[outcome];
     return Value;
   }

   /* ================================================
      Task 4: write the color() method
      ================================================ */
   public String color()

   {
      String Color = color[outcome];
      return Color;
   }

   /* ================================================
      Task 5: write the toString() method
      ================================================ */
   public String toString() {

   return value[outcome] + " " + color[outcome];
   
   }
}




/*
THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING     
CODE WRITTEN BY OTHER STUDENTS. _Sukhmani_Choudhry_
*/



public class EvalExpr
{
   /* ===========================================================
      Write the method eval(s)

         The sequence of characters containing the expression is PASSED 
         as input parameter char[] s !!!

         DO NOT use Scanner to read in data in this program -
         You MUST use the string PASSED as input parameter.
      =========================================================== */
   public static int eval( char[] s )  
   {

      // The method must return the result, so make sure you use
      // an return statement at the end to return the computed value.

    int x = 0;
    
    boolean operator = true;
    
    String val = "";
    
    for (char j : s) {
        
    if (j == '/') 

    {
        
       System.out.println("Illegal operator: /");
            
       return 0;
            
        } 

    else if(j == '+'){
            
       int y = Integer.parseInt(val);
            
    if (operator == true)

    {
                
       x = x + y;
            
    } else {
            
        x = x - y;
            
    }
   
        operator = true;
    
        val = "";
 
        y = 0;
 
            
                
    } else if (j == '-')
          
    {
                
        int y = Integer.parseInt(val);
                
    if (operator == true)

    {
        x = x + y;
                    
    } else {
                    
        x = x - y;
                    
    }

        operator = false;
                
        val = "";
                
        y = 0;
                
    } else {
                
        val = val + j;
            
    }
            
    }
            
        int y = Integer.parseInt(val);
            
    if (operator == true)

    {
        x = x + y;
                
        } else {
                
        x = x - y;

    }
            
        return x;
            
     }
}
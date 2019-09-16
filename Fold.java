/*
  THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING       
  CODE WRITTEN BY OTHER STUDENTS. _Sukhmani_Choudhry_
*/


public class Fold {
    
        public static String foldString(String s) {
        
	String out = "";

      /* =================================================================
         Write the foldString() algorithm here
         ================================================================= */
       
	int i = 0;
       
       
	int j = s.length() - 1;
         
         
	while (i < j)
       
	{
           
           out = out + s.charAt(i) + s.charAt(j);
           
           i++;

           j--;
          
           
        }

        if (i==j)

        {
 	
	out = out + s.charAt(i);

	}
            
        return out;
    }




   public static String unfoldString(String s) {
        String out = "";
        String out1 = "";
        String out2 = "";

      /* =================================================================
         This is extra work (for serious Computer Science majors)
         Write the unfoldString() algorithm here
         ================================================================= */


        return out;
    }

}

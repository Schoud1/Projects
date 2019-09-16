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




        return out;
    }

}

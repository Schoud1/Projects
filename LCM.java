

/**
 * Class LCM - Least common multiple
 * 
 */
public class LCM
{
    /**
     * This method finds the LCM of a and b
     *
     * @param  x   first input number
     * @param  y   second input number
     * @return     the LCM of x and y
     */
    public static int LCM(int x, int y)
    {
        int ans = 0;    // ans will contain the answer (LCM)

	// For ( cand = start_number ; cand <= end_number; cand ++ )
	// {
	//     test if the number cand is the LCM of x and y
	// }
	//
	// Do NOT create any Scanner, because you do NOT need 
    // to read in x and y from the keyboard.
	// The values of x and y and PASSED in by the method call
    // (See the main() method below)

 
       for (int i = 1; i <= x && i <= y; i++)

       {

           if(x % i == 0 && y % i == 0)

           {

               ans = x * y / i;

           }    

       }

	
       return ans;    // Return the LCM found

       }





	


    /* ==========================================================
       Do not change the main method.

       This method will call the "LCM()" method with various
       numbers: (5,7), (4,6), and so on and print the result
       ========================================================== */
    public static void main(String[] args)
    {
       int a, b, r;

       a = 5; b = 7;
	   r = LCM(a,b);
       System.out.println("LCM of "+a+" and "+b+" = " + r);

       a = 4; b = 6;
	   r = LCM(a,b);
       System.out.println("LCM of "+a+" and "+b+" = " + r);

       a = 6; b = 21;
	   r = LCM(a,b);
       System.out.println("LCM of "+a+" and "+b+" = " + r);

       a = 35; b = 49;
	   r = LCM(a,b);
       System.out.println("LCM of "+a+" and "+b+" = " + r);
    }
}

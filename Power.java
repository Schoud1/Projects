


public class Power {

  public static int power(int j, int n) {
  
  int i = 0;
 
  if (n == 0)

  return 1;
 
  

  else if (n == 1)

  return i;

  

  else {
            
  i = power(j,n / 2);
            
  i = i * i;
             
  if (n % 2 == 0)
                
  return i;

  }

  return j * i;

  }
    

    



  public static void testPower(int a, int n, int G) {
    System.out.print("Calling power(" + a + "," + n + ") ... ");

    int result = power(a, n);

    if (result == G) {
      System.out.println(a + "^" + n + " = " + result + ", good.");
    } else {
      System.out.println(a + "^" + n + " = " + result + ", not " + G + ", ERROR!");
    }
  }

  public static void main(String args[]) {
    testPower(2, 0, 1);
    testPower(5, 0, 1);
    testPower(4, 1, 4);
    testPower(4, 2, 16);
    testPower(2, 3, 8);
    testPower(7, 5, 16807);
    testPower(7, 9, 40353607);

    System.out.println();
  }

}

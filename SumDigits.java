


public class SumDigits {

  public static int sumDigits(int n) {

  if (n == 0)

  return 0;

  return (n % 10 + sumDigits(n/10));


  }

  public static void testSumDigits(int n, int G) {
    System.out.print("Calling sumDigits(" + n + ") ... ");

    int result = sumDigits(n);

    if (result == G) {
      System.out.println("Sum of digits of " + n + " = " + result + ", good.");
    } else {
      System.out.println("Sum of digits of " + n + " = " + result + ",not " + G + ", ERROR!");
    }
  }

  public static void main(String args[]) {
    testSumDigits(0, 0);
    testSumDigits(1, 1);
    testSumDigits(4, 4);
    testSumDigits(13, 4);
    testSumDigits(123, 6);
    testSumDigits(16807, 22);
    testSumDigits(40353607, 28);

    System.out.println();
  }
}

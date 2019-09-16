


public class Scoping {
    static double a = 123;                  /* ....................... line (1) */

    public static void F(double a) {        /* ....................... line (2) */
        System.out.println("------ inside F( double a )");

        /******************************
         * Part 1
         *******************************/

        System.out.print("a at (2) = ");
        // TODO: Write a System.out.println() statement that prints a on line (2)
           System.out.println(a);
        System.out.print("a at (1) = ");
        // TODO: Write a System.out.println() statement that prints a on line (1)
           System.out.println(Scoping.a);
    }

    public static void F(String a) {        /* ....................... line (3) */
        System.out.println("------ inside F( String a ) !!!!!!!!!!!!!!!!");

        /******************************
         * Part 4
         *******************************/

        System.out.print("a at (3) = ");
        // TODO: Write a System.out.println() statement that prints a on line (3)
           System.out.println(a);
        System.out.print("a at (1) = ");
        // TODO: Write a System.out.println() statement that prints a on line (1)
           System.out.println(Scoping.a);
    }


    public static void main(String[] args) {
        double x = -444444444;              /* ....................... line (4) */
        // TODO: Write a method call F() that passes x at line (4)
        F(x);    // I have given you the answer for the first problem.
        {
            double a = 9999;                /* ....................... line (5) */
            
            /******************************
             * Part 2
             *******************************/

            // TODO: Write a method call F() that passes a on line (5)
               F(a);

            // TODO: Write a method call F() that passes a on line (1)

              F(Scoping.a);
        }

        /******************************
         * Part 3
         *******************************/

        // TODO: Write a method call F() that passes x at line (4)
           F(x);

        // TODO: Write a method call F() that passes a on line (5)
           System.out.println("Impossible: Write a method call F() that passes a on line (5) ");
           
        {
            String a = "9999";               /* ....................... line (6) */

            /******************************
             * Part 5
             *******************************/

            // TODO: Write a method call F() that passes x at line (4)
               F(x);

            // TODO: Write a method call F() that passes a on line (6)
               F(a);

            // TODO: Write a method call F() that passes a on line (1)
               F(Scoping.a);
        }
    }
}




import java.util.Scanner;
import java.util.Stack;

public class BaseChanger {
    
    public String convert(int n, int base) {
        
        // TODO: Insert code here...
        
        Stack<Integer> y = new Stack<Integer>();

        String x = "";


        
        while (n != 0)

        {
            y.push(n % base);

            n /= base;

        }

        while (!y.isEmpty())

        {

            x += y.pop();

        }

        return x;

        }
        
    

    public static void main(String[] args) {
        System.out.println("Enter a number to convert and the base to convert it to, separated by a space");
        
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        scanner.close();
        
        int n = Integer.parseInt(inputs[0]);
        int base = Integer.parseInt(inputs[1]);
        
        BaseChanger baseChanger = new BaseChanger();
        System.out.println(baseChanger.convert(n,base));
    }
}




/*
 * This following class can be used to convert from partially parenthesized
 * infix expressions to their equivalent postfix expressions.
 */

import java.util.Scanner;

import java.util.Stack;

public class ShuntingYard {

    public String[][] opsByPrecedence = {{"+","-"},{"*","/"},{"^"}};
    public String[] rightAssociativeOps = {"^"};

    private boolean isOp(String s) {
        for (int i = 0; i < opsByPrecedence.length; i++) {
            for (int j = 0; j < opsByPrecedence[i].length; j++) {
                if (s.equals(opsByPrecedence[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isRightAssociative(String op) {
        for (int i = 0; i < rightAssociativeOps.length; i++) {
            if (op.equals(rightAssociativeOps[i])) {
                return true;
            }
        }
        return false;
    }

    private int getPrecedence(String op) {
        for (int i = 0; i < opsByPrecedence.length; i++) {
            for (int j = 0; j < opsByPrecedence[i].length; j++) {
                if (op.equals(opsByPrecedence[i][j])) {
                    return i;
                }
            }
        }
        throw new RuntimeException("Invalid op specified (" + op + ")");
    }

    public String toPostFix(String expression) {

        String[] tokens = expression.split(" ");
        Stack<String> ops = new Stack<String>();
        String postFixStr = "";

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("(")) {
                ops.push(tokens[i]);
            }
            else if (tokens[i].equals(")")) {
                while (! ops.peek().equals("(")) {
                    postFixStr += ops.pop() + " ";
                }
                ops.pop(); //pop the remaining "(" and throw it away
            }
            else if (! isOp(tokens[i])) {
                postFixStr += tokens[i] + " ";
            }
            else { // tokens[i] is an operator...

             boolean tokenProcessed = false; // we might have some work to do first before
                                                // we can push this token...

                while ( ! tokenProcessed ) {
                    if (ops.isEmpty() || ops.peek().equals("(")) {
                        ops.push(tokens[i]);
                        tokenProcessed = true;
                    }
                    else {
                        String topOp = ops.peek();

                        if ((getPrecedence(tokens[i]) > getPrecedence(topOp)) ||
                            ((getPrecedence(tokens[i]) == getPrecedence(topOp)) &&
                                     isRightAssociative(tokens[i]))) {
                            ops.push(tokens[i]);
                            tokenProcessed = true;
                        }
                        else {
                            postFixStr += ops.pop() + " ";
                        }
                    }
                }
            }
        } //end for loop (all tokens now are in postFixStr or the ops stack now)

        // we finish by moving elements from the stack to postFixStr...
        while (! ops.isEmpty()) {
            postFixStr += ops.pop() + " ";
        }

        return postFixStr;
    }
    
   public String toPreFix(String s) {
    
        String postFixStr = toPostFix(s);
        
        String[] tokens = postFixStr.split(" ");
        Stack<String> ops = new Stack<String>();
        String preFixStr = "";

        for(int i = 0; i < tokens.length; i++) {
            if (! isOp(tokens[i])) { 
                ops.push(tokens[i]);
                
            } 
             else { 
             
                String operand2 = ops.pop();
                String operand1 = ops.pop();
                
                String operator = tokens[i];
                
                switch(operator) { 
                case "+" : ops.push("( + " + operand1 + " " + operand2 + " )"); break;
                case "-" : ops.push("( - " + operand1 + " " + operand2 + " )"); break;
                case "*" : ops.push("( * " + operand1 + " " + operand2 + " )"); break;
                case "/" : ops.push("( / " + operand1 + " " + operand2 + " )"); break;
                case "^" : ops.push("( ^ " + operand1 + " " + operand2 + " )"); break;
                
             }
        }
    }
 
                while (! ops.isEmpty()) {
                preFixStr += ops.pop() + " ";
            }
            
            return preFixStr;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter an infix expression to convert to prefix form:");
        Scanner scanner = new Scanner(System.in);
        String infixStr = scanner.nextLine();
        scanner.close();
        
        ShuntingYard sy = new ShuntingYard();
        System.out.println(sy.toPreFix(infixStr));
    }
}

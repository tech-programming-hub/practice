package practice;// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBrackets {

    // function to check if brackets are balanced
    static int areBracketsBalanced(String expr)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return 0;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return 0;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return 0;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return 0;
                    break;
            }
        }

        // Check Empty practice.Stack
        if (stack.isEmpty()) {
           return 1;
        } else {
            return 0;
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        String expr = "{}";
        System.out.println(areBracketsBalanced(expr));


    }
}
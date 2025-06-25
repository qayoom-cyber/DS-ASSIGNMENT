import java.util.Scanner;
import java.util.Stack;

public class ParenthesesMatcher {

    // Method to check if parentheses are balanced
    public static boolean isParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If opening parenthesis, push to stack
            if (ch == '(') {
                stack.push(ch);
            }
            // If closing parenthesis
            else if (ch == ')') {
                // If stack is empty, there's no matching opening
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the matching opening parenthesis
                stack.pop();
            }
        }

        // If stack is empty, parentheses were balanced
        return stack.isEmpty();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with parentheses: ");
        String input = scanner.nextLine();

        if (isParenthesesBalanced(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are NOT balanced.");
        }

        scanner.close();
    }
}

/*OOUTPUT 
Enter a string with parentheses: (a+b)*(a-b))
The parentheses are NOT balanced.


Enter a string with parentheses: (a+b)(a-b) 
The parentheses are balanced.*/

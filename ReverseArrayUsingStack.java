import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        // Original array
        int[] array = {10, 20, 30, 40, 50};

        // Display original array
        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array using a stack
        reverseArrayUsingStack(array);

        // Display reversed array
        System.out.println("Reversed Array:");
        printArray(array);
    }

    // Method to reverse array using Stack
    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array into the stack
        for (int value : arr) {
            stack.push(value);
        }

        // Pop elements back into the array to reverse it
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

/*OUTPUT
Original Array:
10 20 30 40 50 

Reversed Array:
50 40 30 20 10 */
public class RecursiveArraySum {

    // Recursive method to calculate sum of array elements
    public static int recursiveSum(int[] arr, int index) {
        // Base case: when index reaches the end of the array
        if (index == arr.length) {
            return 0;
        }
        // Recursive case: current element + sum of remaining elements
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3}; // Sample array

        // Call the recursive method starting from index 0
        int sum = recursiveSum(numbers, 0);

        // Output the result
        System.out.println("Sum of array elements: " + sum);
    }
}

/* OUTPUT

{5, 8, 2, 10, 3}
Sum of array elements: 28

 */
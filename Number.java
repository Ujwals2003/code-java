import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Get the number to add
        System.out.print("Enter the number to add: ");
        int numToAdd = scanner.nextInt();

        // Compute result
        int[] result = addNumber(number, numToAdd);

        // Print result
        System.out.print("Result: ");
        printArray(result);
    }

    // Convert a number to an array of digits
    public static int[] convertNumberToArray(int number) {
        // Count the number of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Handle the case when the number is 0
        if (count == 0) {
            return new int[] {0};
        }

        // Create an array to store the digits
        int[] arr = new int[count];

        // Extract digits and store them in the array
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }

        return arr;
    }

    // Add a number to the array of digits
    public static int[] addNumber(int number, int numToAdd) {
        // Convert the number to an array of digits
        int[] arr = convertNumberToArray(number);

        int carry = numToAdd;
        int n = arr.length;

        // Start from the last digit and move to the front
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;  // Store last digit
            carry = sum / 10;   // Compute carry for next position
        }

        // If there is any carry left, expand the array
        if (carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry; // Add the carry to the front

            // Copy the rest of the array manually
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            return newArr;
        }

        return arr; // Return updated array if no extra carry
    }

    // Method to print array of digits
    public static void printArray(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit); // Print each digit directly
        }
        System.out.println(); // Move to the next line after printing
    }
}
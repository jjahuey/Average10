import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Call the method to display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // First, find the smallest, middle, and largest numbers using conditional statements
        double smallest, middle, largest;

        // Compare num1, num2, num3 and assign them to smallest, middle, largest
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
            if (num2 <= num3) {
                middle = num2;
                largest = num3;
            } else {
                middle = num3;
                largest = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
            if (num1 <= num3) {
                middle = num1;
                largest = num3;
            } else {
                middle = num3;
                largest = num1;
            }
        } else {
            smallest = num3;
            if (num1 <= num2) {
                middle = num1;
                largest = num2;
            } else {
                middle = num2;
                largest = num1;
            }
        }

        // Display the numbers in increasing order
        System.out.println("The numbers in increasing order are: " + smallest + ", " + middle + ", " + largest);
    }
}



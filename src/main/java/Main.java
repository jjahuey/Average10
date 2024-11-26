import java.util.*;

public class Main {

    // Method to calculate the average of an array of integers
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length; // Return the integer average
    }

    // Method to calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length; // Return the double average
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 double values
        System.out.println("Enter 10 double values:");
        double[] values = new double[10];

        // Read 10 double values from the user
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextDouble();
        }

        // Invoke the average method for the double array
        double avg = average(values);

        // Display the average value
        System.out.println("The average of the entered values is: " + avg);

        scanner.close();
    }
}

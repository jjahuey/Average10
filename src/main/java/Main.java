import java.util.*;
public class Main {
public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side length
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Calculate the area using the formula
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display the area, rounded to two decimal places
        System.out.printf("The area of the hexagon is %.2f\n", area);
    }
}

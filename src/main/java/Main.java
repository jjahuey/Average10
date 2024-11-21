import java.util.*;
public class Main {
    public static void main(String[] args) {
            // Print the header
            System.out.println("Miles           Kilometers");
            // Loop to display miles and kilometers conversion
            for (int miles = 1; miles <= 10; miles++) {
                // Convert miles to kilometers
                double kilometers = miles * 1.609;
                // Print the miles and the corresponding kilometers
                System.out.printf("%-15d%.3f\n", miles, kilometers);
        }
    }
}
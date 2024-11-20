import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for weight
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt user for height in feet and inches
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to inches
        int totalHeightInInches = (feet * 12) + inches;

        // Conversion factors
        final double KILOGRAMS_PER_POUND = 0.45359237; // 1 pound = 0.45359237 kilograms
        final double METERS_PER_INCH = 0.0254;        // 1 inch = 0.0254 meters

        // Convert weight and height to metric
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = totalHeightInInches * METERS_PER_INCH;

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display BMI
        System.out.printf("BMI is %.15f\n", bmi);

        // Interpret BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}


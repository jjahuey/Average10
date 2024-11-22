import java.util.*;
public class Main {
        public static void main(String[] args) {
            // Initial tuition cost
            double initialTuition = 10000;  // Tuition for the first year
            System.out.printf("Tuition cost: $%.2f\n", initialTuition);

            double annualIncreaseRate = 0.05;  // 5% annual increase
            int years = 10;  // Number of years to calculate the future tuition
            double totalTuitionAfter10Years = initialTuition;  // Tuition after 10 years

            // Calculate tuition after 10 years
            for (int i = 1; i <= years; i++) {
                totalTuitionAfter10Years = totalTuitionAfter10Years * (1 + annualIncreaseRate);  // Increase tuition by 5% each year
            }

            // Output the tuition after 10 years with two decimals
            System.out.printf("Tuition cost increases 5%% every year, so after 10 years: $%.2f\n", totalTuitionAfter10Years);

            // Calculate the total cost of 4 years' worth of tuition starting from the 10th year
            double totalCost4Years = 0;
            for (int j = 0; j < 4; j++) {
                totalCost4Years += totalTuitionAfter10Years;  // Add the tuition for each of the next 4 years
                totalTuitionAfter10Years = totalTuitionAfter10Years * (1 + annualIncreaseRate);  // Increase the tuition by 5% for the next year
            }

            // Output the total cost of four years' tuition after the tenth year with two decimals
            System.out.printf("Total cost of 4 years, tuition after the tenth year: $%.2f\n", totalCost4Years);
        }
}


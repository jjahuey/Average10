public class Main {
    public static void main(String[] args) {
        // Test the sumDigits method
        long number = 234;
        System.out.println("The sum of the digits of " + number + " is: " + sumDigits(number));
    }

    // Method to compute the sum of the digits of a given number
    public static int sumDigits(long n) {
        int sum = 0;

        // Loop to extract and sum each digit
        while (n > 0) {
            sum += n % 10;   // Extract the last digit and add it to sum
            n /= 10;          // Remove the last digit
        }

        return sum;
    }
}


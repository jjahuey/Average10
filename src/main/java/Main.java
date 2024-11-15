import java.util.*;


public class Main {
    public static void main(String[] args) 
    {
      // Create a Scanner object to read input from the console
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the subtotal and gratuity rate
      System.out.print("Enter the subtotal and a gratuity rate: ");
      double subtotal = input.nextDouble(); // Read the subtotal
      double gratuityRate = input.nextDouble(); // Read the gratuity       rate
      
      // Calculate the gratuity
      double gratuity = subtotal * gratuityRate / 100;

      // Calculate the total
      double total = subtotal + gratuity;

      // Display the gratuity and total
      System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}

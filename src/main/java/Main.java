import java.util.*;

public class Main {
  public static void main(String[] args) 
    {
      // Create a Scanner object to read input from the console
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter a Celsius value
      System.out.print("Enter a degree in Celsius: ");
      double celsius = input.nextDouble();

      // Convert the Celsius temperature to Fahrenheit
      double fahrenheit = (celsius * 9/5) + 32;

      // Display the result in the desired format
      System.out.println(celsius + " Celsius is " + fahrenheit + 
" Fahrenheit");
    }
  }

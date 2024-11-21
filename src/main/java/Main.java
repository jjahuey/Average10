import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);  // Read a single character

        // Check if the input is a letter (alphabet)
        if (Character.isLetter(letter)) {
            // Convert letter to lowercase for case-insensitive comparison
            letter = Character.toLowerCase(letter);

            // Check if the letter is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            // If the input is not a letter, it's an invalid input
            System.out.println(letter + " is an invalid input");
        }
    }
}


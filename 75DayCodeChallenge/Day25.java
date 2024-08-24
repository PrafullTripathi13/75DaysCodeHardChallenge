
//   WRITE A PROGRAM TO ACCEPT A STRING FROM THE USER AND PRINTS ITS REVERSE :- 

import java.util.Scanner; //  Import the Scanner class for user input

public class Day25

{

    public static void main(String[] args)

    {
        try

        (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a string: "); // Prompt the user for input
            String originalString = scanner.nextLine(); // Read the input string

            String reversedString = ""; // Initialize an empty string to store the reversed result

            for (int i = originalString.length() - 1; i >= 0; i--) // Loop through the original string in reverse order
            {
                char currentChar = originalString.charAt(i); // Extract the character at index i
                reversedString += currentChar; // Append the character to the reversedString
            }

            System.out.println("Original string: " + originalString); // Print the original string
            System.out.println("Reversed string: " + reversedString); // Print the reversed string
        }
    }
}

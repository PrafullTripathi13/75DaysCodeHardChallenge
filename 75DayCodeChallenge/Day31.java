import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            boolean isPangram = isPangram(inputString);
            if (isPangram) {
                System.out.println("The string is a pangram.");
            } else {
                System.out.println("The string is not a pangram.");
            }
        }
    }

    private static boolean isPangram(String s) {
        s = s.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        boolean[] alphabet = new boolean[26];// Use a boolean array to mark presence of letters

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean letterFound : alphabet) {// Check if all letters are present
            if (!letterFound) {
                return false;
            }
        }
        return true;
    }
}

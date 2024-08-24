
// WAP to accept an integer from the user and print the sum of its digits.

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer : ");

            int number = scanner.nextInt();

            int sum = 0;

            while (number > 0) {

                int digit = number % 10; // Extract the last digit using modulo (%)

                sum += digit; // Add the digit to the sum

                number /= 10; // Remove the last digit from the number using division (/)
            }

            System.out.println("Sum of digits: " + sum);
        }
    }
}

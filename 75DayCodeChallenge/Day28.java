
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int even_count = 0;
            int odd_count = 0;

            while (num > 0) {
                int rem = num % 10; // extracting individual digits from the given input value

                if (rem % 2 == 0) { // Checking the ectracted infividual digit is even or odd ?
                    even_count++; // increasing the value by 1.
                } else {
                    odd_count++; // increasing the value by 1.
                }
                num = num / 10; // Eliminating the extracted digits
            }
            System.out.println("Number of Even numbers in the inputed value is : " + even_count);
            System.out.println("Number of Odd numbers in the inputed value is : " + odd_count);
        }

    }
}
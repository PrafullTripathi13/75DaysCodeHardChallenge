import java.util.Scanner;

class Day32 {
    private int number;
    private long factorial;

    public void initialize() { // Initialize the calculator with default values
        number = 0;
        factorial = 1;
    }

    public void inputNumber() { // Input the number from the user
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
        }
        if (number < 0) { // Validate input
            System.out.println("Error: Please enter a non-negative integer.");
            inputNumber(); // Retry input on invalid data
        }
    }

    public void calculateFactorial() { // Calculate the factorial of the number
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }

    public void displayResult() { // Display the calculated factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) { // Main method to run the program
        Day32 calculator = new Day32();
        calculator.initialize();
        calculator.inputNumber();
        calculator.calculateFactorial();
        calculator.displayResult();
    }
}

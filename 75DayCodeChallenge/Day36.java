
import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

            int[][] array = new int[rows][columns];

            System.out.println("Enter values for each row:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter value for row " + (i + 1) + ", column " + (j + 1) + ": ");
                    array[i][j] = scanner.nextInt();
                }
            }
            System.out.println("\n Value Enters in Matrix form:");
            for (int[] row : array) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}

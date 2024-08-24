import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int sum = 0;
            for (int[] row : matrix) {
                for (int element : row) {
                    sum += element;
                }
            }
            double average = (double) sum / (rows * columns);

            System.out.println("Matrix:");
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
}
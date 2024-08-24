import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matrix = new int[3][3];

            System.out.println("Enter the elements of the 3x3 matrix:");
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print("matrix[" + row + "][" + col + "] = ");
                    matrix[row][col] = scanner.nextInt();
                }
            }
            boolean isUnitMatrix = true;
            System.out.println("The inputted matrix is:");
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (row == col && matrix[row][col] != 1) {
                        isUnitMatrix = false;
                        break;
                    }
                    if (row != col && matrix[row][col] != 0) {
                        isUnitMatrix = false;
                        break;
                    }
                }
                if (!isUnitMatrix) {
                    break;
                }
            }
            if (isUnitMatrix) {
                System.out.println("The given matrix is a Unit matrix.");
            } else {
                System.out.println("The given matrix is not a Unit matrix.");
            }
        }
    }
}
import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] marks = new int[3][4];

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the marks for student " + (i + 1) + ":");
                for (int j = 0; j < 4; j++) {
                    System.out.print("Enter the marks for subject " + (j + 1) + ":");
                    marks[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                int totalMarks = 0;
                for (int j = 0; j < 4; j++) {
                    totalMarks += marks[i][j];
                }
                System.out.println("Total marks for student " + (i + 1) + ": " + totalMarks);
            }
        }
    }
}
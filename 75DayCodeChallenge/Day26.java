
// Take an array as input from the user. Search for a given index at which it comes.
// OR
// Linear Search Program :
import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the index you want to search: ");
            int indexToSearch = sc.nextInt();

            // Validate the index
            if (indexToSearch >= 0 && indexToSearch < size) {
                int elementAtIndex = arr[indexToSearch];
                System.out.println("The element at index " + indexToSearch + " is: " + elementAtIndex);
            } else {
                System.out.println("Invalid index. Please enter an index within the array bounds.");
            }
        }
    }
}

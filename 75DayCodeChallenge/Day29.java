import java.util.Arrays;

public class Day29 {
    public static void main(String[] args) {

        int[] originalArray = { 1, 2, 3, 4, 5, 6 };// Array containing initial elements
        int elementToRemove = 3; // Element to be removed.

        int[] newArray = remove(originalArray, elementToRemove);

        System.out.println("Original Array : " + Arrays.toString(originalArray));
        System.out.println("New Array : " + Arrays.toString(newArray));
    }

    public static int[] remove(int[] array, int element) {// Takes an array and element to remove as parameters

        int[] newArray = new int[array.length - 1]; // Creates a new array with one less element to accommodate removal
        int index = 0; // Tracks the index to populate the new array.

        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) { // Checks if the current element is not the one to remove.
                newArray[index] = array[i]; // If not, copy the element to the new array

                index++; // pre-increment index
            }
        }
        return newArray; // Returns the new array after the loop.
    }
}

// OUTPUT OF THE PROGRAM :-

// Original Array : [1, 2, 3, 4, 5, 6]
// New Array : [1, 2, 4, 5, 6]

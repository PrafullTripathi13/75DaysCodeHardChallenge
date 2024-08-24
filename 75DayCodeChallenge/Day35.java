
public class Day35 {

    public static int findUnique(int[] arr) {
        // Handle base case: array with only one element
        if (arr.length == 1) {
            return arr[0];
        }

        // Ensure array size is valid (odd and at least 3)
        if (arr.length % 2 == 0 || arr.length < 3) {
            throw new IllegalArgumentException("Input array must have an odd size of at least 3");
        }
        int unique = 0;

        // Use bit manipulation for efficient XOR calculation
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 6, 3, 6, 2 };
        int[] arr2 = { 4, 5, 6, 7, 8, 4, 4 };
        int[] arr3 = { 1 }; // Handle single-element case

        // Test cases
        System.out.println("Unique number in arr1: " + findUnique(arr1)); // Output: 1
        System.out.println("Unique number in arr2: " + findUnique(arr2)); // Output: 5
        System.out.println("Unique number in arr3: " + findUnique(arr3)); // Output: 1
    }
}

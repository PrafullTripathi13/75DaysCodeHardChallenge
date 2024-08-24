
import java.util.*;

class Day40 {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);
                    break;
                }
            }
        }
        return intersection;
    }

    public static void printResult(int[] arr1, int[] arr2, List<Integer> intersection) {
        System.out.printf("%nIntersection between %s and %s:", Arrays.toString(arr1), Arrays.toString(arr2));
        System.out.println(Arrays.toString(intersection.stream().mapToInt(Integer::intValue).toArray()));
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 4, 6, 8, 10 };

        List<Integer> intersection = findIntersection(arr1, arr2);
        printResult(arr1, arr2, intersection);
    }
}
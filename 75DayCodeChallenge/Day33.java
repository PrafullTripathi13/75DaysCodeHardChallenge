import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Select a figure: 1. Cube 2. Cuboid 3. Cylinder");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the side length of the cube: ");
                    double side = input.nextDouble();
                    System.out.println("Volume of the cube is: " + calculateVolume(side));
                    break;
                case 2:
                    System.out.println("Enter the length, width, and height of the cuboid: ");
                    double length = input.nextDouble();
                    double width = input.nextDouble();
                    double height = input.nextDouble();
                    System.out.println("Volume of the cuboid is: " + calculateVolume(length, width, height));
                    break;
                case 3:
                    System.out.println("Enter the radius and height of the cylinder: ");
                    double radius = input.nextDouble();
                    double cylinderHeight = input.nextDouble();
                    System.out.println("Volume of the cylinder is: " + calculateVolume(radius, cylinderHeight));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static double calculateVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

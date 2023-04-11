import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select a shape to calculate area and perimeter:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the radius of the Circle: ");
                    double circleRadius = scanner.nextDouble();
                    Circle circle = new Circle(circleRadius);
                    System.out.println("Area of Circle: " + circle.getArea());
                    System.out.println("Perimeter of Circle: " + circle.getPerimeter());
                }
                case 2 -> {
                    System.out.print("Enter the side1 of the Triangle: ");
                    double triangleSide1 = scanner.nextDouble();
                    System.out.print("Enter the side2 of the Triangle: ");
                    double triangleSide2 = scanner.nextDouble();
                    System.out.print("Enter the side3 of the Triangle: ");
                    double triangleSide3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);
                    System.out.println("Area of Triangle: " + triangle.getArea());
                    System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
                }
                case 3 -> {
                    System.out.print("Enter the length of the Rectangle: ");
                    double rectangleLength = scanner.nextDouble();
                    System.out.print("Enter the width of the Rectangle: ");
                    double rectangleWidth = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
                    System.out.println("Area of Rectangle: " + rectangle.getArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

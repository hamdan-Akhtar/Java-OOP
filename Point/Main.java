

public class Main {
    public static void main(String[] args) {

        // Creating first point
        Point p1 = new Point(10, 20);

        // Creating second point
        Point p2 = new Point(5, 3);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        // Addition
        Point addition = p1.add(p2);
        System.out.println("Addition: " + addition);

        // Subtraction
        Point subtraction = p1.subtract(p2);
        System.out.println("Subtraction: " + subtraction);

        // Copy constructor
        Point copy = new Point(p1);
        System.out.println("Copy of Point 1: " + copy);
    }
}
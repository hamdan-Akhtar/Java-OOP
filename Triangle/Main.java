

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(2, 4);

        Triangle triangle = new Triangle(p1, p2, p3);

        triangle.display();

        System.out.println(triangle);

        Triangle triangleCopy = new Triangle(triangle);

        System.out.println("\nCopied Triangle:");
        triangleCopy.display();
    }
}


public class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    // Addition of two points
    public Point add(Point obj) {
        return new Point(this.x + obj.x, this.y + obj.y);
    }

    // Subtraction of two points
    public Point subtract(Point obj) {
        return new Point(this.x - obj.x, this.y - obj.y);
    }

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString()
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
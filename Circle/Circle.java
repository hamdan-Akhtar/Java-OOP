import java.util.Arrays;

public class Circle implements Cloneable {
    private String label;
    private Point[] points;

    public Circle(String label, Point[] source) {
        this.label = label;
        this.points = new Point[source.length];
        for (int i = 0; i < source.length; i++) {
            this.points[i] = new Point(source[i]); // deep copy from source
        }
    }

    public Point getPoint(int index) {
        if (index < 0 || index >= points.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return points[index];
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone(); // shallow copy
    }

    public Circle deepCopy() {
        try {
            Circle copy = (Circle) super.clone();
            copy.points = new Point[this.points.length];
            for (int i = 0; i < this.points.length; i++) {
                copy.points[i] = new Point(this.points[i]);
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
     return label+Arrays.toString(points);
    }
}
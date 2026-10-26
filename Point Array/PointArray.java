import java.util.Arrays;

public class PointArray implements Cloneable {
    private Point[] points;

    public PointArray(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = points[i]; // store references
        }
    }

    public Point getPoint(int index) {
        if (index < 0 || index >= points.length) throw new IndexOutOfBoundsException();
        return points[index];
    }

    @Override
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray) super.clone();
    }

    public PointArray deepCopy() {
        try {
            PointArray copy = (PointArray) super.clone();
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
    return Arrays.toString(points);
    }
}
public class Matrix implements Cloneable {
    private int rows;
    private int columns;
    private int[] data;

    public Matrix(int rows, int columns, int[] source) {
        if (rows <= 0 || columns <= 0) throw new IllegalArgumentException();
        if (source.length != rows * columns) throw new IllegalArgumentException();
        this.rows = rows;
        this.columns = columns;
        this.data = new int[source.length];
        System.arraycopy(source, 0, this.data, 0, source.length);
    }

    public int get(int row, int column) {
        checkIndex(row, column);
        return data[row * columns + column];
    }

    public void set(int row, int column, int value) {
        checkIndex(row, column);
        data[row * columns + column] = value;
    }

    private void checkIndex(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Matrix clone() throws CloneNotSupportedException {
        return (Matrix) super.clone();
    }

    public Matrix deepCopy() {
        try {
            Matrix copy = (Matrix) super.clone();
            copy.data = new int[this.data.length];
            System.arraycopy(this.data, 0, copy.data, 0, this.data.length);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int r = 0; r < rows; r++) {
            sb.append("[");
            for (int c = 0; c < columns; c++) {
                sb.append(data[r * columns + c]);
                if (c < columns - 1) sb.append(", ");
            }
            sb.append("]");
            if (r < rows - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
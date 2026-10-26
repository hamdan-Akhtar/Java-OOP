
import java.util.Arrays;

public class Car implements Cloneable {
    private String model;
    private Driver driver;
    private int[] speedHistory;

    public Car(String model, String driverName, int driverId) {
        this.model = model;
        this.driver = new Driver(driverName, driverId);
        this.speedHistory = new int[2];
    }

    public void drive() {
        setSpeed(0, 0);
    }

    public void drive(int speed) {
        setSpeed(1, speed);
    }

    public void setSpeed(int index, int speed) {
        if (index < 0 || index >= speedHistory.length) throw new IndexOutOfBoundsException();
        speedHistory[index] = speed;
    }

    public int getSpeed(int index) {
        if (index < 0 || index >= speedHistory.length) throw new IndexOutOfBoundsException();
        return speedHistory[index];
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public Car deepCopy() {
        try {
            Car copy = (Car) super.clone();
            copy.driver = new Driver(this.driver);
            copy.speedHistory = new int[this.speedHistory.length];
            System.arraycopy(this.speedHistory, 0, copy.speedHistory, 0, this.speedHistory.length);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return model + ", driver=" + driver + ", speeds=" + Arrays.toString(speedHistory);
    }
}
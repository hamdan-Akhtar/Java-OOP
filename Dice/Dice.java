import java.util.Random;

public class Dice {
    private int sides;
    private int value;
    private static final Random random = new Random();

    public Dice(int sides) {
        if (sides < 2) {
            throw new IllegalArgumentException("Dice must have at least 2 sides.");
        }
        this.sides = sides;
        this.value = 0;
    }

    public int roll() {
        this.value = random.nextInt(1, this.sides + 1);
        return this.value;
    }

    public int getSides() { return sides; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return "Sides: " + sides + " ," + "Value: " + value;
    }
}
import java.util.Arrays;

public class Player {
    private String name;
    private Dice[] dice;
    private int total;

    public Player(String name, int count, int sides) {
        if (count <= 0) throw new IllegalArgumentException("Number of dice must be positive.");
        this.name = name;
        this.dice = new Dice[count];
        this.total = 0;
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice(sides);
        }
    }

    public void roll() {
        total = 0;
        for (int i = 0; i < dice.length; i++) {
            int value = dice[i].roll();
            System.out.println("Die " + (i + 1) + " = " + value);
            total += value;
        }
    }

    public int getTotal() { return total; }

    public void roll(int index) {
        if (index < 0 || index >= dice.length) throw new IllegalArgumentException("Invalid dice index.");
        total -= dice[index].getValue();
        int newValue = dice[index].roll();
        total += newValue;
        System.out.println("Die " + (index + 1) + " rerolled = " + newValue);
    }

    public void cheatroll() {
        int lower = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            if (dice[i].getValue() < dice[i + 1].getValue()) {
                lower = i;
            }
        }
        total -= dice[lower].getValue();
        int newValue = dice[lower].roll();
        total += newValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(dice) + " " + name + " " + total;
    }
}
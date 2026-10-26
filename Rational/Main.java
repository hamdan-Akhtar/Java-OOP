public class Main {
    public static void main(String[] args) {

        Rational num1 = new Rational(13, 10);
        Rational num2 = new Rational(12, 9);

        System.out.println("Rational 1: " + num1);
        System.out.println("Rational 2: " + num2);

        Rational addition = num1.add(num2);
        System.out.println("Addition: " + addition);

        Rational subtraction = num1.subtract(num2);
        System.out.println("Subtraction: " + subtraction);

        Rational multiplication = num1.multiply(num2);
        System.out.println("Multiplication: " + multiplication);

        Rational division = num1.divide(num2);
        System.out.println("Division: " + division);

        // Copy constructor
        Rational copy = new Rational(num1);
        System.out.println("Copy: " + copy);
    }
}
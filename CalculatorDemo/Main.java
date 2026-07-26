public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     OOP WEEK 1 - CALCULATOR DEMO      ");
        System.out.println("========================================\n");

        // Instantiation: calc is a reference variable pointing to a Calculator object
        Calculator calc = new Calculator();

        System.out.println("--- Basic Operations ---");

        // Normal case: addition
        System.out.println("10 + 5  = " + calc.add(10, 5));

        // Normal case: subtraction
        System.out.println("10 - 5  = " + calc.subtract(10, 5));

        // Normal case: multiplication
        System.out.println("10 x 5  = " + calc.multiply(10, 5));

        // Normal case: division
        System.out.println("10 / 5  = " + calc.divide(10, 5));

        // Edge case: division by zero
        System.out.println("\n--- Edge Case: Division by Zero ---");
        System.out.println("10 / 0  = " + calc.divide(10, 0));

        System.out.println("\n--- Enhanced Operations ---");

        // Normal case: modulus
        System.out.println("10 % 3  = " + calc.modulus(10, 3));

        // Edge case: modulus by zero
        System.out.println("\n--- Edge Case: Modulus by Zero ---");
        System.out.println("10 % 0  = " + calc.modulus(10, 0));

        // Normal case: power
        System.out.println("\n--- Power ---");
        System.out.println("2 ^ 10  = " + calc.power(2, 10));

        // Edge case: anything raised to power 0 equals 1
        System.out.println("5 ^ 0   = " + calc.power(5, 0));

        // Normal case: maximum and minimum
        System.out.println("\n--- Maximum and Minimum ---");
        System.out.println("max(25, 75) = " + calc.maximum(25, 75));
        System.out.println("max(75, 25) = " + calc.maximum(75, 25));
        System.out.println("min(25, 75) = " + calc.minimum(25, 75));
        System.out.println("min(75, 25) = " + calc.minimum(75, 25));

        // Normal case: average using varargs
        System.out.println("\n--- Average (Varargs) ---");
        System.out.println("average(10,20,30,40,50) = " + calc.average(10, 20, 30, 40, 50));
        System.out.println("average(100, 200)       = " + calc.average(100, 200));

        // Edge case: average with no arguments
        System.out.println("\n--- Edge Case: Average with No Arguments ---");
        System.out.println("average() = " + calc.average());

        // Normal case: addMany using varargs
        System.out.println("\n--- Add Many Numbers (Varargs) ---");
        System.out.println("addMany(1 to 10) = " + calc.addMany(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("addMany(50,50,50) = " + calc.addMany(50, 50, 50));

        System.out.println("\n========================================");
        System.out.println("        CALCULATOR DEMO COMPLETE       ");
        System.out.println("========================================");
    }
}s
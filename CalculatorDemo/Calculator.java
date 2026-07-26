public class Calculator {

    // No attributes - this class provides behaviour only, it stores no state

    // Returns the sum of two values
    public double add(double first, double second) {
        return first + second;
    }

    // Returns the difference of two values
    public double subtract(double first, double second) {
        return first - second;
    }

    // Returns the product of two values
    public double multiply(double first, double second) {
        return first * second;
    }

    // Returns the quotient; division by zero is not allowed
    public double divide(double first, double second) {
        if (second == 0) {
            System.out.println("ERROR: Cannot divide by zero.");
            return 0;
        }
        return first / second;
    }

    // Returns the remainder; modulus by zero is not allowed
    public double modulus(double first, double second) {
        if (second == 0) {
            System.out.println("ERROR: Cannot take modulus by zero.");
            return 0;
        }
        return first % second;
    }

    // Returns base raised to the power of exponent
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Returns the larger of two values
    public double maximum(double first, double second) {
        if (first >= second) {
            return first;
        }
        return second;
    }

    // Returns the smaller of two values
    public double minimum(double first, double second) {
        if (first <= second) {
            return first;
        }
        return second;
    }

    // Returns the average of any number of values (varargs)
    public double average(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("ERROR: No numbers provided for average.");
            return 0;
        }
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    // Returns the sum of any number of values (varargs)
    public double addMany(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }
}
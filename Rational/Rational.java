public class Rational {
    private int num;
    private int denom;

    // Default constructor
    public Rational() {
        this.num = 0;
        this.denom = 1;
    }

    // Parameterized constructor
    public Rational(int num, int denom) {

        if (denom == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            this.num= 0;
            this.denom = 1;
        } else {
            this.num = num;
            this.denom = denom;
            reduce();
        }
    }

    // Copy constructor
    public Rational(Rational obj) {
        this.num= obj.num;
        this.denom= obj.denom;
    }

    // Reduce fraction
    private void reduce() {
        int a = Math.abs(this.num);
        int b = Math.abs(this.denom);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        if (gcd != 0) {
            this.num = this.num/ gcd;
            this.denom= this.denom / gcd;
        }

        // Keep negative sign in numerator
        if (this.denom < 0) {
            this.num = -this.num;
            this.denom= -this.denom;
        }
    }

    // Addition
    public Rational add(Rational obj) {
        int newNumerator = (this.num * obj.denom) +
                (obj.num * this.denom);

        int newDenominator = this.denom* obj.denom;

        return new Rational(newNumerator, newDenominator);
    }

    // Subtraction
    public Rational subtract(Rational obj) {
        int newNumerator = (this.num * obj.denom) -
                (obj.num * this.denom);

        int newDenominator = this.denom * obj.denom;

        return new Rational(newNumerator, newDenominator);
    }

    // Multiplication
    public Rational multiply(Rational obj) {
        int newNumerator = this.num * obj.num;

        int newDenominator = this.denom * obj.denom;

        return new Rational(newNumerator, newDenominator);
    }

    // Division
    public Rational divide(Rational obj) {

        if (obj.num == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return new Rational();
        }

        int newNumerator = this.num * obj.denom;

        int newDenominator = this.denom * obj.num;

        return new Rational(newNumerator, newDenominator);
    }

    // toString()
    public String toString() {
        if (this.denom == 1) {
            return "" + this.num;
        }

        return this.num + "/" + this.denom;
    }
}
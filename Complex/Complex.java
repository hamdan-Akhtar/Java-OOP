

public class Complex {
    private double real;
    private double imaginary;

    // Default constructor
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public Complex(Complex obj) {
        this.real = obj.real;
        this.imaginary = obj.imaginary;
    }

    // Addition
    public Complex add(Complex obj) {
        return new Complex(
                this.real + obj.real,
                this.imaginary + obj.imaginary);
    }

    // Subtraction
    public Complex subtract(Complex obj) {
        return new Complex(
                this.real - obj.real,
                this.imaginary - obj.imaginary);
    }

    // Multiplication
    public Complex Multiply(Complex obj) {
        double realPart = (this.real * obj.real) -
                (this.imaginary * obj.imaginary);

        double imaginaryPart = (this.real * obj.imaginary) +
                (this.imaginary * obj.real);

        return new Complex(realPart, imaginaryPart);
    }

    // toString()
    public String toString() {
        if (imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + (-this.imaginary) + "i";
        }
    }
}
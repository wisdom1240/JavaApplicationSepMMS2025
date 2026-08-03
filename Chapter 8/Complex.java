// File: Complex.java
public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex right) {
        return new Complex(this.realPart + right.realPart, this.imaginaryPart + right.imaginaryPart);
    }

    public Complex subtract(Complex right) {
        return new Complex(this.realPart - right.realPart, this.imaginaryPart - right.imaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", realPart, imaginaryPart);
    }
}
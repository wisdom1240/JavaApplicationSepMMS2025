// File: Rational.java
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(1, 1);
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Denominator cannot be 0");
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = (denominator < 0 ? -numerator : numerator) / g;
        this.denominator = Math.abs(denominator) / g;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
    }

    public String toFractionString() {
        return numerator + "/" + denominator;
    }

    public String toFloatString(int digits) {
        return String.format("%." + digits + "f", (double) numerator / denominator);
    }
}
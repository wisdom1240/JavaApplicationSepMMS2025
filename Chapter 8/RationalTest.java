// File: RationalTest.java
public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(1, 3);

        System.out.println("r1 (reduced): " + r1.toFractionString());
        System.out.println("r2: " + r2.toFractionString());

        System.out.println("Addition: " + Rational.add(r1, r2).toFractionString());
        System.out.println("Subtraction: " + Rational.subtract(r1, r2).toFractionString());
        System.out.println("Multiplication: " + Rational.multiply(r1, r2).toFractionString());
        System.out.println("Division: " + Rational.divide(r1, r2).toFractionString());
        System.out.println("Float representation (3 decimals): " + r1.toFloatString(3));
    }
}
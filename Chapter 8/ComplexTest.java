// File: ComplexTest.java
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(9.5, 7.2);
        Complex c2 = new Complex(1.2, 3.4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.subtract(c2));
    }
}
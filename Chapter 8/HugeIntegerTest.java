// File: HugeIntegerTest.java
public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger h1 = new HugeInteger("12345678901234567890");
        HugeInteger h2 = new HugeInteger("98765432109876543210");

        System.out.println("h1: " + h1);
        System.out.println("h2: " + h2);
        System.out.println("Sum: " + h1.add(h2));
        System.out.println("h2 > h1? " + h2.isGreaterThan(h1));
    }
}
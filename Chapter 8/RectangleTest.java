// File: RectangleTest.java
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.printf("Default Rectangle - Perimeter: %.2f, Area: %.2f%n", 
                          rect.calculatePerimeter(), rect.calculateArea());

        rect.setLength(5.5);
        rect.setWidth(4.0);
        System.out.printf("Custom Rectangle - Length: %.2f, Width: %.2f%n", rect.getLength(), rect.getWidth());
        System.out.printf("Custom Rectangle - Perimeter: %.2f, Area: %.2f%n", 
                          rect.calculatePerimeter(), rect.calculateArea());

        try {
            rect.setLength(25.0); // Out of bounds test
        } catch (IllegalArgumentException e) {
            System.out.println("Exception captured: " + e.getMessage());
        }
    }
}
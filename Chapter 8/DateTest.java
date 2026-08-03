// File: DateTest.java
public class DateTest {
    public static void main(String[] args) {
        // Testing incrementing into next month
        Date d1 = new Date(1, 31, 2024);
        System.out.println("Before nextDay: " + d1);
        d1.nextDay();
        System.out.println("After nextDay: " + d1);

        // Testing incrementing into next year
        Date d2 = new Date(12, 31, 2024);
        System.out.println("\nBefore nextDay: " + d2);
        d2.nextDay();
        System.out.println("After nextDay: " + d2);

        // Loop test over month boundary
        System.out.println("\nTesting end of February (Leap Year 2024):");
        Date d3 = new Date(2, 27, 2024);
        for (int i = 0; i < 4; i++) {
            System.out.println(d3);
            d3.nextDay();
        }
    }
}
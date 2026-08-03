// File: DateAndTimeTest.java
public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dt = new DateAndTime(12, 31, 2024, 23, 59, 59);
        System.out.println("Initial DateAndTime: " + dt.toString());

        dt.tick(); // Rollover into next year
        System.out.println("After 1 second tick: " + dt.toString());

        dt.incrementHour();
        System.out.println("After incrementHour: " + dt.toString());
    }
}
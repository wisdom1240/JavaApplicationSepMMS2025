// File: DateTest.java
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(6, 14, 1992);
        Date d2 = new Date("June", 14, 1992);
        Date d3 = new Date(166, 1992);

        System.out.println("Format 1: " + d1.toMMDDYYYY());
        System.out.println("Format 2: " + d2.toMonthDayYear());
        System.out.println("Format 3: " + d3.toDDDYYYY());
    }
}
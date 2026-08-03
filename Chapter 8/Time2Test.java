// File: Time2Test.java
public class Time2Test {
    public static void main(String[] args) {
        Time2 t = new Time2(13, 27, 6);
        System.out.println("Universal Time: " + t.toUniversalString());
        System.out.println("Standard Time: " + t.toString());

        t.setHour(23);
        t.setMinute(59);
        t.setSecond(50);
        System.out.println("Updated Time: " + t.toUniversalString());
    }
}
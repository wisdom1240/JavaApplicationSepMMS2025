// File: Time2Test.java
public class Time2Test {
    public static void main(String[] args) {
        // Case 1: Incrementing into next minute
        Time2 t1 = new Time2(11, 58, 59);
        System.out.println("Initial: " + t1.toString());
        t1.tick();
        System.out.println("After tick: " + t1.toString());

        // Case 2: Incrementing into next hour
        Time2 t2 = new Time2(11, 59, 59);
        System.out.println("\nInitial: " + t2.toString());
        t2.tick();
        System.out.println("After tick: " + t2.toString());

        // Case 3: Incrementing into next day
        Time2 t3 = new Time2(23, 59, 59);
        System.out.println("\nInitial: " + t3.toString() + " (" + t3.toUniversalString() + ")");
        t3.tick();
        System.out.println("After tick: " + t3.toString() + " (" + t3.toUniversalString() + ")");
    }
}
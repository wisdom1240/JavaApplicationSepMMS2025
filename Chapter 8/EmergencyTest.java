// File: EmergencyTest.java
public class EmergencyTest {
    public static void main(String[] args) {
        Emergency e1 = new Emergency("John Doe", "555-0199", "123 Main St", "Structure Fire");
        System.out.println(e1);

        e1.dispatchResponse("Fire Department");
        System.out.println("Updated: " + e1);

        e1.updateStatus("On-Scene");
        System.out.println("Updated: " + e1);
    }
}
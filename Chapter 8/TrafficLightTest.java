// File: TrafficLightTest.java
public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Durations:");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%-7s : %d seconds%n", light, light.getDuration());
        }
    }
}
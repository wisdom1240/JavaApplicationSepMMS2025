// File: TrafficLight.java
public enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);

    private final int duration; // duration in seconds

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
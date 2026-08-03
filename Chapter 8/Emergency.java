// File: Emergency.java
import java.time.LocalDateTime;

public class Emergency {
    private String callerName;
    private String callerPhone;
    private String location;
    private LocalDateTime timeOfReport;
    private String natureOfEmergency;
    private String responseType;
    private String status;

    public Emergency(String callerName, String callerPhone, String location, String natureOfEmergency) {
        this.callerName = callerName;
        this.callerPhone = callerPhone;
        this.location = location;
        this.timeOfReport = LocalDateTime.now();
        this.natureOfEmergency = natureOfEmergency;
        this.responseType = "Pending Assessment";
        this.status = "Reported";
    }

    public void dispatchResponse(String responseType) {
        this.responseType = responseType;
        this.status = "Dispatched";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Emergency [Time: %s | Caller: %s (%s) | Location: %s | Nature: %s | Response: %s | Status: %s]",
                timeOfReport, callerName, callerPhone, location, natureOfEmergency, responseType, status);
    }
}
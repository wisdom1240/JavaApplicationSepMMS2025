// File: Date.java
public class Date {
    private int month;
    private int day;
    private int year;

    private static final String[] monthNames = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] daysPerMonth =
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Format 1: MM/DD/YYYY
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Format 2: "June", 14, 1992
    public Date(String monthName, int day, int year) {
        this.month = convertMonthNameToNumber(monthName);
        this.day = day;
        this.year = year;
    }

    // Format 3: DDD, YYYY (Day of year)
    public Date(int dayOfYear, int year) {
        this.year = year;
        int m = 1;
        while (dayOfYear > daysPerMonth[m]) {
            dayOfYear -= daysPerMonth[m];
            m++;
        }
        this.month = m;
        this.day = dayOfYear;
    }

    private int convertMonthNameToNumber(String mName) {
        for (int i = 1; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(mName)) return i;
        }
        return 1;
    }

    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String toMonthDayYear() {
        return String.format("%s %d, %d", monthNames[month], day, year);
    }

    public String toDDDYYYY() {
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysPerMonth[i];
        }
        return String.format("%03d %d", dayOfYear, year);
    }
}
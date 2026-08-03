import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Birth Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter Birth Day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter Birth Year (e.g., 1995): ");
        int year = input.nextInt();

        System.out.print("Enter Current Year: ");
        int currentYear = input.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("\n========================================");
        System.out.println("HEART RATE ANALYSIS REPORT");
        System.out.println("========================================");
        System.out.printf("Name:                  %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth:         %02d/%02d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Age:                   %d years old%n", person.calculateAge(currentYear));
        System.out.printf("Maximum Heart Rate:    %d bpm%n", person.calculateMaxHeartRate(currentYear));
        System.out.printf("Target Heart Rate Zone: %s%n", person.calculateTargetHeartRate(currentYear));
        System.out.println("========================================");

        input.close();
    }
}
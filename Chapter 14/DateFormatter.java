import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (MM/DD/YYYY): ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        System.out.printf("%s %d, %d%n", months[month], day, year);
    }
}
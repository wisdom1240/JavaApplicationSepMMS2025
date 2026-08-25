import java.util.Scanner;

public class TokenizePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number (555) 555-5555: ");
        String input = scanner.nextLine();

        // Split by non-digit characters
        String[] tokens = input.split("[()\\s-]+");

        // First token is empty if string starts with '('
        int index = tokens[0].isEmpty() ? 1 : 0;
        String areaCode = tokens[index];
        String phoneNumber = tokens[index + 1] + tokens[index + 2];

        System.out.println("Area Code: " + areaCode);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
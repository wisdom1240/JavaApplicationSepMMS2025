import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        System.out.println("Uppercase: " + line.toUpperCase());
        System.out.println("Lowercase: " + line.toLowerCase());
    }
}
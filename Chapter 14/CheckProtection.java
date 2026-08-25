import java.util.Scanner;

public class CheckProtection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dollar amount: ");
        double amount = scanner.nextDouble();

        String formatted = String.format("%.2f", amount);
        StringBuilder protectedAmount = new StringBuilder();

        int leadingAsterisks = 9 - formatted.length();
        for (int i = 0; i < leadingAsterisks; i++) {
            protectedAmount.append("*");
        }
        protectedAmount.append(formatted);

        System.out.println("Check-protected amount: " + protectedAmount);
    }
}
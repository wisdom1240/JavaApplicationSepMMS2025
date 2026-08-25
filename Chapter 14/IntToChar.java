import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer character code: ");
        int code = scanner.nextInt();
        System.out.println("Character: " + (char) code);

        System.out.println("\nGenerating characters for codes 0 to 255:");
        for (int i = 0; i <= 255; i++) {
            System.out.printf("%03d: %c\t", i, (char) i);
            if ((i + 1) % 6 == 0) System.out.println();
        }
    }
}
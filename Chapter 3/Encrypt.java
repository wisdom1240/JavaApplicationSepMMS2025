import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = input.nextInt();

        int d1 = (num / 1000 + 7) % 10;
        int d2 = ((num / 100) % 10 + 7) % 10;
        int d3 = ((num / 10) % 10 + 7) % 10;
        int d4 = (num % 10 + 7) % 10;

        int encrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;

        System.out.println("Encrypted: " + encrypted);
    }
}
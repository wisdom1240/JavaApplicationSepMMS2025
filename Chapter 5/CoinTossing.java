import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {

    private enum Coin { HEADS, TAILS }

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        int choice;

        do {
            System.out.print("Enter 1 to Toss Coin, 2 to see results, 0 to exit: ");
            choice = input.nextInt();

            if (choice == 1) {
                Coin result = flip();
                System.out.println("Result: " + result);

                if (result == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            } else if (choice == 2) {
                System.out.println("Heads: " + headsCount + "   Tails: " + tailsCount);
            }

        } while (choice != 0);

        System.out.println("Final results -> Heads: " + headsCount + "   Tails: " + tailsCount);
        input.close();
    }

    public static Coin flip() {
        int value = randomNumbers.nextInt(2);
        return (value == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
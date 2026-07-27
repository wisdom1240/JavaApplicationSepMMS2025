import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bankBalance = 1000;

        System.out.printf("Starting bank balance: $%.2f%n", bankBalance);

        while (bankBalance > 0) {
            double wager;

            do {
                System.out.print("Enter your wager: $");
                wager = input.nextDouble();

                if (wager > bankBalance) {
                    System.out.println("You don't have that much money. Try again.");
                }
            } while (wager > bankBalance);

            System.out.println(chatter());

            boolean won = playOneGame();

            if (won) {
                bankBalance += wager;
                System.out.println("You win!");
                System.out.printf("New bank balance: $%.2f%n", bankBalance);
            } else {
                bankBalance -= wager;
                System.out.println("You lose!");
                System.out.printf("New bank balance: $%.2f%n", bankBalance);

                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                    break;
                }
            }

            System.out.println(chatter());
            System.out.println();
        }

        System.out.println("Game over.");
        input.close();
    }

    public static boolean playOneGame() {
        int sumOfDice = rollDice();
        Status gameStatus;
        int myPoint = 0;

        switch (sumOfDice) {
            case 7:
            case 11:
                gameStatus = Status.WON;
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("Point is " + myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }

        return (gameStatus == Status.WON);
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.println("Player rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    public static String chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "Feeling lucky today?",
            "The dice are hot tonight!"
        };

        int index = randomNumbers.nextInt(messages.length);
        return messages[index];
    }
}
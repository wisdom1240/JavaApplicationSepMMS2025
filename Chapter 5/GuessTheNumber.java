import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        String playAgain;

        do {
            int numberToGuess = 1 + randomNumbers.nextInt(1000);
            int guess;

            System.out.println("Guess a number between 1 and 1000.");

            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }

            } while (guess != numberToGuess);

            System.out.println("Congratulations. You guessed the number!");

            System.out.print("Play again? (y/n): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        input.close();
    }
}
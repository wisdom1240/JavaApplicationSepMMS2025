import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        String playAgain;

        do {
            int numberToGuess = 1 + randomNumbers.nextInt(1000);
            int guess;
            int guessCount = 0;

            System.out.println("Guess a number between 1 and 1000.");

            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                guessCount++;

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }

            } while (guess != numberToGuess);

            System.out.println("Congratulations. You guessed the number!");

            if (guessCount < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (guessCount == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println("You should be able to do better!");
            }

            System.out.print("Play again? (y/n): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        input.close();
    }
}
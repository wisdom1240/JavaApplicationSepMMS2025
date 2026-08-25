import java.util.Scanner;

public class ThreeLetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = scanner.next();

        if (word.length() != 5) {
            System.out.println("Error: Word must be exactly 5 letters.");
            return;
        }

        System.out.println("Possible three-letter combinations:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println("" + word.charAt(i) + word.charAt(j) + word.charAt(k));
                    }
                }
            }
        }
    }
}
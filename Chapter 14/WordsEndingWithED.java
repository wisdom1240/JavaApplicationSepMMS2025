import java.util.Scanner;

public class WordsEndingWithED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        String[] tokens = text.split("\\s+");
        System.out.println("Words ending with 'ED':");
        for (String token : tokens) {
            if (token.toUpperCase().endsWith("ED")) {
                System.out.println(token);
            }
        }
    }
}
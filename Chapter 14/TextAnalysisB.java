import java.util.Scanner;

public class TextAnalysisB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");
        int[] lengthCounts = new int[20];

        for (String word : words) {
            String cleaned = word.replaceAll("[^a-zA-Z]", "");
            if (cleaned.length() > 0 && cleaned.length() < 20) {
                lengthCounts[cleaned.length()]++;
            }
        }

        System.out.printf("%-15s%-15s%n", "Word length", "Occurrences");
        for (int i = 1; i < lengthCounts.length; i++) {
            if (lengthCounts[i] > 0) {
                System.out.printf("%-15d%-15d%n", i, lengthCounts[i]);
            }
        }
    }
}
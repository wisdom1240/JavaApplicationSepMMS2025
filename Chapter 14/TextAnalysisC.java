import java.util.*;

public class TextAnalysisC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine().toLowerCase();

        String[] words = text.split("\\s+");
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            String cleaned = word.replaceAll("[^a-zA-Z]", "");
            if (!cleaned.isEmpty()) {
                wordCounts.put(cleaned, wordCounts.getOrDefault(cleaned, 0) + 1);
            }
        }

        System.out.printf("%-15s%-15s%n", "Word", "Occurrences");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.printf("%-15s%-15d%n", entry.getKey(), entry.getValue());
        }
    }
}
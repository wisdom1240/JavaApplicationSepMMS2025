import java.util.Scanner;

public class TextAnalysisA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine().toLowerCase();

        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.printf("%c: %d%n", (char)('a' + i), counts[i]);
        }
    }
}
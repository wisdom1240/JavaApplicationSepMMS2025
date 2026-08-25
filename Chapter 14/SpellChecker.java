import java.util.*;

public class SpellChecker {
    private static final List<String> wordList = Arrays.asList("default", "handy", "birthday", "computer", "java");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next().toLowerCase();

        if (wordList.contains(input)) {
            System.out.println("Word is spelled correctly.");
        } else {
            System.out.println("Word is not spelled correctly.");
            checkTranspositions(input);
        }
    }

    private static void checkTranspositions(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            // Transpose adjacent
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;

            String candidate = new String(chars);
            if (wordList.contains(candidate)) {
                System.out.println("Did you mean \"" + candidate + "\"?");
            }

            // Revert swap
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
    }
}
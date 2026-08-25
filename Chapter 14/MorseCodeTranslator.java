import java.util.*;

public class MorseCodeTranslator {
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();

    static {
        char[] chars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
        for (int i = 0; i < chars.length; i++) {
            charToMorse.put(chars[i], codes[i]);
            morseToChar.put(codes[i], chars[i]);
        }
    }

    public static String encode(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') sb.append("  ");
            else if (charToMorse.containsKey(c)) sb.append(charToMorse.get(c)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String decode(String morse) {
        StringBuilder sb = new StringBuilder();
        String[] words = morse.split("   ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                if (morseToChar.containsKey(letter)) sb.append(morseToChar.get(letter));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String text = "HELLO WORLD";
        String encoded = encode(text);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decode(encoded));
    }
}
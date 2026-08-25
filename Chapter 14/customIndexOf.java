public class CustomStringSearch {
    public static int customIndexOf(String text, char ch) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) return i;
        }
        return -1;
    }

    public static int customLastIndexOf(String text, char ch) {
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == ch) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String test = "hello world";
        System.out.println("Custom IndexOf 'o': " + customIndexOf(test, 'o'));
        System.out.println("Custom LastIndexOf 'o': " + customLastIndexOf(test, 'o'));
    }
}
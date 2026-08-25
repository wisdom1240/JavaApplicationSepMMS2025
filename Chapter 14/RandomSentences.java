import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String w1 = article[rand.nextInt(article.length)];
            String w2 = noun[rand.nextInt(noun.length)];
            String w3 = verb[rand.nextInt(verb.length)];
            String w4 = preposition[rand.nextInt(preposition.length)];
            String w5 = article[rand.nextInt(article.length)];
            String w6 = noun[rand.nextInt(noun.length)];

            StringBuilder sentence = new StringBuilder();
            sentence.append(w1).append(" ")
                    .append(w2).append(" ")
                    .append(w3).append(" ")
                    .append(w4).append(" ")
                    .append(w5).append(" ")
                    .append(w6).append(".");

            // Capitalize first character
            sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
            System.out.println(sentence);
        }
    }
}
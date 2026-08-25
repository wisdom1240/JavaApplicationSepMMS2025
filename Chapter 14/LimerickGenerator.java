import java.util.Random;

public class LimerickGenerator {
    public static void main(String[] args) {
        String[] line1And2Rhymes = {"there was a young fellow named Ned", "who slept with a box on his head", "he woke up in bed"};
        String[] line3And4Rhymes = {"it felt quite absurd", "like a flying wild bird"};
        
        Random rand = new Random();
        
        System.out.println(line1And2Rhymes[0]);
        System.out.println(line1And2Rhymes[1]);
        System.out.println(line3And4Rhymes[0]);
        System.out.println(line3And4Rhymes[1]);
        System.out.println(line1And2Rhymes[2]);
    }
}
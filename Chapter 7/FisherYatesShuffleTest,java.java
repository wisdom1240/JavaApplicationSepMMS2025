import java.util.Random;

public class FisherYatesShuffleTest {
    private final Card[] deck;
    private int currentCard;
    private static final Random random = new Random();

    public FisherYatesShuffleTest() {
        deck = new Card[52];
        currentCard = 0;
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(DeckOfCards.FACES[count % 13], DeckOfCards.SUITS[count / 13]);
        }
    }

    // Modern Fisher-Yates (Knuth) Shuffle Algorithm implementation
    public void fisherYatesShuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Pick random index from 0 to i
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        return (currentCard < deck.length) ? deck[currentCard++] : null;
    }

    public static void main(String[] args) {
        FisherYatesShuffleTest deck = new FisherYatesShuffleTest();
        deck.fisherYatesShuffle();

        System.out.println("Deck shuffled using Fisher-Yates Algorithm:");
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-22s", deck.dealCard());
            if (i % 4 == 0) System.out.println();
        }
    }
}
import java.util.Random;

public class EnumDeckTest {
    private final EnumCard[] deck;
    private int currentCard;
    private static final Random random = new Random();

    public EnumDeckTest() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        deck = new EnumCard[52];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new EnumCard(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = random.nextInt(52);
            EnumCard temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public EnumCard dealCard() {
        return (currentCard < deck.length) ? deck[currentCard++] : null;
    }

    public static void main(String[] args) {
        EnumDeckTest myDeck = new EnumDeckTest();
        myDeck.shuffle();

        System.out.println("Dealing 10 cards using Enum-based Deck:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-20s", myDeck.dealCard());
            if (i % 2 == 0) System.out.println();
        }
    }
}
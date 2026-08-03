import java.util.Arrays;

public class PokerHandTest {

    public static int evaluateHand(Card[] hand) {
        int[] faceCounts = new int[13];
        int[] suitCounts = new int[4];

        for (Card card : hand) {
            for (int f = 0; f < DeckOfCards.FACES.length; f++) {
                if (card.getFace().equals(DeckOfCards.FACES[f])) faceCounts[f]++;
            }
            for (int s = 0; s < DeckOfCards.SUITS.length; s++) {
                if (card.getSuit().equals(DeckOfCards.SUITS[s])) suitCounts[s]++;
            }
        }

        boolean flush = false;
        for (int count : suitCounts) {
            if (count == 5) flush = true;
        }

        boolean straight = false;
        for (int i = 0; i <= 8; i++) {
            if (faceCounts[i] == 1 && faceCounts[i+1] == 1 && faceCounts[i+2] == 1 
                && faceCounts[i+3] == 1 && faceCounts[i+4] == 1) {
                straight = true;
                break;
            }
        }

        int pairs = 0;
        boolean threeOfAKind = false;
        boolean fourOfAKind = false;

        for (int count : faceCounts) {
            if (count == 2) pairs++;
            if (count == 3) threeOfAKind = true;
            if (count == 4) fourOfAKind = true;
        }

        if (fourOfAKind) return 7;
        if (threeOfAKind && pairs == 1) return 6; // Full House
        if (flush) return 5;
        if (straight) return 4;
        if (threeOfAKind) return 3;
        if (pairs == 2) return 2;
        if (pairs == 1) return 1;
        return 0; // High Card
    }

    public static String handRankToString(int rank) {
        return switch (rank) {
            case 7 -> "Four of a Kind";
            case 6 -> "Full House";
            case 5 -> "Flush";
            case 4 -> "Straight";
            case 3 -> "Three of a Kind";
            case 2 -> "Two Pairs";
            case 1 -> "One Pair";
            default -> "High Card";
        };
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }

        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println("  " + c);
        int rank1 = evaluateHand(hand1);
        System.out.println("Hand 1 Evaluation: " + handRankToString(rank1));

        System.out.println("\nHand 2:");
        for (Card c : hand2) System.out.println("  " + c);
        int rank2 = evaluateHand(hand2);
        System.out.println("Hand 2 Evaluation: " + handRankToString(rank2));

        System.out.println("\n--- RESULT ---");
        if (rank1 > rank2) {
            System.out.println("Hand 1 Wins!");
        } else if (rank2 > rank1) {
            System.out.println("Hand 2 Wins!");
        } else {
            System.out.println("It's a Tie!");
        }
    }
}
import java.util.Scanner;

public class DealerPokerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        System.out.println("=== 20-GAME POKER SIMULATION AGAINST THE COMPUTER ===");

        for (int game = 1; game <= 20; game++) {
            System.out.println("\n----------------------------------------");
            System.out.printf("GAME %d OF 20%n", game);
            System.out.println("----------------------------------------");

            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();

            Card[] playerHand = new Card[5];
            Card[] dealerHand = new Card[5];

            for (int i = 0; i < 5; i++) {
                playerHand[i] = deck.dealCard();
                dealerHand[i] = deck.dealCard();
            }

            System.out.println("Your Hand:");
            for (int i = 0; i < 5; i++) {
                System.out.printf(" [%d] %s%n", i + 1, playerHand[i]);
            }

            // Player replacement interaction
            System.out.print("How many cards would you like to replace (0-3)? ");
            int numReplace = input.nextInt();
            for (int r = 0; r < numReplace; r++) {
                System.out.print("Enter card index to replace (1-5): ");
                int index = input.nextInt() - 1;
                if (index >= 0 && index < 5) {
                    playerHand[index] = deck.dealCard();
                }
            }

            // Dealer AI replacement strategy
            int dealerRankBefore = PokerHandTest.evaluateHand(dealerHand);
            if (dealerRankBefore < 4) { // Replace cards if less than Straight
                int replaceCount = (dealerRankBefore == 3) ? 1 : ((dealerRankBefore == 1) ? 3 : 3);
                for (int d = 0; d < replaceCount; d++) {
                    dealerHand[d] = deck.dealCard();
                }
                System.out.printf("Dealer replaced %d card(s).%n", replaceCount);
            } else {
                System.out.println("Dealer kept all 5 cards.");
            }

            int pRank = PokerHandTest.evaluateHand(playerHand);
            int dRank = PokerHandTest.evaluateHand(dealerHand);

            System.out.println("\nYour Final Hand: " + PokerHandTest.handRankToString(pRank));
            System.out.println("Dealer's Final Hand: " + PokerHandTest.handRankToString(dRank));

            if (pRank > dRank) {
                System.out.println("-> YOU WIN GAME " + game + "!");
                playerWins++;
            } else if (dRank > pRank) {
                System.out.println("-> DEALER WINS GAME " + game + "!");
                dealerWins++;
            } else {
                System.out.println("-> TIE GAME!");
                ties++;
            }
        }

        System.out.println("\n========================================");
        System.out.println("FINAL 20-GAME TOURNAMENT SCOREBOARD");
        System.out.println("========================================");
        System.out.printf("Player Wins: %d%nDealer Wins: %d%nTies:        %d%n", playerWins, dealerWins, ties);
        
        if (playerWins > dealerWins) {
            System.out.println("CONGRATULATIONS! You beat the computer overall!");
        } else if (dealerWins > playerWins) {
            System.out.println("The computer dealer won the tournament!");
        } else {
            System.out.println("The tournament ended in a overall draw!");
        }

        input.close();
    }
}
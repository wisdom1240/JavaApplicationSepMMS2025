import java.util.Random;

public class KnightsTourBruteForce {
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tourLengths = new int[65];

        for (int tour = 0; tour < 1000; tour++) {
            int[][] board = new int[8][8];
            int currentRow = rand.nextInt(8);
            int currentColumn = rand.nextInt(8);
            int moves = 1;
            board[currentRow][currentColumn] = moves;

            boolean done = false;
            while (!done) {
                int[] validMoves = new int[8];
                int validCount = 0;

                for (int m = 0; m < 8; m++) {
                    int nextR = currentRow + vertical[m];
                    int nextC = currentColumn + horizontal[m];
                    if (nextR >= 0 && nextR < 8 && nextC >= 0 && nextC < 8 && board[nextR][nextC] == 0) {
                        validMoves[validCount++] = m;
                    }
                }

                if (validCount == 0) {
                    done = true;
                } else {
                    int chosenMove = validMoves[rand.nextInt(validCount)];
                    currentRow += vertical[chosenMove];
                    currentColumn += horizontal[chosenMove];
                    moves++;
                    board[currentRow][currentColumn] = moves;
                }
            }
            tourLengths[moves]++;
        }

        System.out.printf("%s%15s%n", "Tour Length", "Frequency");
        for (int i = 1; i <= 64; i++) {
            if (tourLengths[i] > 0) {
                System.out.printf("%11d%15d%n", i, tourLengths[i]);
            }
        }
    }
}
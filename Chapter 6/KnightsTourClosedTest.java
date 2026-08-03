public class KnightsTourClosedTest {
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        int startRow = 0, startCol = 0;
        int currentRow = startRow, currentColumn = startCol;
        int[][] board = new int[8][8];
        board[currentRow][currentColumn] = 1;

        for (int moveCount = 2; moveCount <= 64; moveCount++) {
            int bestMove = -1;
            for (int m = 0; m < 8; m++) {
                int nR = currentRow + vertical[m];
                int nC = currentColumn + horizontal[m];
                if (nR >= 0 && nR < 8 && nC >= 0 && nC < 8 && board[nR][nC] == 0) {
                    bestMove = m;
                    break;
                }
            }
            if (bestMove == -1) break;

            currentRow += vertical[bestMove];
            currentColumn += horizontal[bestMove];
            board[currentRow][currentColumn] = moveCount;
        }

        if (board[currentRow][currentColumn] == 64) {
            System.out.println("Full tour completed!");
            boolean closed = false;
            for (int m = 0; m < 8; m++) {
                if (currentRow + vertical[m] == startRow && currentColumn + horizontal[m] == startCol) {
                    closed = true;
                    break;
                }
            }
            System.out.println(closed ? "This is a CLOSED tour!" : "This is an OPEN tour.");
        } else {
            System.out.println("Tour did not reach 64 moves.");
        }
    }
}
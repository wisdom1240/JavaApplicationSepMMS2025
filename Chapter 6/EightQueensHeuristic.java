public class EightQueensHeuristic {
    private static final int[][] elimination = {
        {22, 22, 22, 22, 22, 22, 22, 22},
        {22, 24, 24, 24, 24, 24, 24, 22},
        {22, 24, 26, 26, 26, 26, 24, 22},
        {22, 24, 26, 28, 28, 26, 24, 22},
        {22, 24, 26, 28, 28, 26, 24, 22},
        {22, 24, 26, 26, 26, 26, 24, 22},
        {22, 24, 24, 24, 24, 24, 24, 22},
        {22, 22, 22, 22, 22, 22, 22, 22}
    };

    public static void main(String[] args) {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) board[i][j] = '-';
        }

        for (int q = 0; q < 8; q++) {
            int minElim = 999;
            int bestRow = -1, bestCol = -1;

            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    if (board[r][c] == '-' && elimination[r][c] < minElim) {
                        minElim = elimination[r][c];
                        bestRow = r;
                        bestCol = c;
                    }
                }
            }

            if (bestRow != -1) {
                board[bestRow][bestCol] = 'Q';
            }
        }

        for (char[] row : board) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }
}
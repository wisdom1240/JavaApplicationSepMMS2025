// File: TicTacToe.java
public class TicTacToe {
    public enum Cell { X, O, EMPTY }
    private final Cell[][] board = new Cell[3][3];

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
    }

    public boolean makeMove(int row, int col, Cell player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == Cell.EMPTY) {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWin(Cell p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((board[i][j] == Cell.EMPTY ? "-" : board[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
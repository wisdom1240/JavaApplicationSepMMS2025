// File: TicTacToeTest.java
public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0, TicTacToe.Cell.X);
        game.makeMove(1, 0, TicTacToe.Cell.O);
        game.makeMove(0, 1, TicTacToe.Cell.X);
        game.makeMove(1, 1, TicTacToe.Cell.O);
        game.makeMove(0, 2, TicTacToe.Cell.X); // Winning move for X

        game.printBoard();
        System.out.println("X Won? " + game.checkWin(TicTacToe.Cell.X));
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KnightsTourGUI extends JFrame implements ActionListener {
    private final int SIZE = 8;
    private JButton[][] board = new JButton[SIZE][SIZE];
    private int[][] grid = new int[SIZE][SIZE];
    private int step = 1;
    private int currentRow = 0, currentCol = 0;
    private Timer timer;

    private final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public KnightsTourGUI() {
        super("Knight's Tour Visualizer");
        setLayout(new GridLayout(SIZE, SIZE));

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                board[r][c] = new JButton();
                board[r][c].setFont(new Font("SansSerif", Font.BOLD, 14));
                add(board[r][c]);
            }
        }

        grid[currentRow][currentCol] = step;
        board[currentRow][currentCol].setText(String.valueOf(step));

        timer = new Timer(500, this);
        timer.start();

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean moved = false;
        for (int move = 0; move < 8; move++) {
            int nextR = currentRow + vertical[move];
            int nextC = currentCol + horizontal[move];
            if (nextR >= 0 && nextR < SIZE && nextC >= 0 && nextC < SIZE && grid[nextR][nextC] == 0) {
                currentRow = nextR;
                currentCol = nextC;
                step++;
                grid[currentRow][currentCol] = step;
                board[currentRow][currentCol].setText(String.valueOf(step));
                moved = true;
                break;
            }
        }
        if (!moved || step == 64) {
            timer.stop();
            JOptionPane.showMessageDialog(this, step == 64 ? "Full Tour Completed!" : "Tour ended at step " + step);
        }
    }

    public static void main(String[] args) {
        new KnightsTourGUI();
    }
}
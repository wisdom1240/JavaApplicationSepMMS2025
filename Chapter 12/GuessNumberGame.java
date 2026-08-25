import javax.swing.*;
import java.awt.*;

public class GuessNumberGame extends JFrame {
    private int targetNumber;
    private int lastDistance = -1;
    private JTextField guessField;
    private JLabel statusLabel;
    private JButton playAgainBtn;

    public GuessNumberGame() {
        super("Guess the Number");
        setLayout(new FlowLayout());

        statusLabel = new JLabel("I have a number between 1 and 1000. Enter your guess:");
        guessField = new JTextField(10);
        playAgainBtn = new JButton("Play Again");

        add(statusLabel);
        add(guessField);
        add(playAgainBtn);

        initGame();

        guessField.addActionListener(e -> processGuess());
        playAgainBtn.addActionListener(e -> initGame());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initGame() {
        targetNumber = 1 + (int) (Math.random() * 1000);
        lastDistance = -1;
        guessField.setEditable(true);
        guessField.setText("");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        statusLabel.setText("I have a number between 1 and 1000. Enter your guess:");
    }

    private void processGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            int distance = Math.abs(targetNumber - guess);

            if (guess == targetNumber) {
                statusLabel.setText("Correct!");
                getContentPane().setBackground(Color.GREEN);
                guessField.setEditable(false);
            } else {
                statusLabel.setText(guess > targetNumber ? "Too High" : "Too Low");
                if (lastDistance != -1) {
                    getContentPane().setBackground(distance < lastDistance ? Color.RED : Color.BLUE);
                }
                lastDistance = distance;
            }
        } catch (NumberFormatException ex) {
            statusLabel.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new GuessNumberGame();
    }
}
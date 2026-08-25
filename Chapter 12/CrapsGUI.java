import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CrapsGUI extends JFrame {
    private JTextField die1Field, die2Field, sumField, pointField;
    private JButton rollButton;
    private Random random = new Random();
    private int myPoint = 0;

    public CrapsGUI() {
        super("Craps Game");
        setLayout(new GridLayout(5, 2, 5, 5));

        die1Field = createUneditableField();
        die2Field = createUneditableField();
        sumField = createUneditableField();
        pointField = createUneditableField();

        rollButton = new JButton("Roll Dice");

        add(new JLabel("Die 1:")); add(die1Field);
        add(new JLabel("Die 2:")); add(die2Field);
        add(new JLabel("Sum:")); add(sumField);
        add(new JLabel("Point:")); add(pointField);
        add(rollButton);

        rollButton.addActionListener(e -> playRound());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JTextField createUneditableField() {
        JTextField tf = new JTextField();
        tf.setEditable(false);
        return tf;
    }

    private void playRound() {
        int d1 = 1 + random.nextInt(6);
        int d2 = 1 + random.nextInt(6);
        int sum = d1 + d2;

        die1Field.setText(String.valueOf(d1));
        die2Field.setText(String.valueOf(d2));
        sumField.setText(String.valueOf(sum));

        if (myPoint == 0) {
            if (sum == 7 || sum == 11) {
                JOptionPane.showMessageDialog(this, "You Win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                JOptionPane.showMessageDialog(this, "Craps! You Lose.");
            } else {
                myPoint = sum;
                pointField.setText(String.valueOf(myPoint));
            }
        } else {
            if (sum == myPoint) {
                JOptionPane.showMessageDialog(this, "Made Point! You Win!");
                myPoint = 0;
                pointField.setText("");
            } else if (sum == 7) {
                JOptionPane.showMessageDialog(this, "Seven Out! You Lose.");
                myPoint = 0;
                pointField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new CrapsGUI();
    }
}
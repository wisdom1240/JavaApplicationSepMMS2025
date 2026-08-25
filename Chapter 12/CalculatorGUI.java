import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    public CalculatorGUI() {
        super("Calculator");
        setLayout(new BorderLayout(5, 5));

        add(new JTextField(15), BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String txt : buttons) {
            buttonPanel.add(new JButton(txt));
        }

        add(buttonPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
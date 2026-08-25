import javax.swing.*;
import java.awt.*;

public class AlignGUI extends JFrame {
    public AlignGUI() {
        super("Align");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Left Panel - Checkboxes
        JPanel checkPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        checkPanel.add(new JCheckBox("Snap to Grid"));
        checkPanel.add(new JCheckBox("Show Grid"));

        // Center Panel - Text Fields & Labels
        JPanel fieldPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        fieldPanel.add(new JLabel("X:", SwingConstants.RIGHT));
        fieldPanel.add(new JTextField("8", 3));
        fieldPanel.add(new JLabel("Y:", SwingConstants.RIGHT));
        fieldPanel.add(new JTextField("8", 3));

        // Right Panel - Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        buttonPanel.add(new JButton("Ok"));
        buttonPanel.add(new JButton("Cancel"));
        buttonPanel.add(new JButton("Help"));

        add(checkPanel);
        add(fieldPanel);
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AlignGUI();
    }
}
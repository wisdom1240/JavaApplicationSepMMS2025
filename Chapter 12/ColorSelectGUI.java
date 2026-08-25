import javax.swing.*;
import java.awt.*;

public class ColorSelectGUI extends JFrame {
    public ColorSelectGUI() {
        super("ColorSelect");
        setLayout(new BorderLayout(5, 5));

        String[] colors = {"RED", "GREEN", "BLUE"};
        add(new JComboBox<>(colors), BorderLayout.NORTH);

        JPanel checkPanel = new JPanel(new FlowLayout());
        checkPanel.add(new JCheckBox("Background"));
        checkPanel.add(new JCheckBox("Foreground"));
        add(checkPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(new JButton("Ok"));
        buttonPanel.add(new JButton("Cancel"));
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorSelectGUI();
    }
}
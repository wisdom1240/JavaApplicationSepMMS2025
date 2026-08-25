import javax.swing.*;
import java.awt.*;

public class DrawFrame2D extends JFrame {
    private Color color1 = Color.BLACK, color2 = Color.WHITE;

    public DrawFrame2D() {
        super("Java 2D Advanced Drawing App");

        JCheckBox gradientCheck = new JCheckBox("Use Gradient");
        JButton col1Btn = new JButton("Color 1");
        JButton col2Btn = new JButton("Color 2");
        JTextField widthField = new JTextField("2", 3);
        JTextField dashField = new JTextField("10", 3);
        JCheckBox dashedCheck = new JCheckBox("Dashed");

        JPanel controlPanel = new JPanel();
        controlPanel.add(gradientCheck);
        controlPanel.add(col1Btn);
        controlPanel.add(col2Btn);
        controlPanel.add(new JLabel("Width:"));
        controlPanel.add(widthField);
        controlPanel.add(new JLabel("Dash:"));
        controlPanel.add(dashField);
        controlPanel.add(dashedCheck);

        col1Btn.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Select Color 1", color1);
            if (c != null) color1 = c;
        });

        col2Btn.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Select Color 2", color2);
            if (c != null) color2 = c;
        });

        add(controlPanel, BorderLayout.NORTH);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawFrame2D();
    }
}
import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    private DrawPanel drawPanel;

    public DrawFrame() {
        super("Java Drawings");

        JLabel statusLabel = new JLabel("(0, 0)");
        drawPanel = new DrawPanel(statusLabel);

        JButton undoBtn = new JButton("Undo");
        JButton clearBtn = new JButton("Clear");

        String[] colorNames = {"Black", "Red", "Blue", "Green", "Yellow"};
        Color[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        JComboBox<String> colorBox = new JComboBox<>(colorNames);

        String[] shapeNames = {"Line", "Rectangle", "Oval"};
        JComboBox<String> shapeBox = new JComboBox<>(shapeNames);

        JCheckBox filledCheck = new JCheckBox("Filled");

        JPanel topPanel = new JPanel();
        topPanel.add(undoBtn);
        topPanel.add(clearBtn);
        topPanel.add(colorBox);
        topPanel.add(shapeBox);
        topPanel.add(filledCheck);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        undoBtn.addActionListener(e -> drawPanel.clearLastShape());
        clearBtn.addActionListener(e -> drawPanel.clearDrawing());
        colorBox.addActionListener(e -> drawPanel.setCurrentColor(colors[colorBox.getSelectedIndex()]));
        shapeBox.addActionListener(e -> drawPanel.setShapeType(shapeBox.getSelectedIndex()));
        filledCheck.addActionListener(e -> drawPanel.setFilledShape(filledCheck.isSelected()));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawFrame();
    }
}
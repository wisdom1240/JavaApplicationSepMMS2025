import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeSelectorApp extends JFrame {
    private JComboBox<String> shapeBox;
    private JPanel drawPanel;

    public ShapeSelectorApp() {
        super("Selecting Shapes");
        setLayout(new BorderLayout());

        shapeBox = new JComboBox<>(new String[]{"Lines", "Rectangles", "Ovals"});
        add(shapeBox, BorderLayout.NORTH);

        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random r = new Random();
                int selected = shapeBox.getSelectedIndex();

                for (int i = 0; i < 20; i++) {
                    int x = r.nextInt(Math.max(1, getWidth() - 50));
                    int y = r.nextInt(Math.max(1, getHeight() - 50));
                    int w = 10 + r.nextInt(60);
                    int h = 10 + r.nextInt(60);

                    switch (selected) {
                        case 0 -> g.drawLine(x, y, x + w, y + h);
                        case 1 -> g.drawRect(x, y, w, h);
                        case 2 -> g.drawOval(x, y, w, h);
                    }
                }
            }
        };
        add(drawPanel, BorderLayout.CENTER);

        shapeBox.addActionListener(e -> drawPanel.repaint());

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeSelectorApp();
    }
}
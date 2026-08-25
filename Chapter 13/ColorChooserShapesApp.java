import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorChooserShapesApp extends JFrame {
    private Color currentColor = Color.BLACK;

    public ColorChooserShapesApp() {
        super("JColorChooser Shapes");
        setLayout(new BorderLayout());

        JButton colorBtn = new JButton("Choose Color");
        add(colorBtn, BorderLayout.NORTH);

        JPanel drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(currentColor);
                Random r = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = r.nextInt(Math.max(1, getWidth() - 50));
                    int y = r.nextInt(Math.max(1, getHeight() - 50));
                    int w = 10 + r.nextInt(60);
                    int h = 10 + r.nextInt(60);
                    g.drawRect(x, y, w, h);
                }
            }
        };
        add(drawPanel, BorderLayout.CENTER);

        colorBtn.addActionListener(e -> {
            Color chosen = JColorChooser.showDialog(this, "Select Color", currentColor);
            if (chosen != null) {
                currentColor = chosen;
                drawPanel.repaint();
            }
        });

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChooserShapesApp();
    }
}
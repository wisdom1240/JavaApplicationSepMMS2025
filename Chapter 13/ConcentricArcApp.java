import javax.swing.*;
import java.awt.*;

public class ConcentricArcApp extends JFrame {
    public ConcentricArcApp() {
        super("Concentric Circles - drawArc");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;
                for (int i = 1; i <= 8; i++) {
                    int radius = i * 10;
                    g.drawArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 0, 360);
                }
            }
        });
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConcentricArcApp();
    }
}
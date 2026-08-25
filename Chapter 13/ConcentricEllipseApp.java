import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ConcentricEllipseApp extends JFrame {
    public ConcentricEllipseApp() {
        super("Concentric Circles - Ellipse2D");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;
                for (int i = 1; i <= 8; i++) {
                    double radius = i * 10;
                    g2d.draw(new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2));
                }
            }
        });
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConcentricEllipseApp();
    }
}
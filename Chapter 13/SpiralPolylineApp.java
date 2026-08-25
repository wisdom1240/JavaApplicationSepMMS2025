import javax.swing.*;
import java.awt.*;

public class SpiralPolylineApp extends JFrame {
    public SpiralPolylineApp() {
        super("Drawing Spiral");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int points = 80;
                int[] x = new int[points];
                int[] y = new int[points];

                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;

                for (int i = 0; i < points; i++) {
                    double angle = 0.5 * i;
                    double radius = 5 * angle;
                    x[i] = centerX + (int) (radius * Math.cos(angle));
                    y[i] = centerY + (int) (radius * Math.sin(angle));
                }

                g.drawPolyline(x, y, points);
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SpiralPolylineApp();
    }
}
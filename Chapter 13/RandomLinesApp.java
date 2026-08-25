import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;

public class RandomLinesApp extends JFrame {
    public RandomLinesApp() {
        super("Random Lines");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {
                    g2d.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                    g2d.setStroke(new BasicStroke(1 + rand.nextFloat() * 9));
                    double x1 = rand.nextDouble() * getWidth();
                    double y1 = rand.nextDouble() * getHeight();
                    double x2 = rand.nextDouble() * getWidth();
                    double y2 = rand.nextDouble() * getHeight();
                    g2d.draw(new Line2D.Double(x1, y1, x2, y2));
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomLinesApp();
    }
}
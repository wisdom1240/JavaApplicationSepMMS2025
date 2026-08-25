import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GridLine2DApp extends JFrame {
    public GridLine2DApp() {
        super("8x8 Grid - Line2D");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                double rowStep = (double) getHeight() / 8;
                double colStep = (double) getWidth() / 8;
                for (int i = 0; i <= 8; i++) {
                    g2d.draw(new Line2D.Double(0, i * rowStep, getWidth(), i * rowStep));
                    g2d.draw(new Line2D.Double(i * colStep, 0, i * colStep, getHeight()));
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLine2DApp();
    }
}
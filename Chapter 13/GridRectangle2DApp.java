import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GridRectangle2DApp extends JFrame {
    public GridRectangle2DApp() {
        super("10x10 Grid - Rectangle2D");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                double cellWidth = (double) getWidth() / 10;
                double cellHeight = (double) getHeight() / 10;
                for (int row = 0; row < 10; row++) {
                    for (int col = 0; col < 10; col++) {
                        g2d.draw(new Rectangle2D.Double(col * cellWidth, row * cellHeight, cellWidth, cellHeight));
                    }
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridRectangle2DApp();
    }
}
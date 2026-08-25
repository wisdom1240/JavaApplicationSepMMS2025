import javax.swing.*;
import java.awt.*;

public class GridDrawRectApp extends JFrame {
    public GridDrawRectApp() {
        super("10x10 Grid - drawRect");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int cellWidth = getWidth() / 10;
                int cellHeight = getHeight() / 10;
                for (int row = 0; row < 10; row++) {
                    for (int col = 0; col < 10; col++) {
                        g.drawRect(col * cellWidth, row * cellHeight, cellWidth, cellHeight);
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
        new GridDrawRectApp();
    }
}
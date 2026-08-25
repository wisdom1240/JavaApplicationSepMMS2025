import javax.swing.*;
import java.awt.*;

public class GridDrawLineApp extends JFrame {
    public GridDrawLineApp() {
        super("8x8 Grid - drawLine");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int rowStep = getHeight() / 8;
                int colStep = getWidth() / 8;
                for (int i = 0; i <= 8; i++) {
                    g.drawLine(0, i * rowStep, getWidth(), i * rowStep);
                    g.drawLine(i * colStep, 0, i * colStep, getHeight());
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridDrawLineApp();
    }
}
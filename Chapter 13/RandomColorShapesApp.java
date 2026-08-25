import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomColorShapesApp extends JFrame {
    private final Color[] colorPalette = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
        Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
        Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };

    public RandomColorShapesApp() {
        super("Random Color Shapes");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random r = new Random();
                for (int i = 0; i < 20; i++) {
                    g.setColor(colorPalette[r.nextInt(colorPalette.length)]);
                    int x = r.nextInt(Math.max(1, getWidth() - 50));
                    int y = r.nextInt(Math.max(1, getHeight() - 50));
                    int w = 10 + r.nextInt(60);
                    int h = 10 + r.nextInt(60);
                    g.drawRect(x, y, w, h);
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomColorShapesApp();
    }
}
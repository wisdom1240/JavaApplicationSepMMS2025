import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class RandomTrianglesApp extends JFrame {
    public RandomTrianglesApp() {
        super("Random Triangles");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Random rand = new Random();
                for (int i = 0; i < 10; i++) {
                    GeneralPath path = new GeneralPath();
                    path.moveTo(rand.nextInt(getWidth()), rand.nextInt(getHeight()));
                    path.lineTo(rand.nextInt(getWidth()), rand.nextInt(getHeight()));
                    path.lineTo(rand.nextInt(getWidth()), rand.nextInt(getHeight()));
                    path.closePath();
                    g2d.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                    g2d.fill(path);
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomTrianglesApp();
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomCharsApp extends JFrame {
    public RandomCharsApp() {
        super("Random Characters");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random rand = new Random();
                String[] fonts = {"Serif", "SansSerif", "Monospaced", "Dialog"};
                for (int i = 0; i < 25; i++) {
                    char ch = (char) ('A' + rand.nextInt(26));
                    g.setFont(new Font(fonts[rand.nextInt(fonts.length)], rand.nextInt(4), 12 + rand.nextInt(36)));
                    g.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                    g.drawString(String.valueOf(ch), rand.nextInt(Math.max(1, getWidth() - 20)), rand.nextInt(Math.max(1, getHeight() - 20)));
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomCharsApp();
    }
}
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BasicScreenSaver extends JFrame {
    private int lineCount = 0;

    public BasicScreenSaver() {
        super("Basic Screen Saver");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random r = new Random();
                for (int i = 0; i < 100; i++) {
                    g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                    g.drawLine(r.nextInt(getWidth()), r.nextInt(getHeight()), r.nextInt(getWidth()), r.nextInt(getHeight()));
                }
                // Issue: Calling repaint inside paintComponent causes rapid CPU usage spikes and potential flickering stack issues.
                repaint();
            }
        });
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BasicScreenSaver();
    }
}
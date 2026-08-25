import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;

public class GradientScreenSaver extends JFrame implements ActionListener {
    private JPanel drawPanel;

    public GradientScreenSaver() {
        super("Java 2D Gradient Screen Saver");
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Random r = new Random();

                for (int i = 0; i < 30; i++) {
                    Color c1 = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
                    Color c2 = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
                    int x = r.nextInt(Math.max(1, getWidth() - 80));
                    int y = r.nextInt(Math.max(1, getHeight() - 80));
                    int w = 20 + r.nextInt(100);
                    int h = 20 + r.nextInt(100);

                    g2d.setPaint(new GradientPaint(x, y, c1, x + w, y + h, c2, true));
                    if (r.nextBoolean()) {
                        g2d.fill(new Rectangle2D.Double(x, y, w, h));
                    } else {
                        g2d.fill(new Ellipse2D.Double(x, y, w, h));
                    }
                }
            }
        };
        add(drawPanel);

        Timer timer = new Timer(1000, this);
        timer.start();

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        drawPanel.repaint();
    }

    public static void main(String[] args) {
        new GradientScreenSaver();
    }
}
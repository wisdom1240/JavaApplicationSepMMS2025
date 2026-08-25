import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MultiShapeScreenSaver extends JFrame implements ActionListener {
    private JPanel drawPanel;

    public MultiShapeScreenSaver() {
        super("Multi-Shape Screen Saver");
        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random r = new Random();
                for (int i = 0; i < 50; i++) {
                    g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                    int shape = r.nextInt(3);
                    int x = r.nextInt(Math.max(1, getWidth() - 50));
                    int y = r.nextInt(Math.max(1, getHeight() - 50));
                    int w = 10 + r.nextInt(80);
                    int h = 10 + r.nextInt(80);

                    switch (shape) {
                        case 0 -> g.drawLine(x, y, x + w, y + h);
                        case 1 -> g.drawRect(x, y, w, h);
                        case 2 -> g.drawOval(x, y, w, h);
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
        new MultiShapeScreenSaver();
    }
}
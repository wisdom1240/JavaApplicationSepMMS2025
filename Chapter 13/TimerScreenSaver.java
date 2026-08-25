import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TimerScreenSaver extends JFrame implements ActionListener {
    private Timer timer;
    private DrawPanel panel;

    public TimerScreenSaver() {
        super("Timer Screen Saver");
        panel = new DrawPanel();
        add(panel);

        timer = new Timer(1000, this);
        timer.start();

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.repaint();
    }

    private static class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Random r = new Random();
            for (int i = 0; i < 100; i++) {
                g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                g.drawLine(r.nextInt(getWidth()), r.nextInt(getHeight()), r.nextInt(getWidth()), r.nextInt(getHeight()));
            }
        }
    }

    public static void main(String[] args) {
        new TimerScreenSaver();
    }
}
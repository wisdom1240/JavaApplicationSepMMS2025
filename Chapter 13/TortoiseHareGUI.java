import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TortoiseHareGUI extends JFrame implements ActionListener {
    private int tortoisePos = 0;
    private int harePos = 0;
    private Timer timer;
    private JPanel racePanel;

    public TortoiseHareGUI() {
        super("Tortoise and Hare Mountain Race");

        racePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                // Draw Mountain Curve
                g2d.drawArc(-getWidth(), 0, getWidth() * 2, getHeight() * 2, 0, 90);

                // Map race index [0..300] along curve coordinates
                double tAngle = Math.toRadians((double) tortoisePos / 300.0 * 90.0);
                int tx = (int) (getWidth() * Math.sin(tAngle));
                int ty = getHeight() - (int) (getHeight() * Math.cos(tAngle));

                double hAngle = Math.toRadians((double) harePos / 300.0 * 90.0);
                int hx = (int) (getWidth() * Math.sin(hAngle));
                int hy = getHeight() - (int) (getHeight() * Math.cos(hAngle));

                g2d.setColor(Color.RED);
                g2d.drawString("T", tx, ty - 5);
                g2d.setColor(Color.BLUE);
                g2d.drawString("H", hx, hy + 10);
            }
        };

        add(racePanel);
        timer = new Timer(200, this);
        timer.start();

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment positions dynamically
        tortoisePos = Math.min(300, tortoisePos + (int) (Math.random() * 5 + 1));
        harePos = Math.min(300, harePos + (int) (Math.random() * 8));

        racePanel.repaint();

        if (tortoisePos >= 300 || harePos >= 300) {
            timer.stop();
            String msg = (tortoisePos >= 300 && harePos >= 300) ? "It's a tie!" : (tortoisePos >= 300 ? "TORTOISE WINS!" : "HARE WINS!");
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    public static void main(String[] args) {
        new TortoiseHareGUI();
    }
}
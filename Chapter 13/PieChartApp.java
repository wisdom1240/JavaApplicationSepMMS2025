import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class PieChartApp extends JFrame {
    private double[] values = {30, 20, 40, 10};
    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};

    public PieChartApp() {
        super("Pie Chart Visualizer");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                double total = 0;
                for (double v : values) total += v;

                double startAngle = 0;
                for (int i = 0; i < values.length; i++) {
                    double sweepAngle = (values[i] / total) * 360.0;
                    g2d.setColor(colors[i]);
                    g2d.fill(new Arc2D.Double(50, 50, 250, 250, startAngle, sweepAngle, Arc2D.PIE));
                    startAngle += sweepAngle;
                }
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PieChartApp();
    }
}
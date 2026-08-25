import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleMetricsApp extends JFrame {
    private double radius, x, y;

    public CircleMetricsApp() {
        super("Circle Metrics");
        try {
            radius = Double.parseDouble(JOptionPane.showInputDialog("Enter Radius:"));
            x = Double.parseDouble(JOptionPane.showInputDialog("Enter Center X:"));
            y = Double.parseDouble(JOptionPane.showInputDialog("Enter Center Y:"));
        } catch (Exception e) {
            radius = 50; x = 150; y = 150;
        }

        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                double diameter = 2 * radius;
                double circumference = 2 * Math.PI * radius;
                double area = Math.PI * radius * radius;

                g2d.draw(new Ellipse2D.Double(x - radius, y - radius, diameter, diameter));

                g2d.drawString(String.format("Diameter: %.2f", diameter), 10, 20);
                g2d.drawString(String.format("Circumference: %.2f", circumference), 10, 40);
                g2d.drawString(String.format("Area: %.2f", area), 10, 60);
            }
        });

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleMetricsApp();
    }
}
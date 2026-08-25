import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class TurtleGraphicsGUI extends JFrame {
    private Path2D path = new Path2D.Double();
    private double currentX = 200, currentY = 200;
    private double angle = 0; // Degrees
    private boolean penDown = false;

    public TurtleGraphicsGUI() {
        super("Turtle Graphics 2D");
        setLayout(new BorderLayout());

        path.moveTo(currentX, currentY);

        JPanel drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2));
                g2d.setColor(Color.BLUE);
                g2d.draw(path);
            }
        };
        add(drawPanel, BorderLayout.CENTER);

        JPanel controls = new JPanel();
        JButton penBtn = new JButton("Pen Up/Down");
        JButton turnRightBtn = new JButton("Turn Right");
        JButton turnLeftBtn = new JButton("Turn Left");
        JTextField moveField = new JTextField("5", 3);
        JButton moveBtn = new JButton("Move");

        controls.add(penBtn);
        controls.add(turnRightBtn);
        controls.add(turnLeftBtn);
        controls.add(moveField);
        controls.add(moveBtn);
        add(controls, BorderLayout.SOUTH);

        penBtn.addActionListener(e -> penDown = !penDown);
        turnRightBtn.addActionListener(e -> angle = (angle + 90) % 360);
        turnLeftBtn.addActionListener(e -> angle = (angle - 90 + 360) % 360);
        moveBtn.addActionListener(e -> {
            try {
                int dist = Integer.parseInt(moveField.getText()) * 10;
                double rad = Math.toRadians(angle);
                double newX = currentX + dist * Math.cos(rad);
                double newY = currentY + dist * Math.sin(rad);

                if (penDown) {
                    path.lineTo(newX, newY);
                } else {
                    path.moveTo(newX, newY);
                }
                currentX = newX;
                currentY = newY;
                drawPanel.repaint();
            } catch (NumberFormatException ex) {}
        });

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TurtleGraphicsGUI();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class CubeApp extends JFrame {
    public CubeApp() {
        super("3D Cube Wireframe");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GeneralPath path = new GeneralPath();

                // Front Face
                path.moveTo(100, 100); path.lineTo(200, 100);
                path.lineTo(200, 200); path.lineTo(100, 200);
                path.closePath();

                // Back Face
                path.moveTo(150, 50); path.lineTo(250, 50);
                path.lineTo(250, 150); path.lineTo(150, 150);
                path.closePath();

                // Connecting Vectors
                path.moveTo(100, 100); path.lineTo(150, 50);
                path.moveTo(200, 100); path.lineTo(250, 50);
                path.moveTo(200, 200); path.lineTo(250, 150);
                path.moveTo(100, 200); path.lineTo(150, 150);

                g2d.setStroke(new BasicStroke(2));
                g2d.draw(path);
            }
        });
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CubeApp();
    }
}
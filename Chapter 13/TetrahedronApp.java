import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class TetrahedronApp extends JFrame {
    public TetrahedronApp() {
        super("3D Tetrahedron Wireframe");
        add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                int[] p1 = {200, 50};
                int[] p2 = {100, 250};
                int[] p3 = {300, 250};
                int[] p4 = {200, 180};

                GeneralPath path = new GeneralPath();
                // Base Outer
                path.moveTo(p1[0], p1[1]); path.lineTo(p2[0], p2[1]);
                path.lineTo(p3[0], p3[1]); path.closePath();
                // Internal Connectors
                path.moveTo(p1[0], p1[1]); path.lineTo(p4[0], p4[1]);
                path.moveTo(p2[0], p2[1]); path.lineTo(p4[0], p4[1]);
                path.moveTo(p3[0], p3[1]); path.lineTo(p4[0], p4[1]);

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
        new TetrahedronApp();
    }
}
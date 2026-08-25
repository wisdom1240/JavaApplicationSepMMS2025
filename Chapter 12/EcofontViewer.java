import javax.swing.*;
import java.awt.*;

public class EcofontViewer extends JFrame {
    private JLabel textDisplay;
    private float fontSize = 9.0f;

    public EcofontViewer() {
        super("Ecofont Viewer");
        setLayout(new BorderLayout(5, 5));

        textDisplay = new JLabel("Sample Text - Ecofont Test", SwingConstants.CENTER);
        textDisplay.setFont(new Font("SansSerif", Font.PLAIN, (int) fontSize));
        add(textDisplay, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout());
        JButton incBtn = new JButton("Increase Font Size");
        JButton decBtn = new JButton("Decrease Font Size");

        incBtn.addActionListener(e -> updateFontSize(1.0f));
        decBtn.addActionListener(e -> updateFontSize(-1.0f));

        controls.add(incBtn);
        controls.add(decBtn);
        add(controls, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateFontSize(float delta) {
        fontSize = Math.max(4.0f, fontSize + delta);
        textDisplay.setFont(textDisplay.getFont().deriveFont(fontSize));
    }

    public static void main(String[] args) {
        new EcofontViewer();
    }
}
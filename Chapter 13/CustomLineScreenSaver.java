import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CustomLineScreenSaver extends JFrame implements ActionListener {
    private int linesToDraw = 50;
    private JTextField inputField;
    private JPanel drawPanel;

    public CustomLineScreenSaver() {
        super("Configurable Screen Saver");
        setLayout(new BorderLayout());

        inputField = new JTextField(String.valueOf(linesToDraw), 5);
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Lines:"));
        topPanel.add(inputField);
        add(topPanel, BorderLayout.NORTH);

        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random r = new Random();
                for (int i = 0; i < linesToDraw; i++) {
                    g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                    g.drawLine(r.nextInt(getWidth()), r.nextInt(getHeight()), r.nextInt(getWidth()), r.nextInt(getHeight()));
                }
            }
        };
        add(drawPanel, BorderLayout.CENTER);

        inputField.addActionListener(e -> {
            try {
                linesToDraw = Integer.parseInt(inputField.getText());
            } catch (NumberFormatException ex) {
                linesToDraw = 50;
            }
        });

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
        new CustomLineScreenSaver();
    }
}
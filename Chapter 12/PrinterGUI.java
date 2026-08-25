import javax.swing.*;
import java.awt.*;

public class PrinterGUI extends JFrame {
    public PrinterGUI() {
        super("Printer");
        setLayout(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel("Printer: MyPrinter");
        add(titleLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(1, 3, 5, 5));

        JPanel p1 = new JPanel(new GridLayout(3, 1));
        p1.add(new JCheckBox("Image"));
        p1.add(new JCheckBox("Text"));
        p1.add(new JCheckBox("Code"));

        JPanel p2 = new JPanel(new GridLayout(3, 1));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("Selection");
        JRadioButton r2 = new JRadioButton("All", true);
        JRadioButton r3 = new JRadioButton("Applet");
        bg.add(r1); bg.add(r2); bg.add(r3);
        p2.add(r1); p2.add(r2); p2.add(r3);

        JPanel p3 = new JPanel(new GridLayout(3, 1));
        p3.add(new JTextArea(3, 5));

        centerPanel.add(p1);
        centerPanel.add(p2);
        centerPanel.add(p3);
        add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JLabel("Print Quality:"));
        southPanel.add(new JComboBox<>(new String[]{"High", "Medium", "Low"}));
        southPanel.add(new JCheckBox("Print to File"));
        add(southPanel, BorderLayout.SOUTH);

        JPanel eastPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        eastPanel.add(new JButton("OK"));
        eastPanel.add(new JButton("Cancel"));
        eastPanel.add(new JButton("Setup..."));
        eastPanel.add(new JButton("Help"));
        add(eastPanel, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrinterGUI();
    }
}
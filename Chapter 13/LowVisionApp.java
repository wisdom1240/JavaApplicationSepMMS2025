import javax.swing.*;
import java.awt.*;

public class LowVisionApp extends JFrame {
    private JTextArea textArea;
    private JComboBox<String> fontBox;
    private JCheckBox boldCheck;
    private float fontSize = 18.0f;

    public LowVisionApp() {
        super("Low Vision Display Assistant");
        setLayout(new BorderLayout(5, 5));

        Font uiFont = new Font("SansSerif", Font.BOLD, 20);

        textArea = new JTextArea("Type text here...", 10, 30);
        textArea.setFont(new Font("Serif", Font.PLAIN, (int) fontSize));
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout());

        fontBox = new JComboBox<>(new String[]{"Serif", "SansSerif", "Monospaced"});
        fontBox.setFont(uiFont);

        boldCheck = new JCheckBox("Bold");
        boldCheck.setFont(uiFont);

        JButton incBtn = new JButton("Increase Font Size");
        incBtn.setFont(uiFont);

        JButton decBtn = new JButton("Decrease Font Size");
        decBtn.setFont(uiFont);

        controls.add(fontBox);
        controls.add(boldCheck);
        controls.add(incBtn);
        controls.add(decBtn);

        add(controls, BorderLayout.SOUTH);

        fontBox.addActionListener(e -> updateFont());
        boldCheck.addActionListener(e -> updateFont());
        incBtn.addActionListener(e -> { fontSize++; updateFont(); });
        decBtn.addActionListener(e -> { fontSize = Math.max(8.0f, fontSize - 1); updateFont(); });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateFont() {
        String fontName = (String) fontBox.getSelectedItem();
        int style = boldCheck.isSelected() ? Font.BOLD : Font.PLAIN;
        textArea.setFont(new Font(fontName, style, (int) fontSize));
    }

    public static void main(String[] args) {
        new LowVisionApp();
    }
}
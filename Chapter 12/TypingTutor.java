import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class TypingTutor extends JFrame {
    private JTextArea textArea;
    private Map<Integer, JButton> buttonMap = new HashMap<>();

    public TypingTutor() {
        super("Typing Application");
        setLayout(new BorderLayout(5, 5));

        textArea = new JTextArea(8, 50);
        add(new JScrollPane(textArea), BorderLayout.NORTH);

        JPanel keyboardPanel = new JPanel(new GridLayout(4, 10, 2, 2));
        String row1 = "1234567890";
        String row2 = "QWERTYUIOP";
        String row3 = "ASDFGHJKL;";
        String row4 = "ZXCVBNM,./";

        addKeysToPanel(keyboardPanel, row1);
        addKeysToPanel(keyboardPanel, row2);
        addKeysToPanel(keyboardPanel, row3);
        addKeysToPanel(keyboardPanel, row4);

        add(keyboardPanel, BorderLayout.CENTER);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                JButton b = buttonMap.get(e.getKeyCode());
                if (b != null) b.setBackground(Color.YELLOW);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                JButton b = buttonMap.get(e.getKeyCode());
                if (b != null) b.setBackground(null);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addKeysToPanel(JPanel panel, String keys) {
        for (char c : keys.toCharArray()) {
            JButton btn = new JButton(String.valueOf(c));
            panel.add(btn);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            buttonMap.put(keyCode, btn);
        }
    }

    public static void main(String[] args) {
        new TypingTutor();
    }
}
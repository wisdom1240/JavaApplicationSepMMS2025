import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SMSTranslatorGUI extends JFrame {
    private static final Map<String, String> smsMap = new HashMap<>();

    static {
        smsMap.put("imo", "in my opinion");
        smsMap.put("lol", "laugh out loud");
        smsMap.put("brb", "be right back");
        smsMap.put("btw", "by the way");
    }

    public SMSTranslatorGUI() {
        super("SMS Language Translator");
        setLayout(new FlowLayout());

        JTextField input = new JTextField(20);
        JButton translateBtn = new JButton("Translate to English");
        JLabel result = new JLabel("Result: ");

        add(input);
        add(translateBtn);
        add(result);

        translateBtn.addActionListener(e -> {
            String[] words = input.getText().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                String clean = w.toLowerCase();
                sb.append(smsMap.getOrDefault(clean, w)).append(" ");
            }
            result.setText("Result: " + sb.toString().trim());
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SMSTranslatorGUI();
    }
}
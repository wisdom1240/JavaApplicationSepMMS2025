import javax.swing.*;
import java.awt.*;

public class SpamScannerGUI extends JFrame {
    private static final String[] spamKeywords = {
        "buy now", "free", "click here", "earn money", "risk free",
        "limited time", "special promotion", "winner", "cash bonus", "cheap"
    };

    public SpamScannerGUI() {
        super("Spam Email Detector");
        setLayout(new BorderLayout());

        JTextArea emailArea = new JTextArea(10, 30);
        JButton scanBtn = new JButton("Scan Message");

        add(new JScrollPane(emailArea), BorderLayout.CENTER);
        add(scanBtn, BorderLayout.SOUTH);

        scanBtn.addActionListener(e -> {
            String content = emailArea.getText().toLowerCase();
            int score = 0;

            for (String kw : spamKeywords) {
                if (content.contains(kw)) score++;
            }

            String rating = (score > 3) ? "High Probability of Spam" : "Low Risk";
            JOptionPane.showMessageDialog(this, "Spam Score: " + score + "\nRating: " + rating);
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SpamScannerGUI();
    }
}
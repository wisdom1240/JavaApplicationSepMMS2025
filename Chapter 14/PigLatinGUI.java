import javax.swing.*;
import java.awt.*;

public class PigLatinGUI extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public PigLatinGUI() {
        super("Pig Latin Translator");
        setLayout(new BorderLayout());

        inputField = new JTextField();
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        add(new JLabel("Enter sentence:"), BorderLayout.NORTH);
        add(inputField, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        inputField.addActionListener(e -> {
            String input = inputField.getText();
            String[] words = input.split("\\s+");
            StringBuilder pigLatinSentence = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {
                    pigLatinSentence.append(translateWord(word)).append(" ");
                }
            }
            outputArea.append(pigLatinSentence.toString().trim() + "\n");
            inputField.setText("");
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String translateWord(String word) {
        return word.substring(1) + word.charAt(0) + "ay";
    }

    public static void main(String[] args) {
        new PigLatinGUI();
    }
}
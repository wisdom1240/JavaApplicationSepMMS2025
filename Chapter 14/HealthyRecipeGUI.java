import javax.swing.*;
import java.awt.*;

public class HealthyRecipeGUI extends JFrame {
    private JTextArea recipeArea;

    public HealthyRecipeGUI() {
        super("Healthy Recipe Replacer");
        setLayout(new BorderLayout());

        recipeArea = new JTextArea(10, 30);
        JButton substituteBtn = new JButton("Substitute Ingredients");

        add(new JScrollPane(recipeArea), BorderLayout.CENTER);
        add(substituteBtn, BorderLayout.SOUTH);

        substituteBtn.addActionListener(e -> {
            String text = recipeArea.getText();
            text = text.replaceAll("1 cup sour cream", "1 cup yogurt")
                       .replaceAll("1 cup butter", "1 cup margarine")
                       .replaceAll("1 egg", "2 egg whites");

            recipeArea.setText(text);
            JOptionPane.showMessageDialog(this, "Always consult your physician before making significant changes to your diet.");
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HealthyRecipeGUI();
    }
}
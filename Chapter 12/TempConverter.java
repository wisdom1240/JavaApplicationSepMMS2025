import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame {
    private JTextField fahrenheitField;
    private JLabel resultLabel;

    public TempConverter() {
        super("Fahrenheit to Celsius");
        setLayout(new FlowLayout());

        add(new JLabel("Enter Fahrenheit:"));
        fahrenheitField = new JTextField(10);
        add(fahrenheitField);

        resultLabel = new JLabel("Celsius: ");
        add(resultLabel);

        fahrenheitField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double f = Double.parseDouble(fahrenheitField.getText());
                    double c = (5.0 / 9.0) * (f - 32);
                    resultLabel.setText(String.format("Celsius: %.2f", c));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TempConverter();
    }
}
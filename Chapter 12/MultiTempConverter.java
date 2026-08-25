import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiTempConverter extends JFrame {
    private JTextField inputField;
    private JComboBox<String> fromBox, toBox;
    private JLabel resultLabel;

    public MultiTempConverter() {
        super("Multi-Scale Temperature Converter");
        setLayout(new FlowLayout());

        String[] scales = {"Fahrenheit", "Celsius", "Kelvin"};

        inputField = new JTextField(8);
        fromBox = new JComboBox<>(scales);
        toBox = new JComboBox<>(scales);
        JButton convertBtn = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        add(new JLabel("Temp:"));
        add(inputField);
        add(fromBox);
        add(new JLabel("to"));
        add(toBox);
        add(convertBtn);
        add(resultLabel);

        convertBtn.addActionListener(e -> convert());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convert() {
        try {
            double val = Double.parseDouble(inputField.getText());
            String from = (String) fromBox.getSelectedItem();
            String to = (String) toBox.getSelectedItem();
            
            double celsius = switch (from) {
                case "Fahrenheit" -> (5.0 / 9.0) * (val - 32);
                case "Kelvin" -> val - 273.15;
                default -> val;
            };

            double result = switch (to) {
                case "Fahrenheit" -> (celsius * 9.0 / 5.0) + 32;
                case "Kelvin" -> celsius + 273.15;
                default -> celsius;
            };

            resultLabel.setText(String.format("Result: %.2f", result));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new MultiTempConverter();
    }
}
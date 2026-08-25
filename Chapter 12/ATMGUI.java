import javax.swing.*;
import java.awt.*;

public class ATMGUI extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardLayout);

    public ATMGUI() {
        super("ATM Interface");

        mainPanel.add(createPinPanel(), "PIN");
        mainPanel.add(createMenuPanel(), "MENU");

        add(mainPanel, BorderLayout.CENTER);

        JPanel hardwarePanel = new JPanel(new FlowLayout());
        hardwarePanel.add(new JButton("Remove Cash"));
        hardwarePanel.add(new JButton("Insert Envelope"));
        add(hardwarePanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createPinPanel() {
        JPanel p = new JPanel(new FlowLayout());
        p.add(new JLabel("Enter PIN:"));
        JPasswordField pinField = new JPasswordField(10);
        p.add(pinField);
        JButton submit = new JButton("Submit");
        submit.addActionListener(e -> cardLayout.show(mainPanel, "MENU"));
        p.add(submit);
        return p;
    }

    private JPanel createMenuPanel() {
        JPanel p = new JPanel(new GridLayout(3, 1, 5, 5));
        p.add(new JButton("1 - View My Balance"));
        p.add(new JButton("2 - Withdraw Cash"));
        p.add(new JButton("3 - Deposit Funds"));
        return p;
    }

    public static void main(String[] args) {
        new ATMGUI();
    }
}
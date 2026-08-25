import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDisplayApp extends JFrame implements ActionListener, MouseListener, KeyListener {
    private JTextArea logArea;
    private JButton testButton;

    public EventDisplayApp() {
        super("Event Display Application");
        setLayout(new BorderLayout());

        testButton = new JButton("Click or Interact With Me");
        logArea = new JTextArea(15, 40);
        logArea.setEditable(false);

        testButton.addActionListener(this);
        testButton.addMouseListener(this);
        testButton.addKeyListener(this);

        add(testButton, BorderLayout.NORTH);
        add(new JScrollPane(logArea), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void log(String eventType, Object e) {
        logArea.append(eventType + ": " + e.toString() + "\n");
    }

    @Override public void actionPerformed(ActionEvent e) { log("ActionListener", e); }
    @Override public void mouseClicked(MouseEvent e) { log("MouseListener (Clicked)", e); }
    @Override public void mousePressed(MouseEvent e) { log("MouseListener (Pressed)", e); }
    @Override public void mouseReleased(MouseEvent e) { log("MouseListener (Released)", e); }
    @Override public void mouseEntered(MouseEvent e) { log("MouseListener (Entered)", e); }
    @Override public void mouseExited(MouseEvent e) { log("MouseListener (Exited)", e); }
    @Override public void keyTyped(KeyEvent e) { log("KeyListener (Typed)", e); }
    @Override public void keyPressed(KeyEvent e) { log("KeyListener (Pressed)", e); }
    @Override public void keyReleased(KeyEvent e) { log("KeyListener (Released)", e); }

    public static void main(String[] args) {
        new EventDisplayApp();
    }
}
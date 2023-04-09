import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyboardListener extends JFrame implements KeyListener {
    private JTextArea textArea;

    public KeyboardListener() {
        super("Keyboard Listener");
        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(textArea);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyboardListener();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (Character.isLetterOrDigit(c) || Character.isSpaceChar(c)) {
            textArea.append(String.valueOf(c));
        }
    }
}

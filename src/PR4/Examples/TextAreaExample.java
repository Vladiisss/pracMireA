package PR4.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame {


    JTextArea jta1 = new JTextArea(10, 25);
    JButton jbt = new JButton("Add some text");
    JScrollPane jscroll = new JScrollPane(jta1);

    TextAreaExample() {

        super("Text Area Example");
        setSize(450, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(jbt);
        add(jscroll);

        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                jta1.append(txt);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }

}

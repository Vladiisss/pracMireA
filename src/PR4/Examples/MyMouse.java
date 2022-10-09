package PR4.Examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouse extends JFrame {
    JLabel lbl = new JLabel("");

    public MyMouse() {
        super("Dude! Where's my mouse ?");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        setLayout(new BorderLayout());
        // Почему левый нижний угол, а не нижний центр
        add(lbl, BorderLayout.SOUTH);

        addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }


            public void mouseClicked(MouseEvent a) {
                lbl.setText("X=" + a.getX() + " Y=" + a.getY());
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }

        });
    }

    public static void main(String[] args) {
        new MyMouse().setVisible(true);
    }
}
package PR4.y1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    JLabel lbl1 = new JLabel("Result 0 X 0", SwingConstants.CENTER);
    JLabel lbl2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel lbl3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    private int pointRM = 0;
    private int pointMil = 0;


    public Game() {

        super("Game \"Football\"");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 3));
        add(button1);
        add(lbl1);
        add(button2);
        add(lbl2);
        add(lbl3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pointMil++;
                lbl1.setText("Result: " + pointMil + " X " + pointRM);
                lbl2.setText("Last Scorer: AC Milan");
                lbl3.setText("Winner: " + whoWon());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pointRM++;
                lbl1.setText("Result: " + pointMil + " X " + pointRM);
                lbl2.setText("Last Scorer: Real Madrid");
                lbl3.setText("Winner: " + whoWon());
            }
        });
    }

    private String whoWon() {

        if (pointMil > pointRM) {
            return "AC Milan";
        }
        else if (pointMil < pointRM) {
            return "Real Madrid";
        }
        else {
            return "DRAW";
        }
    }


    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}

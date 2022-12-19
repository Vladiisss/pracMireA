package LAB16.windows;

import PR16.orders.OrdersManager;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    OrdersManager ordersManager = new OrdersManager();










    private JMenu jMenu = new JMenu("Menu");
    private JMenuItem menuItem1 = new JMenuItem("MenuItem1");
    private JMenuItem menuItem2 = new JMenuItem("MenuItem2");
    private JMenuItem menuItem3 = new JMenuItem("MenuItem3");
    private JMenuItem menuItem4 = new JMenuItem("MenuItem4");

    public MainWindow(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 768);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();
        //jPanel.setBackground(new Color(223, 211, 211));
        //add(jPanel);

        this.setBackground(Color.black);
        getContentPane();

        JMenuBar menuBar = new JMenuBar();
        jMenu.add(menuItem1);
        jMenu.add(menuItem2);
        jMenu.add(menuItem3);
        jMenu.add(menuItem4);
        menuBar.add(jMenu);
        jPanel.add(menuBar);
        setJMenuBar(menuBar);


    }
}

import javax.swing.*;
public class Picture
{
    Picture() {
        JFrame f = new JFrame("Add an image to JFrame");
        ImageIcon icon = new ImageIcon("D:\\vkycno.png");
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Picture();
    }
}


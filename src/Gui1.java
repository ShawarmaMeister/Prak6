import java.awt.*;
        import javax.swing.*;

public class Gui1 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panel= new JPanel();
        panel.setBackground(new Color(115, 255, 154));
        panel.setPreferredSize( new Dimension(300,300));
        JLabel label = new JLabel("Привет МИР!!!");


        label.setForeground(new Color(255, 84, 10));
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
import java.awt.*;
import javax.swing.*;

public class Gui3 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(115, 255, 154));
        panel1.setPreferredSize(new Dimension(500, 500));

        JLabel label1 = new JLabel("Кане Вест");
        label1.setForeground(new Color(255, 84, 10));
        label1.setFont(new Font("Courier", Font.BOLD, 24));

        ImageIcon imageIcon1 = new ImageIcon("C:/Users/ShawarmaMeister/Downloads/f6285960dafff1ff62f24515459cdabe.jpg");
        JLabel imageLabel1 = new JLabel(imageIcon1);

        panel1.add(label1);
        panel1.add(imageLabel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0, 0, 0));
        panel2.setPreferredSize(new Dimension(500, 500));

        JLabel label2 = new JLabel("A$AP ROCKY");
        label2.setForeground(Color.YELLOW);
        label2.setFont(new Font("Courier", Font.BOLD, 20));

        ImageIcon imageIcon2 = new ImageIcon("C:/Users/ShawarmaMeister/Downloads/1025736024.jpg");
        JLabel imageLabel2 = new JLabel(imageIcon2);

        panel2.add(label2);
        panel2.add(imageLabel2);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        frame.getContentPane().add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
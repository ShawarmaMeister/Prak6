import java.awt.*;
import javax.swing.*;
public class Gui2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Gui2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(115, 255, 154));
        panel1.setPreferredSize(new Dimension(200, 300));

        JLabel label1 = new JLabel("Пиво");
        label1.setForeground(new Color(255, 84, 10));
        label1.setFont(new Font("Courier", Font.BOLD, 24));

        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(65, 242, 242));
        panel2.setPreferredSize(new Dimension(200, 300));

        JLabel label2 = new JLabel("Аниме");
        label1.setForeground(new Color(240, 134, 236));
        label2.setFont(new Font("Courier", Font.BOLD, 20));

        panel2.add(label2);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Добавляем основную панель к фрейму
        frame.getContentPane().add(mainPanel);

        // Упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
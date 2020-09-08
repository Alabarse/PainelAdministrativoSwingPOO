import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        // Criando Container
        JFrame frame = new JFrame();
        JPanel MyJPanel = new JPanel();
        MyJPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        MyJPanel.setLayout(new GridLayout(0,1));

        frame.add(MyJPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MKN");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(750,650);
        frame.setLocation(335,50);

        // Criando  
    }
}

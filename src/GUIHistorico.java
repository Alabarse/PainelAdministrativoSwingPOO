import javax.swing.*;
import java.awt.*;


public class GUIHistorico {
    public GUIHistorico () {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Histórico de Vendas");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 320);
        frame.setLocation(335, 50);
        frame.setResizable(true);

        // Criação das labels

        JLabel lblDede = new JLabel("Dede");
        panel.add(lblDede);
        lblDede.setLocation(20,20);
        JLabel lblValorDede = new JLabel("0");

        JLabel lblBahia = new JLabel("Bahia");
        JLabel lblValorBahia = new JLabel("0");

        JLabel lblFurtado = new JLabel("Furtado");
        JLabel lblValorFurtado = new JLabel("0");

        JLabel lblZoio = new JLabel("Zoio");
        JLabel lblValorZoio = new JLabel("0");
    }

    public static void main(String[] args) {
        new GUIHistorico();
    }
}

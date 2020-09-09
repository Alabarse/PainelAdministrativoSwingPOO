import javax.swing.*;
import java.awt.*;

public class GUIVendas {
    public GUIVendas() {

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);

        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Acrescentar Vendas");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(325,300);


        // Criando label e texteFIELD nome do vendedor
        JLabel labelNomeVendedor = new JLabel("Vendedor:");
        panel.add(labelNomeVendedor);
        labelNomeVendedor.setSize(100, 100);
        labelNomeVendedor.setLocation(50,75);

        JTextField quantiaVendida = new JTextField();
        panel.add(quantiaVendida);
        quantiaVendida.setSize(80,20);
        quantiaVendida.setLocation(124, 140);

        // Criando label e textFIELD quantia vendida
        JLabel labelQuantiaVendida = new JLabel("Quantia:");
        panel.add(labelQuantiaVendida);
        labelQuantiaVendida.setSize(100, 100);
        labelQuantiaVendida.setLocation(50, 100);

        JTextField nomeVendedor = new JTextField();
        panel.add(nomeVendedor);
        nomeVendedor.setSize(80,20);
        nomeVendedor.setLocation(124, 116);



    }

    public static void main(String[] args) {
        new GUIVendas();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

public class GUIVendas implements InterfaceVendas {

    // Atribuição de entidades

    JTextField quantiaVendida;
    JTextField nomeVendedor;
    JPanel panel;
    JFrame frame;

    public GUIVendas() {

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Acrescentar Vendas");
        frame.pack();
        frame.setLocation(550, 200);
        frame.setVisible(true);
        frame.setSize(325,300);


        // Criando label e texteFIELD nome do vendedor
        JLabel labelNomeVendedor = new JLabel("Vendedor:");
        panel.add(labelNomeVendedor);
        labelNomeVendedor.setSize(100, 100);
        labelNomeVendedor.setLocation(70,65);

        quantiaVendida = new JTextField();
        panel.add(quantiaVendida);
        quantiaVendida.setSize(80,20);
        quantiaVendida.setLocation(144, 130);

        // Criando label e textFIELD quantia vendida
        JLabel labelQuantiaVendida = new JLabel("Quantia:");
        panel.add(labelQuantiaVendida);
        labelQuantiaVendida.setSize(100, 100);
        labelQuantiaVendida.setLocation(70, 90);

        nomeVendedor = new JTextField();
        panel.add(nomeVendedor);
        nomeVendedor.setSize(80,20);
        nomeVendedor.setLocation(144, 106);

        // Criando botão para efetuar calculo
        JButton calculador = new JButton("Calcular");
        panel.add(calculador);
        calculador.setSize(100,25);
        calculador.setLocation(125,165);
        calculador.addActionListener(calcular);

    }

    public static void main(String[] args) { new GUIVendas(); }

    // Ação de calculo

    ActionListener calcular = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            checagemDeVendedor();
        }
    };

    @Override
    public void checagemDeVendedor() {
        String nome = nomeVendedor.getText();
        if (nome.equalsIgnoreCase("Bahia")) {

        }else if (nome.equalsIgnoreCase("Zoio")) {

        }else if (nome.equalsIgnoreCase("Furtado")) {

        }else if (nome.equalsIgnoreCase("Dede")) {

        }else {
            JOptionPane.showMessageDialog(null,"Vendedor inexistente");
            System.out.println("Funcionando");
        }
    }

    @Override
    public void calcularAsVendas() {

    }

    @Override
    public void salvarHistorico() {

    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public GUI() {
        // Criando interface

        JPanel MyJPanel = new JPanel();
        MyJPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        MyJPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.add(MyJPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MKN");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(750, 650);
        frame.setLocation(335, 50);
        frame.setResizable(true);
        frame.setPreferredSize(new Dimension(750, 650));

        // Criação e designer do  nome da marca
        JLabel nomeDaMarca = new JLabel("MKN");
        nomeDaMarca.setFont(new Font("Serif", Font.ITALIC, 100));
        nomeDaMarca.setSize(350, 250);
        MyJPanel.add(nomeDaMarca);

        // Criação e designer do botão para adicionar venda
        JButton btnAcrescentarVenda = new JButton("Acrescentar vendas");
        MyJPanel.add(btnAcrescentarVenda);
        btnAcrescentarVenda.setSize(430, 70);
        btnAcrescentarVenda.setLocation(0, 544);
        btnAcrescentarVenda.addActionListener(adicionarVendas);

        // Criação e designer do botão para visualizar vendas
        JButton btnHistoricoVendas = new JButton("Visualizar historico");
        MyJPanel.add(btnHistoricoVendas);
        btnHistoricoVendas.setSize(430, 70);
        btnHistoricoVendas.setLocation(0, 475);
        btnHistoricoVendas.addActionListener(mostrarHistorico);

        // Criação e designer do botão para fechar o caixa
        JButton btnFecharCaixa = new JButton("Fechar o caixa");
        MyJPanel.add(btnFecharCaixa);
        btnFecharCaixa.setSize(320, 140);
        btnFecharCaixa.setLocation(430, 475);
        btnFecharCaixa.addActionListener(fecharCaixa);
    }


    public static void main(String[] args) {
        new GUI();
    }

    // Ação para fechar o caixa
    ActionListener fecharCaixa = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    // Ação para mostrar historico de vendas
    ActionListener mostrarHistorico = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    // Ação para adicionar vendas
    ActionListener adicionarVendas = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new GUIVendas();
        }
    };


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}

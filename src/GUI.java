import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JPanel MyJPanel;
    JFrame frame;

    // GUI Vendas

    JTextField quantiaVendida;
    JTextField nomeVendedor;
    JPanel panel;
    JFrame Vframe;

    // GUI Historico

    JFrame historicoFrame;
    JPanel historicoPanel;

    JLabel lblValorDede;
    JLabel lblValorBahia;
    JLabel lblValorZoio;
    JLabel lblValorFurtado;
    String sValorTotald = "0";
    String sValorTotalb = "0";
    String sValorTotalf = "0";
    String sValorTotalz = "0";

    public void calcularAsVendas() {
        String nome = nomeVendedor.getText();
        double quantidadeVendida = Double.parseDouble(quantiaVendida.getText());
        double valorTotal;
        if (nome.equalsIgnoreCase("Dede")) {
            double dValorDede = Double.parseDouble(lblValorDede.getText());
            valorTotal = dValorDede + quantidadeVendida;
            sValorTotald = Double.toString(valorTotal);
        }else if (nome.equalsIgnoreCase("Bahia")) {
            double dValorBahia = Double.parseDouble(lblValorBahia.getText());
            valorTotal = dValorBahia + quantidadeVendida;
             sValorTotalb = Double.toString(valorTotal);
        }else if (nome.equalsIgnoreCase("Furtado")) {
            double dValorFurtado = Double.parseDouble(lblValorFurtado.getText());
            valorTotal = dValorFurtado + quantidadeVendida;
            sValorTotalf = Double.toString(valorTotal);
        }else if (nome.equalsIgnoreCase("Zoio")) {
            double dValorZoio = Double.parseDouble(lblValorZoio.getText());
            valorTotal = dValorZoio + quantidadeVendida;
            sValorTotalz = Double.toString(valorTotal);
        }else {
            JOptionPane.showMessageDialog(null, "Vendedor não existente!");
        }

    }

  public void GUIHistorico() {

          historicoPanel = new JPanel();
          historicoPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
          historicoPanel.setLayout(null);

          historicoFrame = new JFrame();
          historicoFrame.add(historicoPanel, BorderLayout.CENTER);
          historicoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          historicoFrame.setTitle("Histórico de Vendas");
          historicoFrame.pack();
          historicoFrame.setVisible(true);
          historicoFrame.setSize(300, 320);
          historicoFrame.setLocation(550, 200);
          historicoFrame.setResizable(true);

          // Criação das labels

          JLabel lblDede = new JLabel("Dede");
          historicoPanel.add(lblDede);
          lblDede.setLocation(20,20);
          lblDede.setSize(50,50);

          lblValorDede = new JLabel("0");
          historicoPanel.add(lblValorDede);
          lblValorDede.setLocation(35,40);
          lblValorDede.setSize(50,50);
          lblValorDede.setText(sValorTotald);

          JLabel lblBahia = new JLabel("Bahia");
          historicoPanel.add(lblBahia);
          lblBahia.setLocation(200,10);
          lblBahia.setSize(70,70);

          lblValorBahia = new JLabel("0");
          historicoPanel.add(lblValorBahia);
          lblValorBahia.setLocation(216,40);
          lblValorBahia.setSize(50,50);
          lblValorBahia.setText(sValorTotalb);

          JLabel lblFurtado = new JLabel("Furtado");
          historicoPanel.add(lblFurtado);
          lblFurtado.setLocation(20,140);
          lblFurtado.setSize(70,70);

          lblValorFurtado = new JLabel("0");
          historicoPanel.add(lblValorFurtado);
          lblValorFurtado.setLocation(35,170);
          lblValorFurtado.setSize(50,50);
          lblValorFurtado.setText(sValorTotalf);

          JLabel lblZoio = new JLabel("Zoio");
          historicoPanel.add(lblZoio);
          lblZoio.setLocation(200,140);
          lblZoio.setSize(70,70);

          lblValorZoio = new JLabel("0");
          historicoPanel.add(lblValorZoio);
          lblValorZoio.setLocation(216,170);
          lblValorZoio.setSize(50,50);
          lblValorZoio.setText(sValorTotalz);

  }

  public void GUIPrincipal() {
      // Criando interface

      MyJPanel = new JPanel();
      MyJPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
      MyJPanel.setLayout(null);

      frame = new JFrame();
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

      // Criação e designer do botão para fechar o caixa
      JButton btnFecharCaixa = new JButton("Fechar o caixa");
      MyJPanel.add(btnFecharCaixa);
      btnFecharCaixa.setSize(320, 140);
      btnFecharCaixa.setLocation(430, 475);
      btnFecharCaixa.addActionListener(fecharCaixa);

      // Criação e designer do botão para visualizar vendas
      JButton btnHistoricoVendas = new JButton("Visualizar historico");
      MyJPanel.add(btnHistoricoVendas);
      btnHistoricoVendas.setSize(430, 70);
      btnHistoricoVendas.setLocation(0, 475);
      btnHistoricoVendas.addActionListener(mostrarHistorico);

  }

  public void GUIVendas() {
      panel = new JPanel();
      panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
      panel.setLayout(null);

      Vframe = new JFrame();
      Vframe.add(panel, BorderLayout.CENTER);
      Vframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      Vframe.setTitle("Acrescentar Vendas");
      Vframe.pack();
      Vframe.setLocation(550, 200);
      Vframe.setVisible(true);
      Vframe.setSize(325,300);


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

    public GUI() {
        GUIPrincipal();
    }


    public static void main(String[] args) {
        new GUI();
    }

     // Ação para calcular vendas
    ActionListener calcular = actionEvent -> calcularAsVendas();

    // Ação para fechar o caixa
    ActionListener fecharCaixa = e -> {

    };


    // Ação para abrir GUI de vendas
    ActionListener adicionarVendas = e -> GUIVendas();

    // Ação para abrir GUI do historico
    ActionListener mostrarHistorico = e -> GUIHistorico();


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}

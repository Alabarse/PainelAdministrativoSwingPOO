public interface InterfaceVendas {
     String vendedor = "";
     double valorVendido = 0;
     double valorDoBahia = 0;
     double valorDoFurtado = 0;
     double valorDoZoio = 0;
     double valorDoDede = 0;


    // Metodos especiais

    public void checagemDeVendedor();

    public void calcularAsVendas();

    public void salvarHistorico();

}

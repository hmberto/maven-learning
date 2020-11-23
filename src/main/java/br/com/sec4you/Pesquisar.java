public class Pesquisar {
    private int codigoEquipamento;
    private String nomeEquipamento;
    private String modelo;
    private String fabricante;
    private float valorSemImposto;
    private float valorComImposto;
    private int quantidadeEstoque;

    public Pesquisar(int codigoEquipamento, String nomeEquipamento, String modelo, String fabricante, float valorSemImposto, float valorComImposto, int quantidadeEstoque) {
        this.codigoEquipamento = codigoEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.valorSemImposto = valorSemImposto;
        this.valorComImposto = valorComImposto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigoEquipamento() {
        return codigoEquipamento;
    }
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public float getValorSemImposto() {
        return valorSemImposto;
    }
    public float getValorComImposto() {
        return valorComImposto;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setCodigoEquipamento(int codigoEquipamento) {
        this.codigoEquipamento = codigoEquipamento;
    }
    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setValorSemImposto(float valorSemImposto) {
        this.valorSemImposto = valorSemImposto;
    }
    public void setValorComImposto(float valorComImposto) {
        this.valorComImposto = valorComImposto;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString(){
        String resultado = "Código do equipamento: " + codigoEquipamento + "\nNome do equipamento: " + nomeEquipamento + "\nModelo: " + modelo + "\nFabricante: " + fabricante + "\nValor sem imposto: R$" + valorSemImposto + "\nValor com imposto: R$" + valorComImposto + "\nQuantidade em estoque: " + quantidadeEstoque;
        return resultado;
    }
}

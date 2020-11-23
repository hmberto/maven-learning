import javax.swing.JOptionPane;
public class TotalImpostos extends Forma {
    private int estoque;
    private float valor;

    public TotalImpostos() {
    }

    public TotalImpostos(int estoque, float valor) {
        this.estoque = estoque;
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }
    public float getValor() {
        return valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public float calculaTotal(){
        return valor*estoque;
    }
    public void mostra(){
        JOptionPane.showMessageDialog(null, calculaTotal());
    }
}

package br.com.humberto;

import javax.swing.JOptionPane;
public class CalcTotalTaxes extends CalcAbstractClass {
    private int estoque;
    private float valor;

    public CalcTotalTaxes() {
    }

    public CalcTotalTaxes(int estoque, float valor) {
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

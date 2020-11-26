package br.com.sec4you;

import javax.swing.JOptionPane;
public class MediaPrecos extends Forma {
    private float totalPrecos;
    private int mediaPrecos;

    public MediaPrecos() {
    }

    public MediaPrecos(float totalPrecos, int mediaPrecos) {
        this.totalPrecos = totalPrecos;
        this.mediaPrecos = mediaPrecos;
    }

    public float getTotalPrecos() {
        return totalPrecos;
    }
    public int getMediaPrecos() {
        return mediaPrecos;
    }

    public void setTotalPrecos(float totalPrecos) {
        this.totalPrecos = totalPrecos;
    }
    public void setMediaPrecos(int mediaPrecos) {
        this.mediaPrecos = mediaPrecos;
    }

    @Override
    public float calculaTotal(){
        return totalPrecos/mediaPrecos;
    }
    public void mostra(){
        JOptionPane.showMessageDialog(null, "Média de preços para o modelo digitado: \nR$" + calculaTotal());
    }
}

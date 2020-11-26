package br.com.sec4you;

import javax.swing.JOptionPane;
public class EstudosJava {
    public static void main(String[] args) {
        String quant = "";
        
        while(quant.equals("")){
            quant  = JOptionPane.showInputDialog("quantidade de novos cadastros:");
        }
        int quantidade = Integer.parseInt(quant);

        String[] arrayCodigoEquipamento;
        arrayCodigoEquipamento = new String[100];
        String[] arrayNomeEquipamento;
        arrayNomeEquipamento = new String[100];
        String[] arrayModelo;
        arrayModelo = new String[100];
        String[] arrayFabricante;
        arrayFabricante = new String[100];
        String[] arrayValorSemImposto;
        arrayValorSemImposto = new String[100];
        String[] arrayValorComImposto;
        arrayValorComImposto = new String[100];
        String[] arrayQuantidadeEstoque;
        arrayQuantidadeEstoque = new String[100];

        int ask = 0;
        int busca = 0;
        int altera = 0;
        int somaEstoque = 0;
        float somaQuantComImposto = 0.0f;
        float totalImposto = 0.0f;
        float totalPrecos = 0.0f;
        int mediaPrecos = 0;
        String dados;

        for(int i = 1; i <= quantidade; i++){

            arrayCodigoEquipamento[i] = "";
            while(arrayCodigoEquipamento[i].equals("")){
                arrayCodigoEquipamento[i] = JOptionPane.showInputDialog("código do equipamento:");
            }
            arrayNomeEquipamento[i] = "";
            while(arrayNomeEquipamento[i].equals("")){
                arrayNomeEquipamento[i] = JOptionPane.showInputDialog("nome do equipamento:");
            }
            arrayModelo[i] = "";
            while(arrayModelo[i].equals("")){
                arrayModelo[i] = JOptionPane.showInputDialog("modelo:");
            }
            arrayFabricante[i] = "";
            while(arrayFabricante[i].equals("")){
                arrayFabricante[i] = JOptionPane.showInputDialog("fabricante:");
            }
            arrayValorSemImposto[i] = "";
            while(arrayValorSemImposto[i].equals("")){
                arrayValorSemImposto[i] = JOptionPane.showInputDialog("valor sem imposto:\nEx: '99.9'");
            }
            arrayValorComImposto[i] = "";
            while(arrayValorComImposto[i].equals("")){
                arrayValorComImposto[i] = JOptionPane.showInputDialog("valor com imposto:\nEx: '99.9'");
            }
            arrayQuantidadeEstoque[i] = "";
            while(arrayQuantidadeEstoque[i].equals("")){
                arrayQuantidadeEstoque[i] = JOptionPane.showInputDialog("quantidade em estoque:");
            }

            while(i == quantidade){
                String entry = "";
                while(entry.equals("")){
                    entry = JOptionPane.showInputDialog("1 - Cadastrar novo \n2 - Pesquisar produto \n3 - Alterar produto \n4 - Total do imposto (fabricante) \n5 - Média de preços de um modelo \n6 - Maior quantidade em estoque \n7 - Sair");
                }
                ask = Integer.parseInt(entry);
                
                if(ask == 1){
                    quantidade += 1;
                }
                if(ask == 2){
                    String entryBusca = "";
                    while(entryBusca.equals("")){
                        entryBusca  = JOptionPane.showInputDialog("código do equipamento:");
                    }
                    busca = Integer.parseInt(entryBusca);

                    boolean verifica = false;

                    for(int k = 1; k <= arrayCodigoEquipamento.length; k++){
                        try{
                            Integer.parseInt(arrayCodigoEquipamento[k]);
                            if(busca == Integer.parseInt(arrayCodigoEquipamento[k])){
                                verifica = true;
                                int codigoEquipamento = Integer.parseInt(arrayCodigoEquipamento[k]);
                                String nomeEquipamento = arrayNomeEquipamento[k];
                                String modelo = arrayModelo[k];
                                String fabricante = arrayFabricante[k];
                                float valorSemImposto = Float.parseFloat(arrayValorSemImposto[k]);
                                float valorComImposto = Float.parseFloat(arrayValorComImposto[k]);
                                int quantidadeEstoque = Integer.parseInt(arrayQuantidadeEstoque[k]);

                                Pesquisar v = new Pesquisar(codigoEquipamento, nomeEquipamento, modelo, fabricante, valorSemImposto, valorComImposto, quantidadeEstoque);
                                JOptionPane.showMessageDialog(null, v.toString());
                            }
                        }
                        catch(Exception e){}
                    }
                    if(verifica == false){
                        JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
                    }
                }
                if(ask == 3){
                    String entryAltera = "";
                    while(entryAltera.equals("")){
                        entryAltera = JOptionPane.showInputDialog("código do equipamento:");
                    }
                    altera = Integer.parseInt(entryAltera);

                    boolean verifica = false;

                    for(int j = 1; j <= arrayCodigoEquipamento.length; j++){
                        try{
                            Integer.parseInt(arrayCodigoEquipamento[j]);
                            if(altera == Integer.parseInt(arrayCodigoEquipamento[j])){
                                arrayNomeEquipamento[j] = JOptionPane.showInputDialog("código do equipamento: " + arrayCodigoEquipamento[j] + " \nnovo nome do equipamento:");
                                arrayModelo[j] = JOptionPane.showInputDialog("novo modelo:");
                                arrayFabricante[j] = JOptionPane.showInputDialog("novo fabricante:");
                                arrayValorSemImposto[j] = JOptionPane.showInputDialog("novo valor sem imposto:\nEx: '99.9'");
                                arrayValorComImposto[j] = JOptionPane.showInputDialog("novo valor com imposto:\nEx: '99.9'");
                                arrayQuantidadeEstoque[j] = JOptionPane.showInputDialog("novo quantidade em estoque:");

                                int codigoEquipamento = Integer.parseInt(arrayCodigoEquipamento[j]);
                                String nomeEquipamento = arrayNomeEquipamento[j];
                                String modelo = arrayModelo[j];
                                String fabricante = arrayFabricante[j];
                                float valorSemImposto = Float.parseFloat(arrayValorSemImposto[j]);
                                float valorComImposto = Float.parseFloat(arrayValorComImposto[j]);
                                int quantidadeEstoque = Integer.parseInt(arrayQuantidadeEstoque[j]);

                                Pesquisar v = new Pesquisar(codigoEquipamento, nomeEquipamento, modelo, fabricante, valorSemImposto, valorComImposto, quantidadeEstoque);
                                JOptionPane.showMessageDialog(null, v.toString());

                                verifica = true;
                            }
                        }
                        catch(Exception e){}
                    }
                    if(verifica == false){
                        JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
                    }
                }
                if(ask == 4){
                    TotalImpostos v;
                    somaEstoque = 0;
                    totalImposto = 0.0f;
                    somaQuantComImposto = 0;
                    String entryFabricante = "";
                    while(entryFabricante.equals("")){
                        entryFabricante = JOptionPane.showInputDialog("nome do fabricante:");
                    }

                    boolean verifica = false;

                    for(int l = 0; l < arrayFabricante.length; l++){
                        if(entryFabricante.equals(arrayFabricante[l])){
                            somaEstoque = Integer.parseInt(arrayQuantidadeEstoque[l]);
                            somaQuantComImposto = Float.parseFloat(arrayValorComImposto[l]);

                            v = new TotalImpostos(somaEstoque, somaQuantComImposto);
                            totalImposto += v.calculaTotal();

                            verifica = true;
                        }
                    }
                    if(verifica){
                        JOptionPane.showMessageDialog(null, "total do imposto do fabricante '" + entryFabricante + "': \nR$" + (float)totalImposto);
                    }
                    else if(verifica == false){
                        JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
                    }
                }
                if(ask == 5){
                    totalPrecos = 0.0f;
                    mediaPrecos = 0;
                    String entryModelo = "";
                    boolean verifica = false;
                    while(entryModelo.equals("")){
                        entryModelo = JOptionPane.showInputDialog(null, "procurar por modelo:");
                    }
                    for(int m = 0; m < arrayModelo.length; m++){
                        if(entryModelo.equals(arrayModelo[m])){
                            totalPrecos = totalPrecos + Float.parseFloat(arrayValorComImposto[m]);
                            mediaPrecos += 1;
                            verifica = true;
                        }
                    }
                    if(verifica){
                        MediaPrecos s = new MediaPrecos(totalPrecos, mediaPrecos);
                        s.mostra();
                    }
                    else if(verifica == false){
                        JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
                    }
                }
                if(ask == 6){
                    dados = "";
                    int maior = Integer.MIN_VALUE;
                    String entryModelo2 = "";

                    boolean verifica = false;

                    while(entryModelo2.equals("")){
                        entryModelo2 = JOptionPane.showInputDialog(null, "procurar por modelo:");
                    }
                    for(int n = 0; n < arrayModelo.length; n++){
                        if(entryModelo2.equals(arrayModelo[n])){
                            if(Integer.parseInt(arrayQuantidadeEstoque[n]) > maior) {
                                maior = Integer.parseInt(arrayQuantidadeEstoque[n]);

                                dados = "Produto com maior estoque: \n\nCódigo do equipamento: " + arrayCodigoEquipamento[n] + "\nNome: " + arrayNomeEquipamento[n] + "\nModelo: " + arrayModelo[n] + "\nFabrifante: " + arrayFabricante[n] + "\nValor sem Imposto: R$" + arrayValorSemImposto[n] + "\nValor com Imposto: R$" + arrayValorComImposto[n] + "\nQuantidade em Estoque: " + arrayQuantidadeEstoque[n];

                                verifica = true;
                            }
                        }
                    }
                    if(verifica){
                        JOptionPane.showMessageDialog(null, dados);
                    }
                    else if(verifica == false){
                        JOptionPane.showMessageDialog(null, "nenhum registro encontrado");
                    }
                }
                if(ask == 7){
                    System.exit(0);
                }
            }
        }
    }
}
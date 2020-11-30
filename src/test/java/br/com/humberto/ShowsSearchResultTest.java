package br.com.humberto;

import junit.framework.TestCase;

public class ShowsSearchResultTest extends TestCase {
	public void testResults() {
		
		int codigoEquipamento = 123;
	    String nomeEquipamento = "EQUIPAMENTO";
	    String modelo = "753X4";
	    String fabricante = "EU";
	    float valorSemImposto = 114.9f;
	    float valorComImposto = 129.99f;
	    int quantidadeEstoque = 43;
	    
        String expectedResult = "Código do equipamento: " + codigoEquipamento + "\nNome do equipamento: " + nomeEquipamento + "\nModelo: " + modelo + "\nFabricante: " + fabricante + "\nValor sem imposto: R$" + valorSemImposto + "\nValor com imposto: R$" + valorComImposto + "\nQuantidade em estoque: " + quantidadeEstoque;
		
        ShowsSearchResult h = new ShowsSearchResult(codigoEquipamento, nomeEquipamento, modelo, fabricante, valorSemImposto, valorComImposto, quantidadeEstoque);

        assertTrue(h.toString().equals(expectedResult));
        
	}
}
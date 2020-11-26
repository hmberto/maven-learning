package br.com.sec4you;

import javax.swing.JOptionPane;

import junit.framework.TestCase;

public class TotalImpostosTest extends TestCase {
	public void testCalculaTotal() {
		TotalImpostos v = new TotalImpostos(15, 9.9f);
        v.calculaTotal();
        
        float expectedResult = 148.5f;
        
		assertTrue(v.calculaTotal() == expectedResult);
	}
}
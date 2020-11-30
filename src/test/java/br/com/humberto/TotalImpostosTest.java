package br.com.humberto;

import junit.framework.TestCase;

public class TotalImpostosTest extends TestCase {
	public void testCalculaTotal() {
		TotalImpostos v = new TotalImpostos(15, 9.9f);
                
		assertTrue(v.calculaTotal() == 148.5f);
	}
}
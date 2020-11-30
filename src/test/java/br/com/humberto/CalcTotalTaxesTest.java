package br.com.humberto;

import junit.framework.TestCase;

public class CalcTotalTaxesTest extends TestCase {
	public void testCalculaTotal() {
		CalcTotalTaxes v = new CalcTotalTaxes(15, 9.9f);
                
		assertTrue(v.calculaTotal() == 148.5f);
	}
}
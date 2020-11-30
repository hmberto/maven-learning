package br.com.humberto;

import junit.framework.TestCase;

public class CalcPricesAverageTest extends TestCase {
	public void testTotal() {
		CalcPricesAverage s = new CalcPricesAverage(149.9f, 8);
		
		//assertTrue(s.calculaTotal() == 18.7375f);
		assertEquals(18.7375f, s.calculaTotal());
	}
}
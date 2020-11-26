package br.com.sec4you;

import junit.framework.TestCase;

public class MediaPrecosTest extends TestCase {
	public void testMediPrecos() {
		MediaPrecos s = new MediaPrecos(149.9f, 8);
		
		assertTrue(s.calculaTotal() == 18.7375f);
	}
}

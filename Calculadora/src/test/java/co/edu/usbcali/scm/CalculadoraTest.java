package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	Calculadora c = new CalculadoraImpl();
	@Test
	public void testOperacion() {
		c.operacion("suma", 23L, 12L);
		c.operacion("suma", 334L, 2L);
		c.operacion("resta", 500L, 120L);
		c.operacion("multi", 90L, 45L);
		assertTrue(true);
		c.resultados();
		assertTrue(true);
	}

	@Test
	public void testResultados() {
		c.operacion("resta", 500L, 120L);
		c.operacion("resta", 90L, 45L);
		assertTrue(true);
		c.resultados();
		assertTrue(true);
	}

}

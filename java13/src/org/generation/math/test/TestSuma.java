package org.generation.math.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.generation.math.Suma;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestSuma {
	@Test
	@DisplayName("Sumatoria de números enteros positivos")
 void testSumaEnteros() {
		Suma suma = new Suma();
		assertEquals(10,suma.sumaEnteros(5,5));
		
	}
	@Test
	@DisplayName("Sumatoria de números enteros negativos")
 void testSumaUnNegativo() {
		Suma suma = new Suma();
		assertEquals(8,suma.sumaEnteros(-5,8));
		
	}
	

	@Test
	@DisplayName("Sumatoria de números flotantes")
 void testSumaFlotante() {
		Suma suma = new Suma();
		assertEquals(10.5F,suma.sumaEnteros(5.3F,5.2F),0);
		
	}
	
	@Test
	@DisplayName("Resultado positivo")
 void isPositive() {
		Suma suma = new Suma();
		assertTrue(suma.sumaEnteros(5,5) > 0);
		
	}
}

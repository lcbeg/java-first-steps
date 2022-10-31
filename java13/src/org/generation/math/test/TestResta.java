package org.generation.math.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.generation.math.Resta;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestResta {
	@Test
	@DisplayName("Resta de números enteros positivos")
 void testSumaEnteros() {
		Resta resta = new Resta();
		assertEquals(0,resta.restaEnteros(5,5));
		
	}
	
}

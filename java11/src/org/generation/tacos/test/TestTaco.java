package org.generation.tacos.test;

import org.generation.tacos.entity.Taco;
import org.generation.tacos.entity.TacoPastor;

public class TestTaco {

	public static void main(String[] args) {
		Taco tacoGenerico = new Taco("Taco genérico", "maiz");
		
		System.out.println(tacoGenerico);
		
		TacoPastor tacoAlPastor = new TacoPastor("Taco al pastor", "maíz", false, 3, false);
		
		System.out.println(tacoAlPastor);
		
		System.out.println("Oferta taco al pastor: " + tacoAlPastor.oferta());
	}

}

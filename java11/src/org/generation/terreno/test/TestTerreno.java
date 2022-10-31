package org.generation.terreno.test;

import java.util.ArrayList;
import java.util.List;

import org.generation.terreno.entity.Terreno;
import org.generation.terreno.entity.TerrenoBaldio;
import org.generation.terreno.entity.TerrenoConCasa;

public class TestTerreno {

	public static void main(String[] args) {
		
		//Terreno miNavidad = new Terreno("Abuela", 20, 40,"La abuela");
		
		Terreno miNavidad = new TerrenoConCasa("Abuela", 20, 40,"La abuela");
		
		System.out.println(miNavidad);
		System.out.println(miNavidad.formaDeObtenerlo());
		
		Terreno peorEsNada = new TerrenoBaldio("Peor es nada", 40, 80, "Nadie");
		System.out.println(peorEsNada);
		System.out.println(peorEsNada.formaDeObtenerlo());
		
		//peorEsNada = new TerrenoConCasa("Mi Rancho", 40, 80, "Se lo compré a Sergio");
	    List<Terreno> misPropiedades;
	    
	    misPropiedades = new ArrayList<Terreno>();
	    misPropiedades.add(peorEsNada);
	    misPropiedades.add(miNavidad);
	    
	    System.out.println("============= CÓMO OBTUVE MIS PROPIEDADES============");
	    misPropiedades.forEach(terreno -> System.out.println(terreno.formaDeObtenerlo()));
	}

}

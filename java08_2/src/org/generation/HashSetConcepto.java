package org.generation;
import java.util.HashSet;

public class HashSetConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ordenada de elementos.
		 * No se permiten elementos duplicados,
		 * por lo que cualquier elemento duplicado no se insertará.
		 */
		//DEfinimos una colección HashSet
		
		HashSet<String> paises = new HashSet<String>();
		
		paises.add("México");
		paises.add("Italia");
		paises.add("Alemania");
		paises.add("Brasil");
		paises.add("Costa de Marfil");
		paises.add("Nueva Zelanda");
		paises.add("Alemania");
		
		System.out.println(paises);
		
		System.out.println("No. paises = " + paises.size());
		
		boolean paisExistente = paises.contains("Italia");
		
		if (paisExistente) paises.remove("Italia");
		System.out.println(paises);
		
		paises.forEach(pais -> System.out.println("País: " + pais));
		
		for (String pais: paises) System.out.println(pais);
		
	}
}

package org.generation;

import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		/**
		 * Una colección Map es una relación de llave (key)-valor
		 * que forma una especie de tabla de datos
		 */
		
		//Definimos un tipo de colección HashMap
		HashMap<Integer, String> amores = new HashMap<Integer,String>();
		
		//Agregamos valores a nuestra colección
		
		amores.put(20201011, "Legolas");
		amores.put(20211001, "Asami Sato");
		amores.put(19991201, "Chayanne");
		amores.put(20201111, "Legolas");
		amores.put(20201211, "Juanes");
		amores.put(20201311, "Gerard Way");
		amores.put(20201011, "Legolas");
		
		System.out.println(amores);
		
		System.out.println("No. de amores: " + amores.size());
		
		System.out.println("Mi gran gran amor es: " + amores.get(20211001));
		
		amores.remove(20201011);
		
		for (int fechaAniversario : amores.keySet())
			System.out.println("EL día de " + fechaAniversario + " conocí a: " + amores.get(fechaAniversario));
		
		if (amores.containsValue("Chayanne"))
			System.out.println("Bailaste Torero");
	}

}

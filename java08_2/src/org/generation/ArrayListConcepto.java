package org.generation;

import java.util.ArrayList;

public class ArrayListConcepto {
	
	public static void main(String[] args) {
		
		/**
		 * Una lista es una coleción ordenada en la que se permieten elementos duplicados.
		 * Se basa en un array redimensionable que crece su tamaño según crece la colección de elementos.
		 * 
		 * Es la colección con mejor rendimiento.
		 * 
		 * Sintaxis:
		 * ArrayList<object> varName;
		 */
		
		//Definimos una colección de tipo String;
		
		ArrayList<Integer> isbn = new ArrayList<Integer>();
		ArrayList<String> nombresLibros = new ArrayList<String>();
		
		nombresLibros.add("Matilda");
		nombresLibros.add("Harry Potter");
		nombresLibros.add("Seda");
		nombresLibros.add("Amor líquido");
		nombresLibros.add("El péndulo de Foucalt");
		System.out.println(nombresLibros);
		
		// Obtener el número de elementos
		int size = nombresLibros.size();
		System.out.println("TOtal de libros: " + size);
		
		// Obtener item por su índice
		String sedaNombre = nombresLibros.get(2);
		System.out.println(sedaNombre);
		
		//Remover un elemento
		nombresLibros.remove(4);
		
		// Iterar elementos en la colección
		for (int i = 0; i< nombresLibros.size(); i++)
			System.out.println("Me gustan los libros: " + nombresLibros.get(i));
		
		for (String libro : nombresLibros)
			System.out.println("Me gustan los libros: " + libro);
		
		//Reemplazar un elemento de la colección:
		
		nombresLibros.set(3, "La Biblia");
		
		//Iterar con forEach
		nombresLibros.forEach(libro -> System.out.println(libro));
	}

}

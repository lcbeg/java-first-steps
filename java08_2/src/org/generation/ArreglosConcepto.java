package org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		/**
		 * Los arreglos se definen con corchetes []
		 * Pueden ir antes o despuès de la variable:
		 * int[] myArray;  int myArray[];
		 * 
		 * Se debe asignar la cantidad de elementos que contendrá el arreglo
		 * Una vez definido, el arreglo no puede cambiar su tamaño.
		 */
		
		int[] codigosColores = new int[3];
		String nombresColores[] = new String[3];
		
		nombresColores[0] = "Azul";
		codigosColores[0] = 0x0000ff; // RGB 0,0,255 -> 00 00 ff
		//System.out.println("El color fav de Caro es: " + nombresColores[0]);
		//System.out.println("Su código hexadecimal es: " + Integer.toHexString(codigosColores[0]));

		nombresColores[1] = "Amarillo";
		codigosColores[1] = 0xffff00;

		nombresColores[2] = "Negro";
		codigosColores[2] = 0x000000;
		
		// Iteramos el arreglo
		
		for (int i=0; i < nombresColores.length; i++) {
			System.out.println("El color " + i + " es: " + nombresColores[i]);
			System.out.println("Su código hexadecimal es: " + Integer.toHexString(codigosColores[i]));
			
		}
		
		//nombresColores[3] = "verde"; // Se crea un error en tiempo de ejecución 
		
		// Otra forma de inicializar un arreglo:
		String frutas[] = {"Naranja", "Manzana", "kiwi"};
		
		//Para crear una matriz se indica con doble [][]
		
		int pasteles[][][] = new int [3][4][2];
		
		pasteles[0][0][1] = 3;
		
		
	}

}

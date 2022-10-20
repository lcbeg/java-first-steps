package org.generation;

public class OperacionesMath {
	/**
	 * Sintaxis de las funciones:
	 * 
	 * [modificador de acceso] tipoRetorno nombreMétodo (parámetros) {
	 * 
	 * instrucciones;
	 * 
	 * }
	 */
	
	/**
	 * Suma dos números enteros y envía el resultado en consola.
	 * @param a sumando 1
	 * @param b sumando 2
	 */
	
	public void sumaEnterosSinRetorno(int a, int b) {
		System.out.println("La suma de " + a  + " y " + b + " es: " + (a+b));
	}
	
	int sumaEnteros(int a, int b) {
		return a+b;
	}
	double piPorDos() {
		return Math.PI*2;
	}
	static double piEntreDos() {
		return Math.PI/2;
	}
}

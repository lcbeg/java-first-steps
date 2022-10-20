package org.generation;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionesMath operaciones = new OperacionesMath();
		EntradaUsuario entradaUsuario = new EntradaUsuario();
		
		operaciones.sumaEnterosSinRetorno(34, 16);
		
		while( entradaUsuario.entradaTeclado("Quieres continuar? (s/n)" ) == 's') {};
		
		int resultado = operaciones.sumaEnteros(10, 88);
		System.out.println("10 + 88 = " + resultado);
		System.out.println("El resultado de π * 2 es: " + operaciones.piPorDos());
		System.out.println("El resultado de π * 2 es: " + OperacionesMath.piEntreDos());
	}

}


package org.generation.entity;

public class Division {
	public double divisionByCero(int a){
		double div;
		try {
			div = a/0;
		}
		catch(ArithmeticException e){
			System.out.println("El programa no pudo realizar la división.");
			System.out.println(e.toString());
			div = 0;
		}
		return div;
		}
	
}

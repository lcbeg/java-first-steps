package org.generation;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for (int i = 0; i <=10; i++)
			for(int j=0; j <=10; j++)
				System.out.println("Valor de i:" + i + ", valor de j: " + j);
		*/
		
		
	/*
	long saldo1 = 10000;
	int errores = 0;
	boolean out = false;
	
	
	while (errores < 3)  {
    System.out.println("================================================== \n");
	System.out.println("Bienvenido al servicio a cliente de BancoClarisa \n"
			+ "Seleccione la acción a realizar: \n"
			+ "1. Retirar dinero \n"
			+ "2. Realiza depósito \n"
			+ "3. Consultar Edo. de Cta. \n"
			+ "4. Quejas \n"
			+ "7. Hablar con un asesor. \n"
			+ "9. Salir del cajero");
	Scanner teclado = new Scanner(System.in);
	
	
	int seleccion = teclado.nextInt();
	
	switch (seleccion) {
	case 1:
		System.out.println("Indique cantidad a retirar (múltiplos de 100):");
		seleccion = teclado.nextInt();
		saldo1 -= seleccion; 
		System.out.println("Su saldo ahora es: " + saldo1);
		errores = 0;
		break;
	case 2:
		String seleccionLetra ;
		
		System.out.println("¿A qué cuenta desea depositar? \n"
				+ "A -> Cuenta de cheques \n"
				+ "B -> Realizar pago a tarjeta \n"
				+ "C -> Cuenta de terceros");
		
		seleccionLetra = teclado.next();
		
		System.out.println("Indique cantidad:");
		seleccion = teclado.nextInt();
		
		switch (seleccionLetra.toLowerCase()) {
		case "a":
			saldo1 += seleccion;
			System.out.println("Operación: Depósito cuenta de cheques \n Nuevo saldo: " + saldo1);
			break;
		case "b":
			saldo1 -= seleccion;
			System.out.println("Operación: Pago a tarjeta  \n Nuevo saldo: " + saldo1);
			break;
		case "c":
			saldo1 += seleccion;
			System.out.println("Operación: Depósito cuenta terceros \n Nuevo saldo: " + saldo1);
			break;
			
		}
		errores = 0;
		break;
	case 3:
		System.out.println("Operación: Estado de cuenta. \n Saldo: " + saldo1);
		errores = 0;
		break;
	case 4:
		System.out.println("Gracias por su interés, espere en la línea por favor. *cuelgan*");
		errores = 0;
		break;
	case 7:
		System.out.println("Le comunicamos con un asesor ...");
		errores = 0;
		break;
	case 9:
		errores = 3;
		break;
	default:
		System.out.println("La opción " + seleccion + " no es válida. Intente de nuevo.");
		errores +=1;
		break;

	}
	}
	
	System.out.println("Gracias por su preferencia, Adiós!");
	*/
		
		for (int i=1; i<=20; i++) {
			String frase = "";
			if (i%3 == 0) frase = "Fizz";
			if (i%5 == 0) frase += "Buzz";
		System.out.println(i + " " + frase);
		}
		
}
}

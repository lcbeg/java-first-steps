package org.generation;

public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Comentario de bloque.
		 * En esta sesión veremos los datos primitivos que existen en Java
		 */
		
		// La variable de tipo byte almacena valores de -128 a 127
		byte datoTipoByte = 10;
		System.out.println("Tipo byte: " + datoTipoByte);
		
		//La variable de tipo short almacena valores de -32,768 a 32,767
		short datoTipoShort = 32700;
		System.out.println("Short Max value: " + Short.MAX_VALUE);
		System.out.println("Short Min value: " + Short.MIN_VALUE);
		
		// La variable de tipo int almacena valores de -2^31 a (2^31)-1.
		int datoTipoInt = 600000000;
		System.out.println("Int Max value: " + Integer.MAX_VALUE);
		System.out.println("Int Min value: " + Integer.MIN_VALUE);
		
		// La variable de tipo long almacena valores de -2^63 a (2^63)-1.
		Long datoTipoLong = 9223372036854775807L;
		System.out.println("Long Max value: " + Long.MAX_VALUE);
		System.out.println("Long Min value: " + Long.MIN_VALUE);
		
		// byte, short, int y long almancenan valores enteros
		// float y double almacenan valores de punto flotante
		
		// La variable de tipo float almacena valores de punto flotante de 32 bits.
		float datoTipoFloat = 2.58f;
		System.out.println("Float Max value: " + Float.MAX_VALUE);
		System.out.println("Float Min value: " + Float.MIN_VALUE);
		
		// La variable de tipo float almacena valores de punto flotante de 64 bits.
		double datoTipoDouble = 3.256;
		System.out.println("Double Max value: " + Double.MAX_VALUE);
		System.out.println("Double Min value: " + Double.MIN_VALUE);
		
		// La variable de tipo boolean sólo puede tener valor de true o false.
		boolean datoTipoBoolean = true;
		
		// La variable de tipo char es de 16 bits y almacena un caracter.
		char datiTipoChar = 'F';
		
		// Los datos tipo String son considerados objetos.
		// el valor null se puede establecer para los objetos.
		String datoTipoString = "Este es un ejemplo de string";
		
		//Las literales numéricas podemos separarlas por un guión bajo
		int miValor = 120_101_253;
		double moValorDouble = 12_345.64_1D;
		
		// Representación de literales numéricas en distintos sistemas:
		
		// hexadecimal 0x1a;
		int miValHex = 0x1a; // 26 decimal
		System.out.println("Valor de 0x1a: " + miValHex);
		
		// binarios 0b11010
		int miValBinary = 0b0001_1010; // 26 decimal
		System.out.println("Valor de 0b0001_1010: " + miValBinary);
		
		// conversión de tipos
		
		byte edadThor = 7;
		int edadHumanaThor = edadThor;
		System.out.println("La edad humano-perro es de: " + edadHumanaThor);
		
		int edad = 100;
		byte num2 = (byte) edad;
		System.out.println(num2);
		
		/**
		 * Se usa camelCase para la convención de nombres de las variables
		 * Ejemplo:
		 * int datoAlmacenado;
		 * Para el nombre de las variables podemos usar dígitos o letras, así como 
		 * $ y _, pero estos últimos no se recomiendan por el uso que les da Java.
		 * No se puede comenzar una variable con un número ej. int 34mivariable. XX
		 * 
		 * Las constantes se pueden nombrar con mayúsculas ejemplo:
		 * 
		 * final int NUM_COHORTE = 18;
		 * 
		 * Operadores:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 */
		
	 // La conversión de string a núméricos se hace con las instrucciones:
		
	 //  parseInt , parseFloat , parseDouble.
		
		String edadString = "22";
		
		edad = Integer.parseInt(edadString); 
		
		System.out.println("La edad promedio es: " + edad);
		
	// Los operadores lógicos && || y ! se usan únicamente en booleanos.
		
		
	}
}

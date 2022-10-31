package org.generation.entity;

public class TestTryCatch {

	public static void main(String[] args) {
		/**
		 * Una excepción es una situción inesperada durante la ejecución de un programa.
		 * Existen dos tipos de excepciones:
		 * 
		 * -Checked exceptions: Se heredan de la clase Exception, tienen que declararse
		 * en la firma del método o bien usar los bloques try-catch.
		 * 
		 * -Unchecked exceptions: Se heredan de la clase RunTimeExceptions,
		 * no se está obligadx a procesarlas (uso opcional de try-catch).
		 * 
		 * Las excepciones de tipo Error, son arrojadas por la JVM.
		 * Estos son errores de los que no nos podemos recuperar. 
		 * Ejemplo: desbordamiento de memoria.
		 * 
		 * El stacktrace de una excepción es el conjunto de 
		 */
		
		Division div;
		div = new Division();
		System.out.println("El resultado es " + div.divisionByCero(45));

	}

}

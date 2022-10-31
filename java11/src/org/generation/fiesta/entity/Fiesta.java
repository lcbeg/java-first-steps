package org.generation.fiesta.entity;

/**
 * Una interfaz es una declaración formal de un contrato en la cual
 * los métodos no contienen implementación alguna, es similar
 * a los métodos abstractos.
 * 
 * Una clase puede implementar muchas interfaces, aunque no tengan relación.
 * 
 * Las clases abstractas se deben utilizar para objetos que estén estrechamente relacionados,
 * mientras que las interfaces son más adecuadas para proporcionar una funcionalidad
 * común a clases que no estén relacionadas entre sí.
 * 
 * Para los patrones de diseño se suele utilizar interfaces.
 * @author clarisa
 *
 */
public interface Fiesta {
	/**
	 * Los métodos de una interfaz ya son de tipo public y abstract
	 * Los atributos son de tipo final.
	 */

	String invitarPersonas();
	String parquearseBotanas();
	String comprarBebidas();
	String terminarFiesta();
	String resumenFiesta();
}

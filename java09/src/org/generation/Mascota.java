package org.generation;

public class Mascota {
	// fields (atributos)
	String nombre;
	double edad;
	String tipo;
	int tallaEnCm;
	
	
	//atributos de clase, tienen modificador static
	static int numMascotas;
	
	// El bloque de inicializacion de atributos se escribe entre llaves {}
	{
		this.tipo = "No definido";
	}
	// Los atributos de clase tienen su propio bloque de inicialización:
	static {
		numMascotas = 10;
	}
	
	
	//Métodos constructores
	// Si no especifico uno, Java genera el default (vacío)
	// El nombre de un constructor debe tener el MISMO NOMBRE que la clase
	// Los mètodos constructores no tienen retorno (return)
	/** 
	 * Inicializamos un objeto de la clase Mascota con el nombre indicado.
	 * @param name nombre de la mascota (String)
	 */
	Mascota(String name, double edad, int tallaEnCm){
		this.nombre = name;
		this.edad = edad;
		this.tallaEnCm = tallaEnCm;
		// Este es el método default de la clase
		System.out.println("Se creó un objeto de tipo Mascota");
		numMascotas++;
	}
	
	// Métodos de la clase
	// - Métodos sobrecargados
	// - Métodos sobreescritos
	
	 // Método de instancia
	String information() {
		return  this.nombre +
			   " edad: " + this.edad + " años" +
			   " tamaño: " + this.tallaEnCm + " cm." + " tipo " + this.tipo;
				
	}
	
   static String numeroMascotas() {
	return "N. Total mascotas creadas " + numMascotas;
   }
}

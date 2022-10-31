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
		this.nombre = "";
		this.tipo = "No definido";
		System.out.println("Se creó un objeto de tipo Mascota");
		numMascotas++;
	}
	
	// Los atributos de clase tienen su propio bloque de inicialización:
	static {
		numMascotas = 10;
	}
	
	// ---- Métodos constructores ----------------------------------------/
	// Si no especifico uno, Java genera el default (vacío)
	// El nombre de un constructor debe tener el MISMO NOMBRE que la clase
	// Los métodos constructores no tienen retorno (return)
	
	/** Sobrecarga de métodos: cuando existe más de un método con el mismo nombre, 
	 * pero tienen diferentes parámetros de entrada.
	 *  */
	
	/** 
	 * Inicializamos un objeto de la clase Mascota con el nombre indicado.
	 * @param name nombre de la mascota (String)
	 * @param edad edad en años
	 * @parem tallaEnCm talla en centímetros
	 */
	Mascota(String name, double edad, int tallaEnCm){
		this(name);
		this.edad = edad;
		this.tallaEnCm = tallaEnCm;

	}
   
   /**
    * Constructor para inicializar con nombre
    * @param name nombre de la mascota
    */
   Mascota(String name){
	   this.nombre = "suave " + name;
   }
 
   /**
    * Constructor vacío
    */
   Mascota(){
	   
   }
   
	
	 // Método de instancia
	String information() {
		return  this.nombre +
			   " edad: " + this.edad + " años" +
			   " tamaño: " + this.tallaEnCm + " cm." + " tipo " + this.tipo;
				
	}
	
	// Método de clase, se declara con static
	
 static String numeroMascotas() {
	return "N. Total mascotas creadas " + numMascotas;
 }

   //- Métodos sobreescritos
}

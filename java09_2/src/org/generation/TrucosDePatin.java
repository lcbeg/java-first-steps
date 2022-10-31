package org.generation;

public class TrucosDePatin {

String nombre;
int dificultad;
boolean desbloqueado;

static int nTrucosDesbloqueados;
static int trucosConocidos;

{
	this.nombre = "Truco misterioso";
	this.dificultad = 1;
	this.desbloqueado = false;
	trucosConocidos ++;
	}

TrucosDePatin(){

}

TrucosDePatin(String nombre){
 this.nombre = nombre;
}

TrucosDePatin(String nombre, int dificultad){
	 this(nombre);
	 this.dificultad = dificultad;
	}

TrucosDePatin(String nombre, int dificultad, boolean desbloqueado){
	 this(nombre, dificultad);
	 this.desbloqueado = desbloqueado;
	 if (desbloqueado) nTrucosDesbloqueados++;
	}

void verInformacion(){
	System.out.println("Truco: " + this.nombre
					   + "\nDificultad: " + this.dificultad);
	if(this.desbloqueado) System.out.println("desbloqueado");
	else System.out.println("Por desbloquear");
	
}

boolean estaDesbloqueado(){
	return this.desbloqueado;
}


}

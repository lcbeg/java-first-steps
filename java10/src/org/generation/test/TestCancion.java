package org.generation.test;
import org.generation.entity.*;

public class TestCancion {

	public static void main(String[] args) {
		
		Cancion sapito = new Cancion("Sapito","Cómplices","infantil");
		
		Autor cristinaAbaroa = new Autor("Cristina", "Abaroa");
		sapito.addAutor(cristinaAbaroa);
		
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		sapito.setDuracion(3.5);
		System.out.println(sapito);
		
	}

}

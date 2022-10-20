package org.generation;

public class TestMascota {

	public static void main(String[] args) {

		System.out.println("No. de mascotas: " + Mascota.numMascotas);
		Mascota hilario;
		hilario = new Mascota("Hilario", 1.5, 30);
		//hilario.nombre = "Hilario";
		//hilario.edad = 1.5;
		//hilario.tallaEnCm = 30;
		hilario.tipo = "michi";
		
		Mascota periquita = new Mascota("Periquina",0.5, 6);
		
		System.out.println("La mascota de Fer se llama: " + hilario.information() );
		System.out.println("La mascota de Abe se llama: " + periquita.information());
		System.out.println("No. de mascotas: " + Mascota.numeroMascotas());
		
	}

}

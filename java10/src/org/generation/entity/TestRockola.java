package org.generation.entity;

public class TestRockola {

	public static void main(String[] args) {
		Rockola cantinera = new Rockola("La cantinera");
		
		Cancion sapito = new Cancion("Sapito","Cómplices","infantil");
		sapito.addAutor(new Autor("Cristina", "Abaroa"));
		sapito.addAutor(new Autor("Alejandro", "Abaroa"));
		sapito.addAutor(new Autor("Pablo", "Aguirre"));
		sapito.setDuracion(3.5);
		
		cantinera.setCanciones(sapito);
		
		Cancion boneless = new Cancion("Boneless", "Dim Mak 20th Anniversary", "Electronica");
		
		boneless.addAutor(new Autor("Chris", "Lake"));
		boneless.addAutor(new Autor("Aid", "Villasaiu"));	
		boneless.setDuracion(2.60);
		
		Cancion orpheus = new Cancion("Orpheus",  "The dark and the light", "rock");
		orpheus.addAutor(new Autor ("Shawn", "James"));
		orpheus.addAutor(new Autor ("Jimmy", "Messer"));
		orpheus.setDuracion(3.58);
		
		Cancion rosaPastel = new Cancion("Rosa Pastel", "Dulce Beat", "Pop");
		rosaPastel.addAutor(new Autor ("Denisse", "Guerrero"));
		rosaPastel.addAutor(new Autor ("Edgar", " Huerta "));
		rosaPastel.setDuracion(3.00);
		
		Cancion cadaQue = new Cancion("Cada Que", "Fantasía Pop", "Pop");
		cadaQue.addAutor(new Autor ("Denisse", "Guerrero"));
		cadaQue.addAutor(new Autor ("Edgar", " Huerta "));
		cadaQue.setDuracion(3.00);

		cantinera.setCanciones( sapito );
		cantinera.setCanciones(orpheus);
		cantinera.setCanciones(rosaPastel);
		cantinera.setCanciones(cadaQue);
		
		System.out.println(cantinera.listaCompletaCanciones());
		
		System.out.println(cantinera.ListaCancionesAutor(new Autor ("Denisse", "Guerrero")));
	}

}

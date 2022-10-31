package org.generation.entity;

import java.util.HashMap;

public class Rockola {
	private int id;
	private String nombre;
	private int creditosDisponibles;
	private HashMap<Integer,Cancion> canciones;
	{
		this.id = 0;
		this.nombre="";
		this.creditosDisponibles =0;
		this.canciones = new HashMap<Integer, Cancion>();
	}

	public Rockola(String nombre) {
		this.nombre = nombre;
	}
	public void setCanciones(Cancion cancion){
		canciones.put(++this.id, cancion);
	}
	
	public HashMap<Integer, Cancion> getCanciones(){
		return canciones;
	}
	public String listaCompletaCanciones() {
		StringBuilder builder = new StringBuilder();
		for (int idCancion : canciones.keySet()) {
			builder.append(String.format("%n%03d:%n%s", idCancion, canciones.get(idCancion)));
			builder.append(false);
		}
		return builder.toString();
	}
	
// Ejercicio, método para obtener canciones de Dresser
	public String ListaCancionesAutor(Autor autor) {
		StringBuilder builder = new StringBuilder();
		for (int idCancion : canciones.keySet()) {
			HashMap<String, Autor> autores = (canciones.get(idCancion)).getAutores();
			for (String nombreAutor : autores.keySet()) {
			if (autores.get(nombreAutor).equals(autor)) {
				builder.append(String.format("%n%03d:%n%s", idCancion, canciones.get(idCancion)));
			builder.append(false);}}
			
		}
		return builder.toString();
	}

}

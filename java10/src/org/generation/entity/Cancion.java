package org.generation.entity;

import java.util.HashMap;

public class Cancion {
	private String nombre;
	private String album;
	private String genero;
	private double duracion;
	
	HashMap<String, Autor> autores;
	
	{
		this.nombre = "";
		this.album = "";
		this.genero = "";
		this.duracion = 0;
		this.autores = new HashMap<String, Autor>();
	}
	

	
	public Cancion(String nombre, String album, String genero) {
		this.nombre = nombre;
		this.album = album;
		this.genero = genero;
	}
	
	public void addAutor(Autor autor) {
		autores.put(autor.nombreCompleto(), autor);
	}
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public double getDuracion() {
		return this.duracion;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String toString() {
		//return this.nombre +" " +this.album+" etc";
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: ");
		builder.append(this.nombre);
		builder.append("\nAlbum: ");
		builder.append(this.album);
		if (autores.size() > 1)builder.append("\nAutores:");
		else builder.append("\nAutor:");{
		for (Autor autor: autores.values()) {
			builder.append("\n\t");
			builder.append(autor.nombreCompleto());
		}
		}
		return builder.toString();
	}
	public HashMap<String, Autor> getAutores(){
		return this.autores;
	}
	
	}
	


package org.generation.entity;

public class Autor {
	//default
	String nombre;
	String apellido;
	String nacionalidad;
	
	{
		this.nombre = "";
		this.apellido = "";
		this.nacionalidad = "";
	}
	
	public Autor(){
		
	}
	
	public Autor(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String nombreCompleto() {
		return this.nombre+" "+this.apellido;
	}
	
	public boolean equals(Object obj)   
	{  
	if (obj == null)   
	return false;  
	if (obj == this)  
	return true;  
	return this.nombreCompleto() == ((Autor) obj). nombreCompleto();  
	}  
}

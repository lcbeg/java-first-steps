package org.generation.tacos.entity;

import java.util.ArrayList;

public class Taco {
	private String nombreTaco;
	private String tipoTortilla;
	private ArrayList <String> proteinas;
	private boolean conQueso;
	private double costo;
	private ArrayList <String> condimentos;

	{
		this.nombreTaco = "Taco";
		this.tipoTortilla = "maíz";
		this.proteinas = new ArrayList<String>();
		this.conQueso = false;
		this.costo = 0;
		this.condimentos = new ArrayList<String>();
	}
	
	public Taco (String nombreTaco, String tipoTortilla) {
	this.nombreTaco = nombreTaco;
	this.tipoTortilla = tipoTortilla;
	}

	public String getTipoTortilla() {
		return tipoTortilla;
	}

	public void setTipoTortilla(String tipoTortilla) {
		this.tipoTortilla = tipoTortilla;
	}

	public ArrayList<String> getProteinas() {
		return proteinas;
	}

	public void setProteinas(ArrayList<String> proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isConQueso() {
		return conQueso;
	}

	public void setConQueso(boolean conQueso) {
		this.conQueso = conQueso;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public ArrayList<String> getCondimentos() {
		return condimentos;
	}

	public void setCondimentos(ArrayList<String> condimentos) {
		this.condimentos = condimentos;
	}

	public String getNombreTaco() {
		return nombreTaco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taco [nombreTaco=");
		builder.append(nombreTaco);
		builder.append(", tipoTortilla=");
		builder.append(tipoTortilla);
		builder.append(", proteinas=");
		builder.append(proteinas);
		builder.append(", conQueso=");
		builder.append(conQueso);
		builder.append(", costo=");
		builder.append(costo);
		builder.append(", condimentos=");
		builder.append(condimentos);
		builder.append("]");
		return builder.toString();
	}
	
	public String oferta() {
		return "No existe oferta para el taco";
	}
	public String oferta(String dia) {
		return "No existe oferta para el taco por el día de " + dia;
	}
	public String oferta(String dia, int cantidad) {
		return null;
	}
}

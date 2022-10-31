package org.generation.tacos.entity;

public class TacoPastor extends Taco{

boolean conPinia;
 int nivelAdobo;
 boolean esDeTrompo;
 
public TacoPastor(String nombreTaco, String tipoTortilla, boolean conPinia, int nivelAdobo, boolean esDeTrompo) {
	super(nombreTaco, tipoTortilla);
	this.conPinia = conPinia;
	this.nivelAdobo = nivelAdobo;
	this.esDeTrompo = esDeTrompo;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("TacoPastor [conPinia=");
	builder.append(conPinia);
	builder.append(", nivelAdobo=");
	builder.append(nivelAdobo);
	builder.append(", esDeTrompo=");
	builder.append(esDeTrompo);
	builder.append(super.toString());
	builder.append("]");
	return builder.toString();
}

@Override
public String oferta(){
	return "Tacos al pastor al 2x1";
}

 
 
}

package org.generation.fiesta.test;
import org.generation.fiesta.entity.*;
import java.util.*;

public class TestFiesta {

	public static void main(String[] args) {
		Fiesta ruby = new FiestaXV();
		Fiesta fer = new FiestaDespedidaDeSolterx();
		Fiesta viernesch18 = new FiestaTematica();
		
		List<Fiesta> organizadorFiestas = new ArrayList<Fiesta>();
		
		organizadorFiestas.add(ruby);
		organizadorFiestas.add(fer);
		organizadorFiestas.add(viernesch18);
		
		organizadorFiestas.forEach(fiesta -> resumen(fiesta));

	}
	public static void resumen (Fiesta fiesta) {
		System.out.println("============ FIESTA =============");
		System.out.println(fiesta.resumenFiesta());
	}

}

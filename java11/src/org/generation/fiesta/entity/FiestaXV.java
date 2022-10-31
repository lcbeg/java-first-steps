package org.generation.fiesta.entity;

public final class FiestaXV implements Fiesta, Vals {
	
	private int numInvitados;
	final static int EDAD_PERSONA = 15;

	@Override
	public String invitarPersonas() {
		return "Se invita la chaviza de la secu";
	}

	@Override
	public String parquearseBotanas() {
		// TODO Auto-generated method stub
		return "Se arma de chetos y paketaxos";
	}

	@Override
	public String comprarBebidas() {
		// TODO Auto-generated method stub
		return "Juguitos y aguas locas";
	}

	@Override
	public String terminarFiesta() {
		// TODO Auto-generated method stub
		return "Se llama a los papás para que recojan a las bendis";
	}

	@Override
	public String escogerChambelanes() {
		return "La quinceañera escogió a Juan, Tito y Tomás de cambelanes.";
		
	}

	@Override
	public String escogerMusica() {
		return "Se escogió 'tiempo de vals' como la música para el vals";
	}

	@Override
	public String ensayarPasos() {
		return "Durante 3 meses, cada martes y jueves se reunieron a ensayar los pasos.";
	}
	
	@Override
	public String resumenFiesta() {
		return String.format("Resumen: %n%s %n%s %n%s %n%s %n%s %n%s %n%s ", 
				this.escogerChambelanes(),
				this.escogerMusica(),
				this.ensayarPasos(),
				this.invitarPersonas(),
				this.parquearseBotanas(),
				this.comprarBebidas(),
				this.terminarFiesta());
	}

}

package org.generation.fiesta.entity;

public class FiestaDespedidaDeSolterx implements Fiesta {

	@Override
	public String invitarPersonas() {
		// TODO Auto-generated method stub
		return "Invitar a lxs amigxs de lx novix";
	}

	@Override
	public String parquearseBotanas() {
		// TODO Auto-generated method stub
		return "Partir jícamas con chamoy";
	}

	@Override
	public String comprarBebidas() {
		// TODO Auto-generated method stub
		return "Cocteles";
	}

	@Override
	public String terminarFiesta() {
		// TODO Auto-generated method stub
		return "Nos amanecemos";
	}
	
	@Override
	public final String resumenFiesta() {
		return String.format("Resumen: %n%s %n%s %n%s %n%s ", 
				this.invitarPersonas(),
				this.parquearseBotanas(),
				this.comprarBebidas(),
				this.terminarFiesta());
	}

}

package org.generation;

class MiHilo extends Thread {
	public MiHilo(String nombreHilo) {
		super(nombreHilo);
	}
	
	@Override
	public void run() {
		System.out.printf("%nHilo iniciado: %s - ID: %d", this.getName(), this.getId());
	
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);// estamos suspendiendo el hilo por un tiempo
				System.out.printf("%nEl %s cuenta %d", this.getName(), i);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	System.out.printf("%nHilo finalizado: %s - ID: %d", this.getName(), this.getId());
	}
}

public class ThreadWithExtend {
	public static void main (String[] args) {
		System.out.println("Multihilo con herencia");
		System.out.println("Número de ID del método main: " + Thread.currentThread().getId());
		System.out.println("Proceso 1");
		System.out.println("Proceso 2");
		System.out.println("Proceso 3");

		MiHilo hilo01 = new MiHilo("#1");
		MiHilo hilo02 = new MiHilo("#2");
		MiHilo hilo03 = new MiHilo("#3");
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
	}

}

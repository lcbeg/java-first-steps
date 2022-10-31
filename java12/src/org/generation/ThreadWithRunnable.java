package org.generation;

class MyThread implements Runnable {
	
	private String name;
	private long id;
	
	public MyThread(String name) {
		this.name = name;
		this.id = Thread.currentThread().getId();
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return this.id;
	}

	@Override
	public void run() {
		
System.out.printf("%nHilo iniciado: %s - ID: %d", this.getName(), this.getId());
		
		try {
			for (int i = 0; i < 6; i++) {
				Thread.sleep(1000);// estamos suspendiendo el hilo por un tiempo
				System.out.printf("%nEl %s cuenta %d", this.getName(), i);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.printf("%n Hilo finalizado: %s - ID: %d", this.getName(), this.getId());

	}
	
	
	public class ThreadWithRunnable {
		
		public static void main(String[]arg) {
			
			Thread hilo01 = new Thread( new MyThread("#1"));
			Thread hilo02 = new Thread( new MyThread("#2"));
			Thread hilo03 = new Thread( new MyThread("#3"));
			hilo01.start();
			hilo02.start();
			hilo03.start();
			
		}
	}
		
}

package controlador;

import vista.VistaPrincipal;

public class HiloRuleta extends Thread{
	VistaPrincipal vista = new VistaPrincipal();
	public HiloRuleta(VistaPrincipal frame) {
		this.vista = frame;
	}
	
	public void run() {
		


	}
}

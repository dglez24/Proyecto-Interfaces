package controlador;

import vista.VistaPrincipal;

public class HiloContra extends Thread{
	VistaPrincipal vista = new VistaPrincipal();
	public HiloContra(VistaPrincipal frame) {
		this.vista = frame;
	}
	
	public void run() {

			this.vista.PanelAvisoContra.setVisible(true);
			
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.PanelAvisoContra.setVisible(false);


	}
}

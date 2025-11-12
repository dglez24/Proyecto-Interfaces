package controlador;

import vista.VistaPrincipal;

public class HiloCorreo extends Thread{
	VistaPrincipal vista = new VistaPrincipal();
	public HiloCorreo(VistaPrincipal frame) {
		this.vista = frame;
	}
	
	public void run() {

			this.vista.PCorreo.setVisible(true);
			
			try {
				this.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.vista.PCorreo.setVisible(false);


	}
}

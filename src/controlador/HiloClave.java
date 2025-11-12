package controlador;

	import vista.VistaPrincipal;

public class HiloClave extends Thread{
		VistaPrincipal vista = new VistaPrincipal();
	public HiloClave(VistaPrincipal frame) {
			this.vista = frame;
		}
		
	public void run() {

				this.vista.PanelAvisoClave.setVisible(true);
				
				try {
					this.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				this.vista.PanelAvisoClave.setVisible(false);


		}
	}

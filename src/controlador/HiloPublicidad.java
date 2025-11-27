package controlador;

import java.awt.Color;

import javax.swing.ImageIcon;

import vista.VistaPrincipal;



public class HiloPublicidad extends Thread{
	
	private boolean fin;
	
	VistaPrincipal vista = new VistaPrincipal();
	public HiloPublicidad(VistaPrincipal frame) {
		this.vista = frame;
		fin = false;
	}
	
	public void run() {
		boolean fin2 = false;
		
		while (!fin2) {
			
			if(fin) {
				
			} else {
			this.vista.LblSaludo.setForeground(Color.BLUE);
			this.vista.FotoOferta2.setVisible(false);
			this.vista.FotoOferta1.setVisible(true);
			
			}
			
			try {
				this.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(fin) {
				
			} else {
				this.vista.LblSaludo.setForeground(Color.RED);
			this.vista.FotoOferta1.setVisible(false);
			this.vista.FotoOferta2.setVisible(true);
			}
			try {
				this.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}


	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public VistaPrincipal getVista() {
		return vista;
	}

	public void setVista(VistaPrincipal vista) {
		this.vista = vista;
	}
	
	
}

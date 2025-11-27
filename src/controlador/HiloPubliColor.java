package controlador;

import java.awt.Color;

import javax.swing.ImageIcon;

import vista.VistaPrincipal;



public class HiloPubliColor extends Thread{
	
	private boolean fin;
	
	VistaPrincipal vista = new VistaPrincipal();
	public HiloPubliColor(VistaPrincipal frame) {
		this.vista = frame;
		fin = false;
	}
	
	public void run() {
		boolean fin2 = false;

		vista.LblPubli1.setForeground(Color.GREEN);
		vista.LblPubli2.setForeground(Color.GREEN);
		vista.LblPubli3.setForeground(Color.GREEN);
		
		while (!fin2) {
			
			if(fin) {
				
			} else {
			vista.LblPubli1.setForeground(Color.GREEN);
			vista.LblPubli2.setForeground(Color.GREEN);
			vista.LblPubli3.setForeground(Color.GREEN);
			}
			
			try {
				this.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(fin) {
				
			} else {
			vista.LblPubli1.setForeground(Color.RED);
			vista.LblPubli2.setForeground(Color.RED);
			vista.LblPubli3.setForeground(Color.RED);
			}
			try {
				this.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(fin) {
				
			} else {
			vista.LblPubli1.setForeground(Color.BLUE);
			vista.LblPubli2.setForeground(Color.BLUE);
			vista.LblPubli3.setForeground(Color.BLUE);
			}
			try {
				this.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(fin) {
				
			} else {
			vista.LblPubli1.setForeground(Color.YELLOW);
			vista.LblPubli2.setForeground(Color.YELLOW);
			vista.LblPubli3.setForeground(Color.YELLOW);
			}
			try {
				this.sleep(250);
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

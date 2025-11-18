package controlador;

import java.util.Iterator;

import javax.swing.ImageIcon;

import vista.VistaPrincipal;

public class HiloRuleta extends Thread{
	VistaPrincipal vista = new VistaPrincipal();
	public HiloRuleta(VistaPrincipal frame) {
		this.vista = frame;
	}
	
	public void run() {
		
		for(int i=0; i < 30; i++) {
			int a = (int)(1 + Math.random() * 3);
			int b = (int)(1 + Math.random() * 3);
			int c = (int)(1 + Math.random() * 3);
			
			if (a == 1) {
				this.vista.Ruleta.Foto1_B.setVisible(true);
				this.vista.Ruleta.Foto1_H.setVisible(false);
				this.vista.Ruleta.Foto1_P.setVisible(false);
			} else if (a == 2) {
				this.vista.Ruleta.Foto1_H.setVisible(true);
				this.vista.Ruleta.Foto1_B.setVisible(false);
				this.vista.Ruleta.Foto1_P.setVisible(false);
			} else if (a == 3) {
				this.vista.Ruleta.Foto1_P.setVisible(true);
				this.vista.Ruleta.Foto1_H.setVisible(false);
				this.vista.Ruleta.Foto1_B.setVisible(false);
			}
			
			if (b == 1) {
				this.vista.Ruleta.Foto2_B.setVisible(true);
				this.vista.Ruleta.Foto2_H.setVisible(false);
				this.vista.Ruleta.Foto2_P.setVisible(false);
			} else if (b == 2) {
				this.vista.Ruleta.Foto2_H.setVisible(true);
				this.vista.Ruleta.Foto2_B.setVisible(false);
				this.vista.Ruleta.Foto2_P.setVisible(false);
			} else if (b == 3) {
				this.vista.Ruleta.Foto2_P.setVisible(true);
				this.vista.Ruleta.Foto2_B.setVisible(false);
				this.vista.Ruleta.Foto2_H.setVisible(false);
			}
			
			if (c == 1) {
				this.vista.Ruleta.Foto3_B.setVisible(true);
				this.vista.Ruleta.Foto3_H.setVisible(false);
				this.vista.Ruleta.Foto3_P.setVisible(false);
			} else if (c == 2) {
				this.vista.Ruleta.Foto3_H.setVisible(true);
				this.vista.Ruleta.Foto3_B.setVisible(false);
				this.vista.Ruleta.Foto3_P.setVisible(false);
			} else if (c == 3) {
				this.vista.Ruleta.Foto3_P.setVisible(true);
				this.vista.Ruleta.Foto3_B.setVisible(false);
				this.vista.Ruleta.Foto3_H.setVisible(false);
			}
			
			
			
			try {
				this.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.vista.Ruleta.Foto1_B.setVisible(false);
		this.vista.Ruleta.Foto1_H.setVisible(false);
		this.vista.Ruleta.Foto1_P.setVisible(false);
	
		this.vista.Ruleta.Foto2_B.setVisible(false);
		this.vista.Ruleta.Foto2_H.setVisible(false);
		this.vista.Ruleta.Foto2_P.setVisible(false);
	
		this.vista.Ruleta.Foto3_B.setVisible(false);
		this.vista.Ruleta.Foto3_H.setVisible(false);
		this.vista.Ruleta.Foto3_P.setVisible(false);
		
		

	
	


	}
}

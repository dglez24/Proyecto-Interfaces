package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener{
	
	VistaPrincipal vista = new VistaPrincipal();
	
	
	public Funcionalidad (VistaPrincipal frame) {
		vista = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

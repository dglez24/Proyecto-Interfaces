package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Usuario;
import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener{
	
	VistaPrincipal vista = new VistaPrincipal();
	
	ArrayList <Usuario> usuarios  = new ArrayList <Usuario>();
	
	public Funcionalidad (VistaPrincipal frame) {
		vista = frame;
		vista.btnRegIni.addActionListener(this);
		vista.btnAdmin.addActionListener(this);
		vista.btnIniciar.addActionListener(this);
		vista.btnRegistrar.addActionListener(this);
		vista.PClave.setVisible(false);
		vista.TFClave.setVisible(false);
		vista.PanelAvisoCorreo.setVisible(false);
		vista.PanelAvisoContra.setVisible(false);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vista.btnRegIni) {
			if(!vista.PanelRegistro.isVisible()) {
				vista.PanelRegistro.setVisible(true);
			} else {
				vista.PanelRegistro.setVisible(false);
			}
		}
		
		if(e.getSource() == vista.btnAdmin) {
			if(vista.TFClave.isVisible()) {
				vista.PClave.setVisible(false);
				vista.TFClave.setVisible(false);
				vista.btnAdmin.setText("Iniciar como Administrador");
			} else {
				vista.PClave.setVisible(true);
				vista.TFClave.setVisible(true);
				vista.btnAdmin.setText("Iniciar como no Administrador");
			}
		}
		
		if(e.getSource() == vista.btnRegistrar) {
			if(!vista.TFNombre.getText().isEmpty() && !vista.TFApellidos.getText().isEmpty() && !vista.TFCorreo.getText().isEmpty() && !vista.TFContra.getText().isEmpty()) {
				
				String nombre = vista.TFNombre.getText();
				String apellidos = vista.TFApellidos.getText();
				String correo = vista.TFCorreo.getText();
				String contra = vista.TFContra.getText();
				String contra2 = null;
				String correo2 = null;
				
				for (int i = 0; i < usuarios.size(); i++) {
					if(usuarios.get(i).getContra() == contra) {
						contra2 = usuarios.get(i).getContra();
					} 
					if(usuarios.get(i).getCorreo() == correo) {
						correo2 = usuarios.get(i).getCorreo();
					} 
				}
				
				if (contra2 == contra) {
					
				} else if (correo2 == correo) {
					
				} else if (contra2 == contra && correo2 == correo) {
					
				} else {
					if (!vista.TFClave.isVisible()) {
						usuarios.add(new Cliente(nombre, apellidos, correo, contra));
						Cliente c1 = new Cliente(nombre, apellidos, correo, contra);
						
					}
				}
			}
		}
		
	}

}


/*Contraseña : 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*/ 
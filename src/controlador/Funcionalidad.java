package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Usuario;
import vista.VistaPrincipal;

public class Funcionalidad extends Thread implements ActionListener{
	
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
		vista.PanelAvisoClave.setVisible(false);

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
					if(usuarios.get(i).getContra().equals(contra)) {
						contra2 = contra;
					} 
					if(usuarios.get(i).getCorreo().equals(correo)) {
						correo2 = correo;
					} 
				}
				
				if (contra2 == contra && correo2 == correo) {

					HiloCorreo h = new HiloCorreo(vista);
					HiloContra h2 = new HiloContra(vista);
					
					h.start();
					h2.start();
					
				} else if (correo2 == correo) {
					
					HiloCorreo h = new HiloCorreo(vista);
					
					h.start();
					
				} else if (contra2 == contra ) {
					HiloContra h = new HiloContra(vista);
					
					h.start();
					
				} else {
					
					if (vista.TFClave.isVisible()) {
						if(!vista.TFClave.getText().isEmpty()) {
							if(vista.TFClave.getText().equals("5202")) {
								usuarios.add(new Administrador(nombre, apellidos, correo, contra));
								Administrador a1 = new Administrador(nombre, apellidos, correo, contra);
							} else {
								vista.LblAvisoClave.setText("Clave Incorrecta");
								HiloClave h = new HiloClave(vista);
								
								h.start();
								
							}
						}else {
							vista.LblAvisoClave.setText("Clave vacia");
							
							HiloClave h = new HiloClave(vista);
							
							h.start();
						}
						
						
						} else {
							usuarios.add(new Cliente(nombre, apellidos, correo, contra));
							Cliente c1 = new Cliente(nombre, apellidos, correo, contra);

						
					}
				}
				
				vista.TFNombre.setText("");
				vista.TFApellidos.setText("");
				vista.TFCorreo.setText("");
				vista.TFContra.setText("");
				vista.TFClave.setText("");
			} else {
				
			}
		}
		
		
		
		
		if(e.getSource() == vista.btnIniciar) {
			
		}
		
	}

}


/*Contraseña : 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*/ 
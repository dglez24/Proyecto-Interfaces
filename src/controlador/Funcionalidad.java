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
					System.out.println("0");
					if(usuarios.get(i).getContra().equals(contra)) {
						contra2 = contra;
						System.out.println("1");
					} 
					if(usuarios.get(i).getCorreo().equals(correo)) {
						correo2 = correo;
						System.out.println("2");
					} 
				}
				
				if (contra2 == contra) {
					System.out.println("3");
					
					HiloCorreo h = new HiloCorreo(frame);
					
					h.start();
					
				} else if (correo2 == correo) {

					System.out.println("4");
					
				} else if (contra2 == contra && correo2 == correo) {
					System.out.println("5");
					
					
				} else {
					
					if (vista.TFClave.isVisible()) {
						System.out.println("6");
						if(!vista.TFClave.getText().isEmpty()) {
							if(vista.TFClave.getText().equals("5202")) {
								System.out.println("7");
								usuarios.add(new Administrador(nombre, apellidos, correo, contra));
								Administrador a1 = new Administrador(nombre, apellidos, correo, contra);
							} else {
								
								System.out.println("8");
								
							}
						}else {
							System.out.println("9");
							
						}
						
						
						} else {
							System.out.println("10");
							usuarios.add(new Cliente(nombre, apellidos, correo, contra));
							Cliente c1 = new Cliente(nombre, apellidos, correo, contra);

						
					}
					
					for (int i = 0; i < usuarios.size(); i++) {
						System.out.println(usuarios.get(i).toString());
					}
				}
				
				vista.TFNombre.setText("");
				vista.TFApellidos.setText("");
				vista.TFCorreo.setText("");
				vista.TFContra.setText("");
				vista.TFClave.setText("");
			}
		}
		
	}

}


/*Contraseña : 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*/ 
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
		vista.BTNMenu.addActionListener(this);
		vista.BTNHamburguesa.addActionListener(this);
		vista.BTNBebidas.addActionListener(this);
		vista.BTNComponentes.addActionListener(this);
		vista.BTNPostres.addActionListener(this);
		vista.BTNPromociones.addActionListener(this);
		
		
		
		vista.PClave.setVisible(false);
		vista.TFClave.setVisible(false);
		vista.PanelAvisoCorreo.setVisible(false);
		vista.PanelAvisoContra.setVisible(false);
		vista.PanelAvisoClave.setVisible(false);
		
		vista.BTNMenu.setVisible(false);
		vista.BTNHamburguesa.setVisible(false);
		vista.BTNBebidas.setVisible(false);
		vista.BTNComponentes.setVisible(false);
		vista.BTNPostres.setVisible(false);
		vista.BTNPromociones.setVisible(false);
		vista.POferta.setVisible(false);
		vista.PLogo.setVisible(false);
		vista.btnRegIni.setVisible(false);
		vista.PanelMenu.setVisible(false);
		vista.PanelHamburguesa.setVisible(false);
		vista.PanelComponentes.setVisible(false);
		vista.PanelPostres.setVisible(false);
		vista.PanelPromocion.setVisible(false);
		vista.PanelBebida.setVisible(false);
		
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
			
			if (!vista.TFNombre.isVisible()) {
				
				vista.TFNombre.setVisible(true);
				vista.TFApellidos.setVisible(true);
				vista.btnAdmin.setVisible(true);
				vista.PNombre.setVisible(true);
				vista.PApellidos.setVisible(true);
				
				vista.TFNombre.setText("");
				vista.TFApellidos.setText("");
				vista.TFCorreo.setText("");
				vista.TFContra.setText("");
				vista.TFClave.setText("");
				
				vista.PCorreo.setBounds(49, 207, 105, 17);
				vista.TFCorreo.setBounds(172, 207, 170, 18);
				vista.PContra.setBounds(49, 262, 105, 17);
				vista.TFContra.setBounds(172, 262, 170, 18);
				vista.PanelAvisoCorreo.setBounds(35, 234, 107, 18);
				vista.PanelAvisoContra.setBounds(35, 287, 137, 18);
				
			} else if(!vista.TFNombre.getText().isEmpty() && !vista.TFApellidos.getText().isEmpty() && !vista.TFCorreo.getText().isEmpty() && !vista.TFContra.getText().isEmpty()) {
				
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
					
					this.vista.LblAvisoContra.setText("La Contraseña ya existe");
					this.vista.LblAvisoCorreo.setText("El correo ya existe");

					HiloCorreo h = new HiloCorreo(vista);
					HiloContra h2 = new HiloContra(vista);
					
					h.start();
					h2.start();
					
				} else if (correo2 == correo) {
					this.vista.LblAvisoCorreo.setText("El correo ya existe");
					
					HiloCorreo h = new HiloCorreo(vista);
					
					h.start();
					
				} else if (contra2 == contra ) {
					this.vista.LblAvisoContra.setText("La Contraseña ya existe");
					
					HiloContra h = new HiloContra(vista);
					
					h.start();
					
				} else {
					
					if (vista.TFClave.isVisible()) {
						if(!vista.TFClave.getText().isEmpty()) {
							if(vista.TFClave.getText().equals("5202")) {
								usuarios.add(new Administrador(nombre, apellidos, correo, contra));
								Administrador a1 = new Administrador(nombre, apellidos, correo, contra);
								
								vista.PanelRegistro.setVisible(false);
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

							vista.PanelRegistro.setVisible(false);
							vista.BTNMenu.setVisible(true);
							vista.BTNHamburguesa.setVisible(true);
							vista.BTNBebidas.setVisible(true);
							vista.BTNComponentes.setVisible(true);
							vista.BTNPostres.setVisible(true);
							vista.BTNPromociones.setVisible(true);
							vista.POferta.setVisible(true);
							vista.PLogo.setVisible(true);
							vista.btnRegIni.setVisible(true);
							vista.LblSaludo.setText("Bienvenido " + c1.getNombre() + "!!!");
					}
				}
				
				vista.TFNombre.setText("");
				vista.TFApellidos.setText("");
				vista.TFCorreo.setText("");
				vista.TFContra.setText("");
				vista.TFClave.setText("");
			} else {
				//sonido
			}
		}
		
		
		
		
		if(e.getSource() == vista.btnIniciar) {
			
			
			
			if(vista.TFNombre.isVisible()) {
				vista.TFNombre.setVisible(false);
				vista.TFApellidos.setVisible(false);
				vista.btnAdmin.setVisible(false);
				vista.PNombre.setVisible(false);
				vista.PApellidos.setVisible(false);
				vista.PClave.setVisible(false);
				vista.TFClave.setVisible(false);
				
				vista.TFNombre.setText("");
				vista.TFApellidos.setText("");
				vista.TFCorreo.setText("");
				vista.TFContra.setText("");
				vista.TFClave.setText("");
				
				vista.PanelAvisoCorreo.setBounds(35, 180, 107, 18);
				vista.PanelAvisoContra.setBounds(35, 234, 137, 18);
				vista.PCorreo.setBounds(49, 154, 105, 17);
				vista.TFCorreo.setBounds(172, 154, 170, 18);
				vista.PContra.setBounds(49, 207, 105, 17);
				vista.TFContra.setBounds(172, 207, 170, 18);
				
			} else {
				String correo = null;
				String contra = null;

				
				for(int i = 0; i< usuarios.size(); i++) {
					
					if(vista.TFCorreo.getText().equals(usuarios.get(i).getCorreo())) {
						correo = usuarios.get(i).getCorreo();
					}
					if (vista.TFContra.getText().equals(usuarios.get(i).getContra())) {
						contra = usuarios.get(i).getContra();
					}
				}
				
				
				if (vista.TFCorreo.getText().equals(correo) && vista.TFContra.getText().equals(contra)) {
					for(int i = 0; i < usuarios.size(); i++) {
						if(usuarios.get(i).getContra() == contra && usuarios.get(i).getCorreo() == correo && usuarios.get(i).isAdmin()) {
							Administrador a1 = new Administrador(usuarios.get(i).getNombre(), usuarios.get(i).getApellidos(), correo, contra);
							this.vista.PanelRegistro.setVisible(false);
						} else {
							Cliente c1 = new Cliente(usuarios.get(i).getNombre(), usuarios.get(i).getApellidos(), correo, contra);
							this.vista.PanelRegistro.setVisible(false);
							vista.BTNMenu.setVisible(true);
							vista.BTNHamburguesa.setVisible(true);
							vista.BTNBebidas.setVisible(true);
							vista.BTNComponentes.setVisible(true);
							vista.BTNPostres.setVisible(true);
							vista.BTNPromociones.setVisible(true);
							vista.POferta.setVisible(true);
							vista.PLogo.setVisible(true);
							vista.btnRegIni.setVisible(true);
							vista.LblSaludo.setText("Bienvenido " + c1.getNombre() + "!!!");
						}
					}
					
					
				}else if(vista.TFCorreo.getText().isEmpty() || vista.TFContra.getText().isEmpty()) {
					
					//sonido
					
				}else if (!vista.TFCorreo.getText().equals(correo) && !vista.TFContra.getText().equals(contra)) {
					
					this.vista.LblAvisoContra.setText("Contraseña incorrecta");
					this.vista.LblAvisoCorreo.setText("Correo incorrecto");

					HiloCorreo h = new HiloCorreo(vista);
					HiloContra h2 = new HiloContra(vista);
					
					h.start();
					h2.start();
					
				} else if (!vista.TFCorreo.getText().equals(correo)) {
					this.vista.LblAvisoCorreo.setText("Correo incorrecto");
					
					HiloCorreo h = new HiloCorreo(vista);
					
					h.start();
					
				} else if (!vista.TFContra.getText().equals(contra)) {
					this.vista.LblAvisoContra.setText("Contraseña incorrecta");
					
					HiloContra h = new HiloContra(vista);
					
					h.start();
					
				} 


				vista.TFCorreo.setText("");
				vista.TFContra.setText("");

				
				
			}
			
		}
		
		
		
		if(e.getSource() == vista.BTNMenu) {
			vista.PanelMenu.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNHamburguesa) {
			vista.PanelHamburguesa.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNBebidas) {
			vista.PanelBebida.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNComponentes) {
			vista.PanelComponentes.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNPostres) {
			vista.PanelPostres.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNPromociones) {
			vista.PanelPromocion.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.btnRegIni.setVisible(false);
		}
		
	}

}


package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Usuario;
import modelo.Comida;
import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener{
	
	VistaPrincipal vista = new VistaPrincipal();
	
	ArrayList <Usuario> usuarios  = new ArrayList <Usuario>();
	ArrayList<Comida> comidas=new ArrayList<Comida>();
	Usuario c1 = null;
	
	public Funcionalidad (VistaPrincipal frame) {
		vista = frame;
		vista.BTNCerrarSesion.addActionListener(this);
		vista.btnAdmin.addActionListener(this);
		vista.btnIniciar.addActionListener(this);
		vista.btnRegistrar.addActionListener(this);
		vista.BTNMenu.addActionListener(this);
		vista.BTNHamburguesa.addActionListener(this);
		vista.BTNBebidas.addActionListener(this);
		vista.BTNComponentes.addActionListener(this);
		vista.BTNPostres.addActionListener(this);
		vista.BTNPromociones.addActionListener(this);
		vista.BTNRuleta.addActionListener(this);
		vista.Ruleta.BTNTirar.addActionListener(this);
		vista.Ruleta.BTNSalir.addActionListener(this);
		vista.OpcionRegistrar.BTNInicioIno.addActionListener(this);
		vista.OpcionRegistrar.BTNRegistroIni.addActionListener(this);
		vista.OpcionRegistrar.BTNSalir.addActionListener(this);
		vista.BTNSalirRegi.addActionListener(this);
		vista.BTNModificacion.addActionListener(this);
		
		
		vista.PClave.setVisible(false);
		vista.TFClave.setVisible(false);
		vista.PanelAvisoCorreo.setVisible(false);
		vista.PanelAvisoContra.setVisible(false);
		vista.PanelAvisoClave.setVisible(false);
		vista.PanelRegistro.setVisible(false);
		vista.BTNMenu.setVisible(false);
		vista.BTNHamburguesa.setVisible(false);
		vista.BTNBebidas.setVisible(false);
		vista.BTNComponentes.setVisible(false);
		vista.BTNPostres.setVisible(false);
		vista.BTNPromociones.setVisible(false);
		vista.POferta.setVisible(false);
		vista.PLogo.setVisible(false);
		vista.BTNCerrarSesion.setVisible(false);
		vista.BTNRuleta.setVisible(false);
		vista.PanelMenu.setVisible(false);
		vista.PanelHamburguesa.setVisible(false);
		vista.PanelPromocion.setVisible(false);
		vista.OpcionRegistrar.BTNSalir.setVisible(false);
		vista.BTNModificacion.setVisible(false);
		
		vista.Ruleta.setVisible(false);
		
		this.vista.Ruleta.Foto1_B.setVisible(false);
		this.vista.Ruleta.Foto1_H.setVisible(false);
		this.vista.Ruleta.Foto1_P.setVisible(false);
	
		this.vista.Ruleta.Foto2_B.setVisible(false);
		this.vista.Ruleta.Foto2_H.setVisible(false);
		this.vista.Ruleta.Foto2_P.setVisible(false);
	
		this.vista.Ruleta.Foto3_B.setVisible(false);
		this.vista.Ruleta.Foto3_H.setVisible(false);
		this.vista.Ruleta.Foto3_P.setVisible(false);
		
	
		comidas.add(new Comida("Hamburguesa BBQ la puerca","sdad",12.99,1,10,1));
		comidas.add(new Comida("Hamburguesa cerdita","q231",10.99,1,10,1));
		comidas.add(new Comida("Hamburguesa deluxe","q231",14.99,1,10,1));
		comidas.add(new Comida("Ensalada","q231",2.99,1,10,2));
		comidas.add(new Comida("Patatas fritas","q231",3.99,1,10,2));
		comidas.add(new Comida("Aros de cebolla","q231",4.99,1,10,2));
		comidas.add(new Comida("Agua","q231",1.99,1,20,3));
		comidas.add(new Comida("CocaCola","q231",2.50,1,20,3));
		comidas.add(new Comida("Cerveza","q231",2.99,1,20,3));
		comidas.add(new Comida("Helado de chocolate","q231",3.99,1,5,4));
		comidas.add(new Comida("Batido de vainilla","q231",5.99,1,13,4));
		comidas.add(new Comida("Natillas","q231",1.99,1,17,4));
		usuarios.add(new Cliente("Juan", "Perez", "a", "a"));
		usuarios.add(new Administrador("Manolo", "Montes", "b", "b"));
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == vista.OpcionRegistrar.BTNRegistroIni) {
			
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
			vista.PanelRegistro.setVisible(true);
			
			vista.OpcionRegistrar.setVisible(false);
			vista.PanelRegistro.setVisible(true);

			vista.btnRegistrar.setVisible(true);
			vista.btnIniciar.setVisible(false);
			
		}
		
		if(e.getSource() == vista.OpcionRegistrar.BTNInicioIno) {
			vista.OpcionRegistrar.setVisible(false);
			vista.PanelRegistro.setVisible(true);
			
			vista.btnRegistrar.setVisible(false);
			vista.btnIniciar.setVisible(true);
			
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
			
			
		}
		
		if(e.getSource() == vista.BTNSalirRegi) {
				vista.PanelRegistro.setVisible(false);
				vista.OpcionRegistrar.setVisible(true);

		}
		
		
		
		if(e.getSource() == vista.BTNCerrarSesion) {
			if(!vista.PanelRegistro.isVisible()) {
				vista.BTNMenu.setEnabled(false);
				vista.BTNHamburguesa.setEnabled(false);
				vista.BTNBebidas.setEnabled(false);
				vista.BTNComponentes.setEnabled(false);
				vista.BTNPostres.setEnabled(false);
				vista.BTNPromociones.setEnabled(false);
				vista.BTNCerrarSesion.setEnabled(false);
				vista.BTNRuleta.setEnabled(false);
				
				
				vista.OpcionRegistrar.BTNSalir.setVisible(true);
				vista.OpcionRegistrar.setVisible(true);
				
			} else {
				vista.OpcionRegistrar.setVisible(true);
			}
		}
		
		if(e.getSource() == vista.OpcionRegistrar.BTNSalir) {
			vista.BTNMenu.setEnabled(true);
			vista.BTNHamburguesa.setEnabled(true);
			vista.BTNBebidas.setEnabled(true);
			vista.BTNComponentes.setEnabled(true);
			vista.BTNPostres.setEnabled(true);
			vista.BTNPromociones.setEnabled(true);
			vista.BTNCerrarSesion.setEnabled(true);
			vista.BTNRuleta.setEnabled(true);
			
			
			vista.OpcionRegistrar.setVisible(false);
		}
		
		if(e.getSource() == vista.btnAdmin) {
			if(vista.TFClave.isVisible()) {
				vista.PClave.setVisible(false);
				vista.TFClave.setVisible(false);
				vista.btnAdmin.setText("Iniciar como Administrador");
			} else {
				vista.PClave.setVisible(true);
				vista.TFClave.setVisible(true);
				vista.btnAdmin.setText("Iniciar como Usuario");
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
								c1 = new Administrador(nombre, apellidos, correo, contra);
								vista.BTNMenu.setEnabled(true);
								vista.BTNHamburguesa.setEnabled(true);
								vista.BTNBebidas.setEnabled(true);
								vista.BTNComponentes.setEnabled(true);
								vista.BTNPostres.setEnabled(true);
								vista.BTNPromociones.setEnabled(true);
								vista.BTNCerrarSesion.setEnabled(true);
								vista.BTNRuleta.setEnabled(true);

								vista.PanelRegistro.setVisible(false);
								vista.BTNMenu.setVisible(true);
								vista.BTNHamburguesa.setVisible(true);
								vista.BTNBebidas.setVisible(true);
								vista.BTNComponentes.setVisible(true);
								vista.BTNPostres.setVisible(true);
								vista.BTNPromociones.setVisible(true);
								vista.POferta.setVisible(true);
								vista.PLogo.setVisible(true);
								vista.BTNCerrarSesion.setVisible(true);
								vista.BTNRuleta.setVisible(true);
								vista.BTNModificacion.setVisible(true);
								vista.LblSaludo.setText("Bienvenido " + c1.getNombre() + "!!!");
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
							c1 = new Cliente(nombre, apellidos, correo, contra);
							vista.BTNMenu.setEnabled(true);
							vista.BTNHamburguesa.setEnabled(true);
							vista.BTNBebidas.setEnabled(true);
							vista.BTNComponentes.setEnabled(true);
							vista.BTNPostres.setEnabled(true);
							vista.BTNPromociones.setEnabled(true);
							vista.BTNCerrarSesion.setEnabled(true);
							vista.BTNRuleta.setEnabled(true);

							vista.PanelRegistro.setVisible(false);
							vista.BTNMenu.setVisible(true);
							vista.BTNHamburguesa.setVisible(true);
							vista.BTNBebidas.setVisible(true);
							vista.BTNComponentes.setVisible(true);
							vista.BTNPostres.setVisible(true);
							vista.BTNPromociones.setVisible(true);
							vista.POferta.setVisible(true);
							vista.PLogo.setVisible(true);
							vista.BTNCerrarSesion.setVisible(true);
							vista.BTNRuleta.setVisible(true);
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
			
			
			for(int i = 0; i< usuarios.size(); i++) {
				if(vista.TFCorreo.getText().equals(usuarios.get(i).getCorreo())&&vista.TFContra.getText().equals(usuarios.get(i).getContra())) {
						if(usuarios.get(i).getClass()==Administrador.class) {
							ponerVisible();
							c1 = new Administrador(usuarios.get(i).getNombre(), usuarios.get(i).getApellidos(), usuarios.get(i).getCorreo(), usuarios.get(i).getContra());
							vista.BTNModificacion.setVisible(true);
							vista.LblSaludo.setText("Bienvenido " + c1.getNombre() + "!!!");
						}else {
							ponerVisible();
							c1 = new Cliente(usuarios.get(i).getNombre(), usuarios.get(i).getApellidos(), usuarios.get(i).getCorreo(), usuarios.get(i).getContra());
							vista.LblSaludo.setText("Bienvenido " + c1.getNombre() + "!!!");
						}
					
				}else{
				
					this.vista.LblAvisoContra.setText("Contraseña incorrecta");
					this.vista.LblAvisoCorreo.setText("Correo incorrecto");

					HiloCorreo h = new HiloCorreo(vista);
					HiloContra h2 = new HiloContra(vista);
					
					h.start();
					h2.start();
				}
				
				
				
			}
		}
		
		if(e.getSource() == vista.BTNRuleta) {
			vista.Ruleta.setVisible(true);
			vista.Ruleta.LblInfoTiros.setText("Tiros: " + c1.getTirada());
			vista.BTNMenu.setEnabled(false);
			vista.BTNHamburguesa.setEnabled(false);
			vista.BTNBebidas.setEnabled(false);
			vista.BTNComponentes.setEnabled(false);
			vista.BTNPostres.setEnabled(false);
			vista.BTNPromociones.setEnabled(false);
			vista.BTNCerrarSesion.setEnabled(false);
			vista.BTNRuleta.setEnabled(false);

		}
		
		if(e.getSource() == vista.Ruleta.BTNTirar) {
			

			if(c1.getTirada() > 0) {
			HiloRuleta hr = new HiloRuleta(vista);
			
			hr.start();
			
			
			
			int a = (int)(1 + Math.random() * 3);
			int b = (int)(1 + Math.random() * 3);
			int c = (int)(1 + Math.random() * 3);
			
			System.out.println(a);
			if (a == 1) {
				this.vista.Ruleta.Foto1.setIcon(new ImageIcon("Imagenes/imagenB.png"));
			} else if (a == 2) {
				this.vista.Ruleta.Foto1.setIcon(new ImageIcon("Imagenes/imagenH.png"));
			} else if (a == 3) {
				this.vista.Ruleta.Foto1.setIcon(new ImageIcon("Imagenes/imagenP.png"));
			}
			
			if (b == 1) {
				this.vista.Ruleta.Foto2.setIcon(new ImageIcon("Imagenes/imagenB.png"));
			} else if (b == 2) {
				this.vista.Ruleta.Foto2.setIcon(new ImageIcon("Imagenes/imagenH.png"));
			} else if (b == 3) {
				this.vista.Ruleta.Foto2.setIcon(new ImageIcon("Imagenes/imagenP.png"));
			}
			
			if (c == 1) {
				this.vista.Ruleta.Foto3.setIcon(new ImageIcon("Imagenes/imagenB.png"));
			} else if (c == 2) {
				this.vista.Ruleta.Foto3.setIcon(new ImageIcon("Imagenes/imagenH.png"));
			} else if (c == 3) {
				this.vista.Ruleta.Foto3.setIcon(new ImageIcon("Imagenes/imagenP.png"));
			}
			
			c1.setTirada(c1.getTirada() - 1);
			this.vista.Ruleta.LblInfoTiros.setText("Tiros: " + c1.getTirada());

			} else {
				//sonido
			}
			
			
		}
		
		if(e.getSource() == vista.Ruleta.BTNSalir) {
			this.vista.Ruleta.setVisible(false);
			vista.BTNMenu.setEnabled(true);
			vista.BTNHamburguesa.setEnabled(true);
			vista.BTNBebidas.setEnabled(true);
			vista.BTNComponentes.setEnabled(true);
			vista.BTNPostres.setEnabled(true);
			vista.BTNPromociones.setEnabled(true);
			vista.BTNCerrarSesion.setEnabled(true);
			vista.BTNRuleta.setEnabled(true);
		}
		
		
		
		if(e.getSource() == vista.BTNMenu) {
			vista.PanelMenu.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.BTNCerrarSesion.setVisible(false);
			vista.BTNRuleta.setVisible(false);
		}
		
		if(e.getSource() == vista.BTNHamburguesa) {
			vista.PanelHamburguesa.setVisible(true);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.BTNCerrarSesion.setVisible(false);
			vista.BTNRuleta.setVisible(false);
			vista.BTNMenu.setVisible(false);
		}
				
		
		if(e.getSource() == vista.BTNPromociones) {
			vista.PanelPromocion.setVisible(true);
			vista.BTNMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.BTNCerrarSesion.setVisible(false);
			vista.BTNRuleta.setVisible(false);
			
		}
		
		if(e.getSource() == vista.BTNModificacion) {
			
		}
	
	}
		
	
	public void ponerVisible() {
		vista.BTNMenu.setEnabled(true);
		vista.BTNHamburguesa.setEnabled(true);
		vista.BTNBebidas.setEnabled(true);
		vista.BTNComponentes.setEnabled(true);
		vista.BTNPostres.setEnabled(true);
		vista.BTNPromociones.setEnabled(true);
		vista.BTNCerrarSesion.setEnabled(true);
		vista.BTNRuleta.setEnabled(true);

		vista.PanelRegistro.setVisible(false);
		vista.BTNMenu.setVisible(true);
		vista.BTNHamburguesa.setVisible(true);
		vista.BTNBebidas.setVisible(true);
		vista.BTNComponentes.setVisible(true);
		vista.BTNPostres.setVisible(true);
		vista.BTNPromociones.setVisible(true);
		vista.POferta.setVisible(true);
		vista.PLogo.setVisible(true);
		vista.BTNCerrarSesion.setVisible(true);
		vista.BTNRuleta.setVisible(true);
		vista.BTNModificacion.setVisible(true);
	}

}
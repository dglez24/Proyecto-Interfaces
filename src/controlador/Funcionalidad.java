package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;


import modelo.Usuario;
import modelo.Comida;
import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener{
	private boolean permiso;
	VistaPrincipal vista = new VistaPrincipal();
	
	ArrayList <Usuario> usuarios  = new ArrayList <Usuario>();
	ArrayList<Comida> comidas=new ArrayList<Comida>();
	int posicion,tipo;
	
	public Funcionalidad (VistaPrincipal frame) {
		vista = frame;
		vista.BTNCerrarSesion.addActionListener(this);
		vista.btnAdmin.addActionListener(this);
		vista.btnIniciar.addActionListener(this);
		vista.btnRegistrar.addActionListener(this);
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
		vista.PanelHamburguesa.BtnAtras.addActionListener(this);
		vista.PanelHamburguesa.img1.addActionListener(this);
		vista.PanelHamburguesa.img2.addActionListener(this);
		vista.PanelHamburguesa.img3.addActionListener(this);		
		vista.PanelLista.btnAtras.addActionListener(this);
		vista.PanelPromocion.btnAtras.addActionListener(this);
		vista.PanelHamburguesa.BtnHambu.addActionListener(this);
		vista.PanelHamburguesa.BtnComple.addActionListener(this);
		vista.PanelHamburguesa.BtnBebi.addActionListener(this);
		vista.PanelHamburguesa.BtnPost.addActionListener(this);
		vista.BTNCarrito.addActionListener(this);
		
		//-------------------------------------------------------------------
		
		vista.PClave.setVisible(false);
		vista.TFClave.setVisible(false);
		vista.PanelAvisoCorreo.setVisible(false);
		vista.PanelAvisoContra.setVisible(false);
		vista.PanelAvisoClave.setVisible(false);
		vista.PanelRegistro.setVisible(false);
		vista.LblMenu.setVisible(false);
		vista.BTNHamburguesa.setVisible(false);
		vista.BTNBebidas.setVisible(false);
		vista.BTNComponentes.setVisible(false);
		vista.BTNPostres.setVisible(false);
		vista.BTNPromociones.setVisible(false);
		vista.POferta.setVisible(false);
		vista.PLogo.setVisible(false);
		vista.BTNCerrarSesion.setVisible(false);
		vista.BTNRuleta.setVisible(false);
		vista.BTNCarrito.setVisible(false);
		vista.PanelLista.setVisible(false);
		vista.PanelHamburguesa.setVisible(false);
		vista.PanelPromocion.setVisible(false);
		vista.PanelAdmin.setVisible(false);
		vista.OpcionRegistrar.BTNSalir.setVisible(false);
		vista.BTNModificacion.setVisible(false);
		//-------------------------------------------------------------------
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
		
		//-------------------------------------------------------------------------
		comidas.add(new Comida("Hamburguesa BBQ la puerca","imagenes/Hbbq.png",12.99,1,10,1));
		comidas.add(new Comida("Hamburguesa cerdita","imagenes/Hsimple.png",10.99,1,10,1));
		comidas.add(new Comida("Hamburguesa deluxe","imagenes/Hdeluxe.png",14.99,1,10,1));
		comidas.add(new Comida("Ensalada","imagenes/Salada.png",2.99,1,10,2));
		comidas.add(new Comida("Patatas fritas","imagenes/Pfritas.png",3.99,1,10,2));
		comidas.add(new Comida("Aros de cebolla","imagenes/Aros.png",4.99,1,10,2));
		comidas.add(new Comida("Agua","imagenes/Agua.png",1.99,1,20,3));
		comidas.add(new Comida("CocaCola","imagenes/Coca.png",2.50,1,20,3));
		comidas.add(new Comida("Cerveza","imagenes/cerveza.png",2.99,1,20,3));
		comidas.add(new Comida("Helado de chocolate","imagenes/Elado.png",3.99,1,5,4));
		comidas.add(new Comida("Batido de vainilla","imagenes/vanila.png",5.99,1,13,4));
		comidas.add(new Comida("Natillas","imagenes/tillas.png",1.99,1,17,4));
		usuarios.add(new Usuario("Juan", "Perez", "a", "a",false));
		usuarios.add(new Usuario("Manolo", "Montes", "b", "b",true));
		
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
				vista.LblMenu.setEnabled(false);
				vista.BTNHamburguesa.setEnabled(false);
				vista.BTNBebidas.setEnabled(false);
				vista.BTNComponentes.setEnabled(false);
				vista.BTNPostres.setEnabled(false);
				vista.BTNPromociones.setEnabled(false);
				vista.BTNCerrarSesion.setEnabled(false);
				vista.BTNRuleta.setEnabled(false);
				vista.BTNCarrito.setEnabled(false);
				if(usuarios.get(posicion).isAdmin()) {
					vista.BTNModificacion.setEnabled(false);
				}
				vista.OpcionRegistrar.BTNSalir.setVisible(true);
				vista.OpcionRegistrar.setVisible(true);
				
			} else {
				vista.OpcionRegistrar.setVisible(true);
			}
		}
		
		if(e.getSource() == vista.OpcionRegistrar.BTNSalir) {
			vista.LblMenu.setEnabled(true);
			vista.BTNHamburguesa.setEnabled(true);
			vista.BTNBebidas.setEnabled(true);
			vista.BTNComponentes.setEnabled(true);
			vista.BTNPostres.setEnabled(true);
			vista.BTNPromociones.setEnabled(true);
			vista.BTNCerrarSesion.setEnabled(true);
			vista.BTNRuleta.setEnabled(true);
			vista.BTNCarrito.setEnabled(true);
			if(usuarios.get(posicion).isAdmin()) {
				vista.BTNModificacion.setEnabled(true);
			}
			
			vista.OpcionRegistrar.setVisible(false);
		}
		
		if(e.getSource() == vista.btnAdmin) {
			if(vista.TFClave.isVisible()) {
				vista.PClave.setVisible(false);
				vista.TFClave.setVisible(false);
				permiso=false;
				vista.btnAdmin.setText("Registrar como Administrador");
			} else {
				vista.PClave.setVisible(true);
				vista.TFClave.setVisible(true);
				permiso=true;
				vista.btnAdmin.setText("Registrar como Usuario");
			}
		}
		
	if(e.getSource() == vista.btnRegistrar) {
			
		if(vista.TFNombre.getText().isEmpty() || vista.TFApellidos.getText().isEmpty() || vista.TFCorreo.getText().isEmpty() || vista.TFContra.getText().isEmpty()) {
			
			this.vista.LblAvisoContra.setText("hay campos vacios");
			this.vista.LblAvisoCorreo.setText("hay campos vacios");

			//HiloCorreo h = new HiloCorreo(vista);
			HiloContra h2 = new HiloContra(vista);
			//h.start();
			h2.start();
			
			
		}else {
			boolean existe=true;
			for(int i=0;i<usuarios.size();i++) {
				if(vista.TFCorreo.getText().equals(usuarios.get(i).getCorreo())) {
					vista.LblAvisoCorreo.setText("Ya existe");
					HiloCorreo h = new HiloCorreo(vista);
					h.start();
					existe=false;
				}
			}
				if (existe){
					if (vista.TFClave.isVisible()) {
						if(!vista.TFClave.getText().isEmpty()) {
							if(vista.TFClave.getText().equals("5202")) {
								
								usuarios.add(new Usuario(vista.TFNombre.getText(),vista.TFApellidos.getText(), vista.TFCorreo.getText(),vista.TFContra.getText(),true));
								ponerVisible();
								vista.BTNModificacion.setVisible(true);
								posicion=usuarios.size()-1;
								vista.LblSaludo.setText("Bienvenido " + usuarios.get(posicion).getNombre() + "!!!");
							} else {
								vista.LblAvisoClave.setText("Clave Incorrecta");
								HiloClave h = new HiloClave(vista);
								h.start();		
							}
						}	
							
					}else {
						usuarios.add(new Usuario(vista.TFNombre.getText(),vista.TFApellidos.getText(), vista.TFCorreo.getText(),vista.TFContra.getText(),false));
						ponerVisible();
						vista.BTNModificacion.setVisible(false);
						posicion=usuarios.size()-1;
						vista.LblSaludo.setText("Bienvenido " + usuarios.get(posicion).getNombre() + "!!!");
					}
				}	
				
		}
	}
	
		if(e.getSource() == vista.btnIniciar) {
			
			for(int i = 0; i< usuarios.size(); i++) {
				if(vista.TFCorreo.getText().equals(usuarios.get(i).getCorreo())&&vista.TFContra.getText().equals(usuarios.get(i).getContra())) {
						if(usuarios.get(i).isAdmin()==true) {
							ponerVisible();
							posicion=i;
							vista.BTNModificacion.setVisible(true);
							vista.LblSaludo.setText("Bienvenido " + usuarios.get(i).getNombre() + "!!!");							
						}else {
							ponerVisible();
							posicion=i;
							vista.BTNModificacion.setVisible(false);
							vista.LblSaludo.setText("Bienvenido " + usuarios.get(i).getNombre() + "!!!");
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

			this.vista.Ruleta.setVisible(true);
			this.vista.Ruleta.LblInfoTiros.setText("Tiros: " + usuarios.get(posicion).getTirada());

			vista.Ruleta.setVisible(true);
			vista.Ruleta.LblInfoTiros.setText("Tiros: " + usuarios.get(posicion).getTirada());

			vista.LblMenu.setEnabled(false);
			vista.BTNHamburguesa.setEnabled(false);
			vista.BTNBebidas.setEnabled(false);
			vista.BTNComponentes.setEnabled(false);
			vista.BTNPostres.setEnabled(false);
			vista.BTNPromociones.setEnabled(false);
			vista.BTNCerrarSesion.setEnabled(false);
			vista.BTNRuleta.setEnabled(false);
			vista.BTNCarrito.setEnabled(false);
			if(usuarios.get(posicion).isAdmin()) {
				vista.BTNModificacion.setEnabled(false);
			}

		}
		
		if(e.getSource() == vista.Ruleta.BTNTirar) {
			

			if(usuarios.get(posicion).getTirada() > 0) {
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
			
			usuarios.get(posicion).setTirada(usuarios.get(posicion).getTirada()-1);
			this.vista.Ruleta.LblInfoTiros.setText("Tiros: " +usuarios.get(posicion).getTirada());

			} else {
				//sonido
			}
			
			
		}
		
		if(e.getSource() == vista.Ruleta.BTNSalir) {
			this.vista.Ruleta.setVisible(false);
			vista.LblMenu.setEnabled(true);
			vista.BTNHamburguesa.setEnabled(true);
			vista.BTNBebidas.setEnabled(true);
			vista.BTNComponentes.setEnabled(true);
			vista.BTNPostres.setEnabled(true);
			vista.BTNPromociones.setEnabled(true);
			vista.BTNCerrarSesion.setEnabled(true);
			vista.BTNRuleta.setEnabled(true);
			vista.BTNCarrito.setEnabled(true);
			if(usuarios.get(posicion).isAdmin()) {
				vista.BTNModificacion.setEnabled(true);
			}
		}
		
		
		if(e.getSource() == vista.BTNHamburguesa) {
			panelComidas();
			rellenarMenu(0);
			tipo=1;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNComponentes) {
			panelComidas();
			rellenarMenu(3);
			tipo=2;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNBebidas) {
			panelComidas();
			rellenarMenu(6);
			tipo=3;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNPostres) {
			panelComidas();
			rellenarMenu(9);
			tipo=4;
			habilitar(tipo);
		}
		if(e.getSource()==vista.PanelHamburguesa.BtnHambu) {
			rellenarMenu(0);
			tipo=1;
			habilitar(tipo);
		}
		if(e.getSource()==vista.PanelHamburguesa.BtnComple) {
			rellenarMenu(3);
			tipo=2;
			habilitar(tipo);
		}
		if(e.getSource()==vista.PanelHamburguesa.BtnBebi) {
			rellenarMenu(6);
			tipo=3;
			habilitar(tipo);
			
		}
		if(e.getSource()==vista.PanelHamburguesa.BtnPost) {
			rellenarMenu(9);
			tipo=4;
			habilitar(tipo);
		}
		
		if(e.getSource() == vista.BTNPromociones) {
			vista.PanelPromocion.setVisible(true);
			vista.PanelAdmin.setVisible(false);
			vista.LblMenu.setVisible(false);
			vista.BTNHamburguesa.setVisible(false);
			vista.BTNBebidas.setVisible(false);
			vista.BTNComponentes.setVisible(false);
			vista.BTNPostres.setVisible(false);
			vista.BTNPromociones.setVisible(false);
			vista.BTNCerrarSesion.setVisible(false);
			vista.BTNRuleta.setVisible(false);
			vista.BTNCarrito.setVisible(false);
			if(usuarios.get(posicion).isAdmin()) {
				vista.BTNModificacion.setVisible(false);
			}
			
		}
		
		if(e.getSource()==vista.PanelHamburguesa.BtnAtras) {
			ponerVisible();
		}
		if(e.getSource() == vista.PanelPromocion.btnAtras) {
			ponerVisible();
		}
		if(e.getSource() == vista.PanelLista.btnAtras) {
			ponerVisible();
		}
		
		if(e.getSource() == vista.BTNModificacion) {
			
		}

		}
	
	public void panelComidas() {
		vista.PanelHamburguesa.setVisible(true);
		vista.BTNHamburguesa.setVisible(false);
		vista.BTNBebidas.setVisible(false);
		vista.BTNComponentes.setVisible(false);
		vista.BTNPostres.setVisible(false);
		vista.BTNPromociones.setVisible(false);
		vista.BTNCerrarSesion.setVisible(false);
		vista.BTNRuleta.setVisible(false);
		vista.BTNCarrito.setVisible(false);
		vista.LblMenu.setVisible(false);
		if(usuarios.get(posicion).isAdmin()) {
			vista.BTNModificacion.setVisible(false);
		}
	}
	
	public void ponerVisible() {
		vista.PanelHamburguesa.setVisible(false);
		vista.PanelPromocion.setVisible(false);
		vista.PanelLista.setVisible(false);
		vista.LblMenu.setEnabled(true);
		vista.BTNHamburguesa.setEnabled(true);
		vista.BTNBebidas.setEnabled(true);
		vista.BTNComponentes.setEnabled(true);
		vista.BTNPostres.setEnabled(true);
		vista.BTNPromociones.setEnabled(true);
		vista.BTNCerrarSesion.setEnabled(true);
		vista.BTNRuleta.setEnabled(true);
		vista.BTNCarrito.setEnabled(true);
		if(usuarios.get(posicion).isAdmin()) {
			vista.BTNModificacion.setEnabled(true);
		}

		vista.PanelRegistro.setVisible(false);
		vista.LblMenu.setVisible(true);
		vista.BTNHamburguesa.setVisible(true);
		vista.BTNBebidas.setVisible(true);
		vista.BTNComponentes.setVisible(true);
		vista.BTNPostres.setVisible(true);
		vista.BTNPromociones.setVisible(true);
		vista.POferta.setVisible(true);
		vista.PLogo.setVisible(true);
		vista.BTNCerrarSesion.setVisible(true);
		vista.BTNRuleta.setVisible(true);
		vista.BTNCarrito.setVisible(true);
		if(usuarios.get(posicion).isAdmin()) {
			vista.BTNModificacion.setVisible(true);
		}

	}
	public ImageIcon getScaledIcon(String path,  int height) {
	    try {
	        Image originalImage = new ImageIcon(path).getImage();
	        // Usamos SCALE_SMOOTH para mejor calidad
	        Image scaledImage = originalImage.getScaledInstance(height+15, height, Image.SCALE_SMOOTH); 
	        return new ImageIcon(scaledImage);
	    } catch (Exception e) {
	        System.err.println("Error al cargar o escalar la imagen: " + path);
	        return null;
	    }
	}
	public void rellenarMenu(int i) {
		vista.PanelHamburguesa.img1.setIcon(getScaledIcon(comidas.get(i).getFoto(), vista.PanelHamburguesa.img1.getHeight()));
		vista.PanelHamburguesa.img2.setIcon(getScaledIcon(comidas.get(i+1).getFoto(), vista.PanelHamburguesa.img2.getHeight()));
		vista.PanelHamburguesa.img3.setIcon(getScaledIcon(comidas.get(i+2).getFoto(), vista.PanelHamburguesa.img1.getHeight()));
		vista.PanelHamburguesa.nom1.setText(comidas.get(i).getNombre());
		vista.PanelHamburguesa.nom2.setText(comidas.get(i+1).getNombre());
		vista.PanelHamburguesa.nom3.setText(comidas.get(i+2).getNombre());
		vista.PanelHamburguesa.precio1.setText(String.valueOf(comidas.get(i).getPrecio()));
		vista.PanelHamburguesa.precio2.setText(String.valueOf(comidas.get(i+1).getPrecio()));
		vista.PanelHamburguesa.precio3.setText(String.valueOf(comidas.get(i+2).getPrecio()));

	}
	public void habilitar(int tipo) {
		if(tipo==1) {
			vista.PanelHamburguesa.BtnPost.setEnabled(true);
			vista.PanelHamburguesa.BtnComple.setEnabled(true);
			vista.PanelHamburguesa.BtnBebi.setEnabled(true);
			vista.PanelHamburguesa.BtnHambu.setEnabled(false);
		}else if(tipo==2) {
			vista.PanelHamburguesa.BtnPost.setEnabled(true);
			vista.PanelHamburguesa.BtnComple.setEnabled(false);
			vista.PanelHamburguesa.BtnBebi.setEnabled(true);
			vista.PanelHamburguesa.BtnHambu.setEnabled(true);
		}else if(tipo==3) {
			vista.PanelHamburguesa.BtnPost.setEnabled(true);
			vista.PanelHamburguesa.BtnComple.setEnabled(true);
			vista.PanelHamburguesa.BtnBebi.setEnabled(false);
			vista.PanelHamburguesa.BtnHambu.setEnabled(true);
		}else if(tipo==4) {
			vista.PanelHamburguesa.BtnPost.setEnabled(false);
			vista.PanelHamburguesa.BtnComple.setEnabled(true);
			vista.PanelHamburguesa.BtnBebi.setEnabled(true);
			vista.PanelHamburguesa.BtnHambu.setEnabled(true);
		}
		
	}
	

}
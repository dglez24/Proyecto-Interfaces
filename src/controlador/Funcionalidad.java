package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import modelo.Usuario;
import modelo.Comida;
import vista.VistaPrincipal;

public class Funcionalidad implements ActionListener,MouseListener{
	public  boolean permiso;
	public VistaPrincipal vista = new VistaPrincipal();
	public HashMap<Comida, Integer> cantidades = new HashMap<Comida, Integer>();
	public ArrayList <Usuario> usuarios  = new ArrayList <Usuario>();
	public ArrayList<Comida> comidas=new ArrayList<Comida>();
	public DefaultListModel <String> modelo = new DefaultListModel <>();
	public DefaultListModel modeloadmin = new DefaultListModel();
	int posicion,tipo,total;
	public HiloPublicidad hp = null;
	public HiloPubliColor hpc = null;
	
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
		vista.PanelPromocion.BTNAnadirOf1.addActionListener(this);
		vista.PanelPromocion.BTNAnadirOf2.addActionListener(this);
		vista.PanelCarrito.BtnEliminar.addActionListener(this);
		vista.PanelCarrito.BtnPagar.addActionListener(this);
		vista.PanelLista.bTNSumar.addActionListener(this);
		vista.PanelLista.bTNRestar.addActionListener(this);
		vista.PanelLista.listacomidas.addMouseListener(this);
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
		vista.PanelCarrito.setVisible(false);
		vista.OpcionRegistrar.BTNSalir.setVisible(false);
		vista.BTNModificacion.setVisible(false);
		vista.panelPubliColor.setVisible(false);

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
		comidas.add(new Comida("Hamburguesa BBQ la puerca","imagenes/Hbbq.png",12.99,10,1));
		comidas.add(new Comida("Hamburguesa cerdita","imagenes/Hsimple.png",10.99,10,1));
		comidas.add(new Comida("Hamburguesa deluxe","imagenes/Hdeluxe.png",14.99,10,1));
		comidas.add(new Comida("Ensalada","imagenes/Salada.png",2.99,10,2));
		comidas.add(new Comida("Patatas fritas","imagenes/Pfritas.png",3.99,10,2));
		comidas.add(new Comida("Aros de cebolla","imagenes/Aros.png",4.99,10,2));
		comidas.add(new Comida("Agua","imagenes/Agua.png",1.99,20,3));
		comidas.add(new Comida("CocaCola","imagenes/Coca.png",2.50,20,3));
		comidas.add(new Comida("Cerveza","imagenes/cerveza.png",2.99,20,3));
		comidas.add(new Comida("Helado de chocolate","imagenes/Elado.png",3.99,5,4));
		comidas.add(new Comida("Batido de vainilla","imagenes/vanila.png",5.99,13,4));
		comidas.add(new Comida("Natillas","imagenes/tillas.png",1.99,17,4));
		comidas.add(new Comida("Oferta burguer y bebida","imagenes/vanila.png",13.99,4,5));
		comidas.add(new Comida("Oferta triple burguer","imagenes/tillas.png",19.99,7,5));
		usuarios.add(new Usuario("Juan", "Perez", "a", "a",false));
		usuarios.add(new Usuario("Manolo", "Montes", "b", "b",true));
		
		for(int i = 0; i< comidas.size(); i++) {
		cantidades.put(comidas.get(i), 0);
		}
		

	 	for(int i = 0; i<comidas.size(); i++) {
	 		modeloadmin.addElement(comidas.get(i).getNombre());
	 	}
	 	vista.PanelLista.listacomidas.setModel(modeloadmin);
		
		hp = new HiloPublicidad(vista);
		hpc = new HiloPubliColor(vista);
		
		hp.start();
		hp.setFin(true);
		

		hpc.start();
		hpc.setFin(true);
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
			resetearValores(cantidades);
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
				hp.setFin(true);
				hpc.setFin(true);
			} else {
				vista.OpcionRegistrar.setVisible(true);
			}
			/*
			long a = System.currentTimeMillis();
			long fin = a + (3000);
			if(System.currentTimeMillis()<fin) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			*/
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
			hp.setFin(false);
			hpc.setFin(false);
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
								hp.setFin(false);
								hpc.setFin(false);
								vista.BTNCarrito.setText("\n\n🛒" + usuarios.get(posicion).getCompras());
								comprobarcarrito();
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
						vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
						comprobarcarrito();
						hp.setFin(false);
						hpc.setFin(false);
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
							vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
							comprobarcarrito();
							hp.setFin(false);
							hpc.setFin(false);
						}else {
							ponerVisible();
							posicion=i;
							vista.BTNModificacion.setVisible(false);
							vista.LblSaludo.setText("Bienvenido " + usuarios.get(i).getNombre() + "!!!");
							vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
							comprobarcarrito();
							hp.setFin(false);
							hpc.setFin(false);
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
			hp.setFin(true);
			hpc.setFin(true);
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
			
			if(a == b && b == c) {
				if(a == 1) {
					usuarios.get(posicion).setG1(true);
					vista.PanelHamburguesa.LblPremio.setText("Bebida Gratis");
				} else if (a == 2) {
					usuarios.get(posicion).setG2(true);
					vista.PanelHamburguesa.LblPremio.setText("Hamburguesa Gratis");
				} else if (a == 3) {
					usuarios.get(posicion).setG3(true);
					vista.PanelHamburguesa.LblPremio.setText("Complemento Gratis");
				}
			} else {
				//fallo
			}
			}
		}
		
		if(e.getSource() == vista.Ruleta.BTNSalir) {
			hp.setFin(false);
			hpc.setFin(false);
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
		//---------------------------------------------------
		if(e.getSource() == vista.BTNHamburguesa) {
			hp.setFin(true);
			hpc.setFin(true);
			panelComidas();
			rellenarMenu(0);
			tipo=1;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNComponentes) {
			hp.setFin(true);
			hpc.setFin(true);
			panelComidas();
			rellenarMenu(3);
			tipo=2;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNBebidas) {
			hp.setFin(true);
			hpc.setFin(true);
			panelComidas();
			rellenarMenu(6);
			tipo=3;
			habilitar(tipo);
		}
		if(e.getSource()==vista.BTNPostres) {
			hp.setFin(true);
			hpc.setFin(true);
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
		//-------------------------------------------------------
		if(e.getSource() == vista.BTNPromociones) {
			
			hp.setFin(true);
			hpc.setFin(true);
			
			
			vista.PanelPromocion.setVisible(true);
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
			vista.PanelPromocion.Foto1Of1.setIcon(getScaledIcon("Imagenes/Hbbq.png", vista.PanelPromocion.Foto1Of1.getHeight()));
			vista.PanelPromocion.Foto2Of1.setIcon(getScaledIcon("Imagenes/cerveza.png", vista.PanelPromocion.Foto2Of1.getHeight()));
			vista.PanelPromocion.Foto1Of2.setIcon(getScaledIcon("Imagenes/Hdeluxe.png", vista.PanelPromocion.Foto1Of2.getHeight()));
		}
		
		if(e.getSource()==vista.PanelHamburguesa.BtnAtras) {
			hp.setFin(false);
			hpc.setFin(false);
			ponerVisible();
			comprobarcarrito();
		}
		if(e.getSource() == vista.PanelPromocion.btnAtras) {
			hp.setFin(false);
			hpc.setFin(false);
			ponerVisible();
			comprobarcarrito();
		}
		if(e.getSource() == vista.PanelLista.btnAtras) {
			hp.setFin(false);
			hpc.setFin(false);
			ponerVisible();
			comprobarcarrito();
		}
		
		if(e.getSource() == vista.BTNModificacion) {
			hp.setFin(true);
			hpc.setFin(true);
			vista.PanelLista.setVisible(true);
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
			vista.PanelLista.LblTituloComida.setText(comidas.get(0).getNombre());
			vista.PanelLista.lblUds.setText(String.valueOf(comidas.get(0).getCantidad()));
		}
		if(e.getSource() == vista.BTNCarrito) {
			if(vista.PanelCarrito.isVisible()) {
				vista.PanelCarrito.setVisible(false);
				vista.BTNHamburguesa.setEnabled(true);
				vista.BTNBebidas.setEnabled(true);
				vista.BTNComponentes.setEnabled(true);
				vista.BTNPostres.setEnabled(true);
				vista.BTNPromociones.setEnabled(true);
				vista.BTNCerrarSesion.setEnabled(true);
				vista.BTNRuleta.setEnabled(true);
				if(usuarios.get(posicion).isAdmin()) {
					vista.BTNModificacion.setEnabled(true);
				}
				vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
				comprobarcarrito();
				hp.setFin(false);
				hpc.setFin(false);
			} else {
				vista.PanelCarrito.setVisible(true);
				vista.BTNHamburguesa.setEnabled(false);
				vista.BTNBebidas.setEnabled(false);
				vista.BTNComponentes.setEnabled(false);
				vista.BTNPostres.setEnabled(false);
				vista.BTNPromociones.setEnabled(false);
				vista.BTNCerrarSesion.setEnabled(false);
				vista.BTNRuleta.setEnabled(false);
				if(usuarios.get(posicion).isAdmin()) {
					vista.BTNModificacion.setEnabled(false);
				}
				hp.setFin(true);
				hpc.setFin(true);
			}
			

		}
		
		
		if(e.getSource() == vista.PanelHamburguesa.img1) {
			int pos = 0;
			
			boolean existe=comprobanteStock(pos,tipo,comidas,cantidades);
			if(!existe) {
				comprobanteCarrito( pos, tipo, comidas, cantidades);
			}else {
				vista.PanelHamburguesa.LblAlertaStock.setText("No quedan mas productos de este tipo");
			}
		}
		if(e.getSource() == vista.PanelHamburguesa.img2) {
			int pos = 1;
			
			boolean existe=comprobanteStock(pos,tipo,comidas,cantidades);
			if(!existe) {
				comprobanteCarrito( pos, tipo, comidas, cantidades);
			}else {
				vista.PanelHamburguesa.LblAlertaStock.setText("No quedan mas productos de este tipo");
			}	
		}
		if(e.getSource() == vista.PanelHamburguesa.img3) {
			int pos = 2;
			
			boolean existe=comprobanteStock(pos,tipo,comidas,cantidades);
			if(!existe) {
				comprobanteCarrito( pos, tipo, comidas, cantidades);
			}else {
				vista.PanelHamburguesa.LblAlertaStock.setText("No quedan mas productos de este tipo");
			}
		}
		
		if(e.getSource() == vista.PanelPromocion.BTNAnadirOf1) {
			int pos = 12;
			
			boolean existe=comprobanteStock(pos,5,comidas,cantidades);
			if(!existe) {
				comprobanteCarrito( pos, 5, comidas, cantidades);
			}else {
				vista.PanelPromocion.LblAlertaStockPro.setText("No quedan mas productos de este tipo");
			}


		}
		
		if(e.getSource() == vista.PanelPromocion.BTNAnadirOf2) {
			int pos = 13;
			
			boolean existe=comprobanteStock(pos,5,comidas,cantidades);
			if(!existe) {
				comprobanteCarrito( pos, 5, comidas, cantidades);
			}else {
				vista.PanelPromocion.LblAlertaStockPro.setText("No quedan mas productos de este tipo");
			
			}
		}
		
		if(e.getSource() == vista.PanelLista.bTNSumar) {
			for(int i = 0; i < comidas.size(); i++) {
				if(comidas.get(i).getNombre().equals(vista.PanelLista.LblTituloComida.getText())) {
					comidas.get(i).setCantidad(comidas.get(i).getCantidad() + 1);
					vista.PanelLista.lblUds.setText(String.valueOf(Integer.valueOf(vista.PanelLista.lblUds.getText())  + 1));
				}
			}
		}
		
		if(e.getSource() == vista.PanelLista.bTNRestar) {
			if(vista.PanelLista.lblUds.getText().equals("0")) {
				
			}else{ 
			for(int i = 0; i < comidas.size(); i++) {
				if(comidas.get(i).getNombre().equals(vista.PanelLista.LblTituloComida.getText())) {
					comidas.get(i).setCantidad(comidas.get(i).getCantidad() - 1);
					vista.PanelLista.lblUds.setText(String.valueOf(Integer.valueOf(vista.PanelLista.lblUds.getText())  - 1));
				}
			}
			}
		}
		
		if(e.getSource()==vista.PanelCarrito.BtnEliminar) {
			resetearValores(cantidades);
			modelo.clear();
			usuarios.get(posicion).setCompras(0);
			vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
			System.out.println(usuarios.get(posicion).getCompras());
			vista.PanelCarrito.LblCobroTotal.setText("0");
			
		}
		if(e.getSource()==vista.PanelCarrito.BtnPagar) {
			contadorVentas(comidas,cantidades);
			resetearValores(cantidades);
			modelo.clear();
			usuarios.get(posicion).setCompras(0);
			vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
			vista.PanelCarrito.LblCobroTotal.setText("0");
		}
		
		
		
		}
	//METODOS DEL PROYECTO
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
		vista.panelPubliColor.setVisible(true);
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
	
	public void comprobarcarrito() {
		if( usuarios.get(posicion).getCompras() == 0) {
			vista.BTNCarrito.setEnabled(false);
		} else if( usuarios.get(posicion).getCompras() > 0) {
			vista.BTNCarrito.setEnabled(true);
		}
	}
	
	public void anadircarro() {
		usuarios.get(posicion).setCompras( usuarios.get(posicion).getCompras() + 1);
		vista.BTNCarrito.setText("\n\n🛒" +  usuarios.get(posicion).getCompras());
	}

	public boolean comprobanteStock(int pos, int tipo, ArrayList <Comida> comidas, HashMap <Comida, Integer> cantidades) {
		boolean existencias=false;
		for(Map.Entry<Comida, Integer> c : cantidades.entrySet()) {
			if(tipo == 1) {
				if(c.getKey().equals(comidas.get(pos))) {
					System.out.println("Se han cogido "+c.getValue());
					if(c.getKey().getCantidad()-c.getValue()<=0) {
						System.out.println("Se han cogido "+c.getValue());
						existencias=true;
					}
				}
			} else if(tipo == 2) {
				int prueba=pos+3;
				if(c.getKey().equals(comidas.get(prueba))) {
					System.out.println("Se han cogido "+c.getValue());
					if(c.getKey().getCantidad()-c.getValue()<=0) {
						System.out.println("Se han cogido "+c.getValue());
						existencias=true;
					}
				}
			} else if(tipo == 3) {
				int prueba=pos+6;
				if(c.getKey().equals(comidas.get(prueba))) {
					System.out.println("Se han cogido "+c.getValue());
					if(c.getKey().getCantidad()-c.getValue()<=0) {
						System.out.println("Se han cogido "+c.getValue());
						existencias=true;
					}
				}
			} else if(tipo == 4) {
				int prueba=pos+9;
				if(c.getKey().equals(comidas.get(prueba))) {
					System.out.println("Se han cogido "+c.getValue());
					if(c.getKey().getCantidad()-c.getValue()<=0) {
						System.out.println("Se han cogido "+c.getValue());
						existencias=true;
					}
				}	
			}  else if(tipo == 5) {
				if(c.getKey().equals(comidas.get(pos))) {
					System.out.println("Se han cogido "+c.getValue());
					if(c.getKey().getCantidad()-c.getValue()<=0) {
						System.out.println("Se han cogido "+c.getValue());
						existencias=true;
					}
				}
			}
		}
		System.out.println("DEBUG → tipo = " + tipo + ", pos inicial = " + pos);
		return existencias;
	}
	
	public void comprobanteCarrito(int pos, int tipo, ArrayList<Comida> comidas, HashMap<Comida, Integer> cantidades) {
	    
	    if (tipo == 2) {
	    	pos =pos+ 3;
	    } else if (tipo == 3) {
	        pos =pos+ 6;
	    } else if (tipo == 4) {
	        pos =pos+ 9;
	    }
	    for (Map.Entry<Comida, Integer> entry : cantidades.entrySet()) {
	        if (entry.getKey().equals(comidas.get(pos))) {
	            cantidades.put(entry.getKey(), entry.getValue() + 1);
	            
	           if(vista.PanelHamburguesa.isVisible()) {
		           vista.PanelHamburguesa.LblAlertaStock.setText("Se ha añadido 1 producto");
	           } else if(vista.PanelPromocion.isVisible()) {
		           vista.PanelPromocion.LblAlertaStockPro.setText("Se ha añadido 1 producto");
	           }
	           
	           añadirJlist(cantidades,modelo);
	            
	            anadircarro();
	            break; 
	        }
	    }
	}
	public void añadirJlist(HashMap<Comida,Integer>carrito,DefaultListModel<String> modelo) {
		modelo.clear();
		 double recibo=0;
		for (Map.Entry<Comida, Integer> entry : carrito.entrySet()) {
			if(entry.getValue()>0) {
				Comida comida = entry.getKey();
			    int cantidad = entry.getValue();
				
			     
			    double total = cantidad * comida.getPrecio();
			    recibo+=total;
				 
			    modelo.addElement(cantidad + " uds → " + comida.getNombre() + " | Total: " + total + "€");
			    vista.PanelCarrito.list.setModel(modelo);
			    
			} 
			vista.PanelCarrito.LblCobroTotal.setText(String.valueOf(recibo)+" $");
		}
	}
	
	
	public static void resetearValores(HashMap<Comida, Integer> cantidades) {
	    for (Comida key : cantidades.keySet()) {
	    	cantidades.put(key, 0);
	    }
	}
	public void contadorVentas(ArrayList<Comida>comidas,HashMap<Comida,Integer>cantidades) {
		for(Map.Entry<Comida, Integer> c: cantidades.entrySet()) {
			if(c.getValue()>0) {
				c.getKey().setVendido(c.getValue());
				c.getKey().setCantidad(c.getKey().getCantidad()-c.getValue());
				total=total+c.getValue();
				}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {		
		
		if(e.getClickCount() == 2) {
			int posicion = this.vista.PanelLista.listacomidas.locationToIndex(e.getPoint());
			vista.PanelLista.LblVentas.setText(String.valueOf(comidas.get(posicion).getVendido()));
			this.vista.PanelLista.LblTituloComida.setText(comidas.get(posicion).getNombre());
			this.vista.PanelLista.lblUds.setText(String.valueOf(comidas.get(posicion).getCantidad()));
			if(total==0) {
				vista.PanelLista.Barracomida.setValue(0);
			}else {
				int progreso=(comidas.get(posicion).getVendido()*100)/total;
				vista.PanelLista.Barracomida.setValue(progreso);
				vista.PanelLista.LblPorcentaje.setText(String.valueOf((comidas.get(posicion).getVendido() * 100) / total)+" %");
			}
			
		}
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
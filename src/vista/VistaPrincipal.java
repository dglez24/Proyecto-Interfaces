package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import controlador.Funcionalidad;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	public JPanel PanelRegistro;
	public JButton btnRegistrar;
	public JButton btnIniciar;
	public JButton btnAdmin;
	public JButton BTNCerrarSesion;
	public JLabel FotoFondoReg;
	public JPanel PanelTituloReg;
	public JLabel lblNewLabel;
	public JPanel PNombre;
	public JPanel PApellidos;
	public JPanel PCorreo;
	public JPanel PContra;
	public JTextField TFNombre;
	public JTextField TFApellidos;
	public JTextField TFCorreo;
	public JTextField TFContra;
	public JLabel LblNombre;
	public JLabel LblApellidos;
	public JLabel LblCorreo;
	public JLabel LblContrasea;
	public JPanel PClave;
	public JLabel LblClave;
	public JTextField TFClave;
	public JLabel LblAvisoCorreo;
	public JPanel PanelAvisoCorreo;
	public JPanel PanelAvisoContra;
	public JLabel LblAvisoContra;
	public JPanel PanelAvisoClave;
	public JLabel LblAvisoClave;
	public JButton BTNHamburguesa;
	public JButton BTNComponentes;
	public JButton BTNBebidas;
	public JButton BTNPostres;
	public JButton BTNPromociones;
	public JLabel LblMenu;
	public JPanel POferta;
	public JPanel PLogo;
	public JLabel FotoLogo;
	public JLabel LblSaludo;
	public PanelLista PanelLista;
	public PanelHamburguesa PanelHamburguesa;
	public PanelPromocion PanelPromocion;
	public PanelAdmin PanelAdmin;
	public Ruleta Ruleta;
	public JButton BTNRuleta;
	public OpcionRegistrar OpcionRegistrar;
	public JButton BTNSalirRegi;
	public JButton BTNModificacion;
	public JButton BTNCarrito;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					Funcionalidad funcionalidad = new Funcionalidad(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 512);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 64, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		OpcionRegistrar = new OpcionRegistrar();
		OpcionRegistrar.setBounds(130, 100, 600, 300);
		contentPane.add(OpcionRegistrar);
		OpcionRegistrar.setLayout(null);
		
		Ruleta = new Ruleta();
		Ruleta.setBounds(130, 100, 600, 300);
		contentPane.add(Ruleta);
		Ruleta.setLayout(null);
		
		
		PanelLista = new PanelLista();
		PanelLista.setBounds(0, 0, 859, 484);
		contentPane.add(PanelLista);
		PanelLista.setLayout(null);
		


		
		PanelHamburguesa = new PanelHamburguesa();
		PanelHamburguesa.setBounds(0, 0, 859, 484);
		contentPane.add(PanelHamburguesa);
		PanelHamburguesa.setLayout(null);
		
		
		PanelPromocion = new PanelPromocion();
		PanelPromocion.setBounds(0, 0, 859, 484);
		contentPane.add(PanelPromocion);
		PanelPromocion.setLayout(null);
		
		PanelAdmin = new PanelAdmin();
		PanelAdmin.setBounds(0, 0, 859, 484);
		contentPane.add(PanelAdmin);
		PanelAdmin.setLayout(null);
		
		PanelRegistro = new JPanel();
		PanelRegistro.setBounds(235, 12, 380, 450);
		contentPane.add(PanelRegistro);
		PanelRegistro.setBackground(new Color(192, 192, 192));
		PanelRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		PanelRegistro.setLayout(null);
		/*235, 12, 380, 450*/

		

		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 81));
		panel.setBounds(0, 42, 859, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(0, 22, 859, 357);
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		
		BTNCerrarSesion = new JButton("Cerrar Sesión");
		BTNCerrarSesion.setBackground(new Color(178, 34, 34));
		BTNCerrarSesion.setBounds(735, 10, 120, 19);
		contentPane.add(BTNCerrarSesion);
		
		BTNRuleta = new JButton("Ruleta");
		BTNRuleta.setBackground(new Color(217, 179, 26));
		BTNRuleta.setBounds(635, 10, 84, 20);
		contentPane.add(BTNRuleta);
		

		
		BTNHamburguesa = new JButton("Hamburguesas");
		BTNHamburguesa.setBackground(new Color(255, 255, 255));
		BTNHamburguesa.setOpaque(false);
		BTNHamburguesa.setBorderPainted(false);
		BTNHamburguesa.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNHamburguesa.setHorizontalAlignment(SwingConstants.LEFT);
		BTNHamburguesa.setBounds(37, 74, 186, 37);
		panel_1.add(BTNHamburguesa);
		
		BTNComponentes = new JButton("Complementos");
		BTNComponentes.setBackground(new Color(255, 255, 255));
		BTNComponentes.setOpaque(false);
		BTNComponentes.setBorderPainted(false);
		BTNComponentes.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNComponentes.setHorizontalAlignment(SwingConstants.LEFT);
		BTNComponentes.setBounds(37, 121, 173, 37);
		panel_1.add(BTNComponentes);
		
		BTNBebidas = new JButton("Bebidas");
		BTNBebidas.setBackground(new Color(255, 255, 255));
		BTNBebidas.setOpaque(false);
		BTNBebidas.setBorderPainted(false);
		BTNBebidas.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNBebidas.setHorizontalAlignment(SwingConstants.LEFT);
		BTNBebidas.setBounds(37, 168, 119, 37);
		panel_1.add(BTNBebidas);
		
		BTNPostres = new JButton("Postres");
		BTNPostres.setBackground(new Color(255, 255, 255));
		BTNPostres.setOpaque(false);
		BTNPostres.setBorderPainted(false);
		BTNPostres.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNPostres.setHorizontalAlignment(SwingConstants.LEFT);
		BTNPostres.setBounds(37, 215, 107, 37);
		panel_1.add(BTNPostres);
		
		BTNPromociones = new JButton("Promociones");
		BTNPromociones.setBackground(new Color(255, 255, 255));
		BTNPromociones.setOpaque(false);
		BTNPromociones.setBorderPainted(false);
		BTNPromociones.setFont(new Font("Tahoma", Font.BOLD, 18));
		BTNPromociones.setHorizontalAlignment(SwingConstants.LEFT);
		BTNPromociones.setBounds(37, 262, 157, 37);
		panel_1.add(BTNPromociones);
		
		LblMenu = new JLabel("Menu");
		LblMenu.setBackground(new Color(255, 255, 255));
		LblMenu.setOpaque(false);
		LblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		LblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		LblMenu.setBounds(37, 27, 95, 37);
		panel_1.add(LblMenu);
		
		POferta = new JPanel();
		POferta.setBackground(new Color(255, 115, 47));
		POferta.setBounds(302, 102, 362, 198);
		panel_1.add(POferta);
		POferta.setLayout(null);
		
		PLogo = new JPanel();
		PLogo.setBackground(new Color(255, 115, 47));
		PLogo.setBounds(706, 7, 143, 143);
		panel_1.add(PLogo);
		PLogo.setLayout(null);
		
		FotoLogo = new JLabel("");
		FotoLogo.setBounds(10, 10, 123, 123);
		PLogo.add(FotoLogo);
		FotoLogo.setIcon(new ImageIcon("Imagenes/LogoTrabajo.png"));
		
		LblSaludo = new JLabel("");
		LblSaludo.setFont(new Font("Tahoma", Font.BOLD, 25));
		LblSaludo.setHorizontalAlignment(SwingConstants.CENTER);
		LblSaludo.setBounds(235, 10, 429, 37);
		panel_1.add(LblSaludo);
		

		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnRegistrar.setBackground(new Color(255, 128, 64));
		btnRegistrar.setBounds(79, 400, 206, 33);
		PanelRegistro.add(btnRegistrar);
		
		btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnIniciar.setBackground(new Color(255, 128, 64));
		btnIniciar.setBounds(79, 400, 206, 33);
		PanelRegistro.add(btnIniciar);
		
		btnAdmin = new JButton("Iniciar como Administrador");
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAdmin.setBackground(new Color(255, 128, 64));
		btnAdmin.setBounds(49, 364, 285, 26);
		PanelRegistro.add(btnAdmin);
		
	
		
		PanelTituloReg = new JPanel();
		PanelTituloReg.setBackground(new Color(255, 255, 255));
		PanelTituloReg.setBounds(49, 27, 293, 53);
		PanelRegistro.add(PanelTituloReg);
		PanelTituloReg.setLayout(null);
		
		PanelAvisoCorreo = new JPanel();
		PanelAvisoCorreo.setBackground(new Color(255, 255, 255));
		PanelAvisoCorreo.setBounds(35, 234, 107, 18);
		PanelRegistro.add(PanelAvisoCorreo);
		PanelAvisoCorreo.setLayout(null);
		
		PanelAvisoContra = new JPanel();
		PanelAvisoContra.setLayout(null);
		PanelAvisoContra.setBackground(Color.WHITE);
		PanelAvisoContra.setBounds(35, 287, 137, 18);
		PanelRegistro.add(PanelAvisoContra);
		
		LblAvisoContra = new JLabel("La Contraseña ya existe");
		LblAvisoContra.setHorizontalAlignment(SwingConstants.CENTER);
		LblAvisoContra.setForeground(new Color(209, 3, 3));
		LblAvisoContra.setFont(new Font("Tahoma", Font.BOLD, 11));
		LblAvisoContra.setBounds(2, 2, 132, 14);
		PanelAvisoContra.add(LblAvisoContra);
		
		LblAvisoCorreo = new JLabel("El Correo ya existe");
		LblAvisoCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		LblAvisoCorreo.setBounds(2, 2, 102, 14);
		PanelAvisoCorreo.add(LblAvisoCorreo);
		LblAvisoCorreo.setForeground(new Color(209, 3, 3));
		LblAvisoCorreo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 293, 53);
		PanelTituloReg.add(lblNewLabel);
		

		
		PNombre = new JPanel();
		PNombre.setBackground(new Color(255, 255, 255));
		PNombre.setBounds(49, 102, 105, 17);
		PanelRegistro.add(PNombre);
		PNombre.setLayout(null);
		
		LblNombre = new JLabel("Nombre");
		LblNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LblNombre.setBounds(0, 0, 105, 18);
		PNombre.add(LblNombre);
		
		PApellidos = new JPanel();
		PApellidos.setBackground(new Color(255, 255, 255));
		PApellidos.setBounds(49, 154, 105, 17);
		PanelRegistro.add(PApellidos);
		PApellidos.setLayout(null);
		
		LblApellidos = new JLabel("Apellidos");
		LblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		LblApellidos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblApellidos.setBounds(0, 0, 105, 18);
		PApellidos.add(LblApellidos);
		
		PCorreo = new JPanel();
		PCorreo.setBackground(new Color(255, 255, 255));
		PCorreo.setBounds(49, 207, 105, 17);
		PanelRegistro.add(PCorreo);
		PCorreo.setLayout(null);
		
		LblCorreo = new JLabel("Correo");
		LblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		LblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblCorreo.setBounds(0, 0, 105, 18);
		PCorreo.add(LblCorreo);
		
		PContra = new JPanel();
		PContra.setBackground(new Color(255, 255, 255));
		PContra.setBounds(49, 262, 105, 17);
		PanelRegistro.add(PContra);
		PContra.setLayout(null);
		
		LblContrasea = new JLabel("Contraseña");
		LblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		LblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblContrasea.setBounds(0, 0, 105, 18);
		PContra.add(LblContrasea);
		
		PClave = new JPanel();
		PClave.setBackground(new Color(255, 255, 255));
		PClave.setLayout(null);
		PClave.setBounds(49, 315, 105, 17);
		PanelRegistro.add(PClave);
		
		LblClave = new JLabel("Clave");
		LblClave.setHorizontalAlignment(SwingConstants.CENTER);
		LblClave.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblClave.setBounds(0, 0, 105, 18);
		PClave.add(LblClave);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(172, 102, 170, 18);
		PanelRegistro.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFApellidos = new JTextField();
		TFApellidos.setColumns(10);
		TFApellidos.setBounds(172, 154, 170, 18);
		PanelRegistro.add(TFApellidos);
		
		TFCorreo = new JTextField();
		TFCorreo.setColumns(10);
		TFCorreo.setBounds(172, 207, 170, 18);
		PanelRegistro.add(TFCorreo);
		
		TFContra = new JTextField();
		TFContra.setColumns(10);
		TFContra.setBounds(172, 262, 170, 18);
		PanelRegistro.add(TFContra);
		

		
		TFClave = new JTextField();
		TFClave.setColumns(10);
		TFClave.setBounds(172, 314, 170, 18);
		PanelRegistro.add(TFClave);
		
		PanelAvisoClave = new JPanel();
		PanelAvisoClave.setLayout(null);
		PanelAvisoClave.setBackground(Color.WHITE);
		PanelAvisoClave.setBounds(35, 336, 107, 18);
		PanelRegistro.add(PanelAvisoClave);
		
		LblAvisoClave = new JLabel("Clave Incorrecta");
		LblAvisoClave.setHorizontalAlignment(SwingConstants.CENTER);
		LblAvisoClave.setForeground(new Color(209, 3, 3));
		LblAvisoClave.setFont(new Font("Tahoma", Font.BOLD, 11));
		LblAvisoClave.setBounds(2, 2, 102, 14);
		PanelAvisoClave.add(LblAvisoClave);
		
		BTNSalirRegi = new JButton("Atras");
		BTNSalirRegi.setBackground(new Color(185, 0, 0));
		BTNSalirRegi.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		BTNSalirRegi.setBounds(290, 400, 75, 33);
		PanelRegistro.add(BTNSalirRegi);
		
		FotoFondoReg = new JLabel("");
		FotoFondoReg.setBounds(10, 10, 360, 430);
		PanelRegistro.add(FotoFondoReg);
		FotoFondoReg.setIcon(new ImageIcon("Imagenes/FondoRegistro.png"));
		
		BTNModificacion = new JButton("Administrar");
		BTNModificacion.setBackground(new Color(255, 255, 128));
		BTNModificacion.setBounds(10, 10, 150, 20);
		contentPane.add(BTNModificacion);
		
		BTNCarrito = new JButton("\n\n🛒");
		BTNCarrito.setBackground(new Color(128, 255, 0));
		BTNCarrito.setBounds(534, 10, 84, 20);
		contentPane.add(BTNCarrito);


	}
}

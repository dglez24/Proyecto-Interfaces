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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	public JPanel PanelRegistro;
	public JButton btnRegistrar;
	public JButton btnIniciar;
	public JButton btnAdmin;
	public JButton btnRegIni;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
		
		PanelRegistro = new JPanel();
		PanelRegistro.setBackground(new Color(192, 192, 192));
		PanelRegistro.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		PanelRegistro.setBounds(235, 12, 380, 450);
		contentPane.add(PanelRegistro);
		PanelRegistro.setLayout(null);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(255, 128, 64));
		btnRegistrar.setBounds(49, 342, 126, 33);
		PanelRegistro.add(btnRegistrar);
		
		btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciar.setBackground(new Color(255, 128, 64));
		btnIniciar.setBounds(216, 342, 126, 33);
		PanelRegistro.add(btnIniciar);
		
		btnAdmin = new JButton("Iniciar como Administrador");
		btnAdmin.setBackground(new Color(255, 128, 64));
		btnAdmin.setBounds(87, 385, 206, 46);
		PanelRegistro.add(btnAdmin);
		
	
		
		PanelTituloReg = new JPanel();
		PanelTituloReg.setBounds(49, 27, 293, 53);
		PanelRegistro.add(PanelTituloReg);
		PanelTituloReg.setLayout(null);
		
		lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 293, 53);
		PanelTituloReg.add(lblNewLabel);
		

		
		PNombre = new JPanel();
		PNombre.setBounds(49, 122, 105, 17);
		PanelRegistro.add(PNombre);
		PNombre.setLayout(null);
		
		LblNombre = new JLabel("Nombre");
		LblNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LblNombre.setBounds(0, 0, 105, 18);
		PNombre.add(LblNombre);
		
		PApellidos = new JPanel();
		PApellidos.setBounds(49, 174, 105, 17);
		PanelRegistro.add(PApellidos);
		PApellidos.setLayout(null);
		
		LblApellidos = new JLabel("Apellidos");
		LblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		LblApellidos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblApellidos.setBounds(0, 0, 105, 18);
		PApellidos.add(LblApellidos);
		
		PCorreo = new JPanel();
		PCorreo.setBounds(49, 227, 105, 17);
		PanelRegistro.add(PCorreo);
		PCorreo.setLayout(null);
		
		LblCorreo = new JLabel("Correo");
		LblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		LblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblCorreo.setBounds(0, 0, 105, 18);
		PCorreo.add(LblCorreo);
		
		PContra = new JPanel();
		PContra.setBounds(49, 282, 105, 17);
		PanelRegistro.add(PContra);
		PContra.setLayout(null);
		
		LblContrasea = new JLabel("Contraseña");
		LblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		LblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblContrasea.setBounds(0, 0, 105, 18);
		PContra.add(LblContrasea);
		
		TFNombre = new JTextField();
		TFNombre.setBounds(172, 121, 170, 18);
		PanelRegistro.add(TFNombre);
		TFNombre.setColumns(10);
		
		TFApellidos = new JTextField();
		TFApellidos.setColumns(10);
		TFApellidos.setBounds(172, 173, 170, 18);
		PanelRegistro.add(TFApellidos);
		
		TFCorreo = new JTextField();
		TFCorreo.setColumns(10);
		TFCorreo.setBounds(172, 226, 170, 18);
		PanelRegistro.add(TFCorreo);
		
		TFContra = new JTextField();
		TFContra.setColumns(10);
		TFContra.setBounds(172, 281, 170, 18);
		PanelRegistro.add(TFContra);
		
		FotoFondoReg = new JLabel("");
		FotoFondoReg.setBounds(10, 10, 360, 430);
		PanelRegistro.add(FotoFondoReg);
		FotoFondoReg.setIcon(new ImageIcon("Imagenes/FondoRegistro.png"));
		
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
		
		btnRegIni = new JButton("Registrar");
		btnRegIni.setBackground(new Color(178, 34, 34));
		btnRegIni.setBounds(753, 10, 96, 19);
		contentPane.add(btnRegIni);

	}
}

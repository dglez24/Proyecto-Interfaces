package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	public JPanel Regis;
	public JButton btnRegistrar;
	public JButton btnIniciar;
	public JButton btnAdmin;
	public JButton btnRegIni;

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
		contentPane.setBackground(new Color(139, 69, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Regis = new JPanel();
		Regis.setBounds(235, 10, 382, 445);
		contentPane.add(Regis);
		Regis.setLayout(null);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(255, 140, 0));
		btnRegistrar.setBounds(62, 342, 113, 33);
		Regis.add(btnRegistrar);
		
		btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.setBackground(new Color(255, 140, 0));
		btnIniciar.setBounds(203, 342, 113, 33);
		Regis.add(btnIniciar);
		
		btnAdmin = new JButton("Iniciar como Administrador");
		btnAdmin.setBackground(new Color(255, 140, 0));
		btnAdmin.setBounds(85, 385, 206, 46);
		Regis.add(btnAdmin);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(0, 29, 859, 413);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(0, 22, 859, 370);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnRegIni = new JButton("Registrar");
		btnRegIni.setBackground(new Color(178, 34, 34));
		btnRegIni.setBounds(775, 0, 84, 29);
		contentPane.add(btnRegIni);

	}
}

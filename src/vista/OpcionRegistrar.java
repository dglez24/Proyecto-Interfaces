package vista;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class OpcionRegistrar extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton BTNRegistroIni;
	public JButton BTNInicioIno;
	public JPanel PLogo;
	public JLabel FotoLogo;
	public JButton BTNSalir;

	/**
	 * Create the panel.
	 */
	public OpcionRegistrar() {
		setBackground(new Color(255, 128, 64));
		setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		setLayout(null);
		
		BTNRegistroIni = new JButton("Registrarse");
		BTNRegistroIni.setBackground(new Color(255, 255, 128));
		BTNRegistroIni.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		BTNRegistroIni.setBounds(54, 200, 183, 55);
		add(BTNRegistroIni);
		
		BTNInicioIno = new JButton("Iniciar Sesion\r\n");
		BTNInicioIno.setBackground(new Color(255, 255, 128));
		BTNInicioIno.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		BTNInicioIno.setBounds(364, 200, 183, 55);
		add(BTNInicioIno);
		

		PLogo = new JPanel();
		PLogo.setBackground(new Color(255, 115, 47));
		PLogo.setBounds(215, 20, 170, 170);
		this.add(PLogo);
		PLogo.setLayout(null);
		
		FotoLogo = new JLabel("");
		FotoLogo.setBounds(10, 10, 150, 150);
		PLogo.add(FotoLogo);
		FotoLogo.setIcon(new ImageIcon("Imagenes/LogoTrabajo_i.png"));
		
		BTNSalir = new JButton("Salir");
		BTNSalir.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		BTNSalir.setBackground(new Color(185, 0, 0));
		BTNSalir.setBounds(497, 10, 93, 36);
		add(BTNSalir);

	}
}

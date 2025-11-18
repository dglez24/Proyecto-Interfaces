package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Ruleta extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JLabel Foto1;
	public JLabel Foto2;
	public JLabel Foto3;
	public JButton BTNTirar;
	public JLabel LblInfoTiros;



	
	public Ruleta() {
		setBackground(new Color(255, 128, 64));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(10, 30, 580, 185);
		add(panel);
		panel.setLayout(null);
		
		Foto1 = new JLabel("");
		Foto1.setBounds(10, 10, 165, 165);
		Foto1.setIcon(new ImageIcon("Imagenes/imagenB.png"));
		panel.add(Foto1);
		
		Foto2 = new JLabel("");
		Foto2.setBounds(205, 10, 165, 165);
		Foto2.setIcon(new ImageIcon("Imagenes/imagenH.png"));
		panel.add(Foto2);
		
		Foto3 = new JLabel("");
		Foto3.setBounds(405, 10, 165, 165);
		Foto3.setIcon(new ImageIcon("Imagenes/imagenP.png"));
		panel.add(Foto3);
		
		BTNTirar = new JButton("Tirar");
		BTNTirar.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		BTNTirar.setBackground(new Color(255, 255, 0));
		BTNTirar.setBounds(236, 236, 105, 41);
		add(BTNTirar);
		
		LblInfoTiros = new JLabel("Tiros : ");
		LblInfoTiros.setFont(new Font("Verdana", Font.PLAIN, 25));
		LblInfoTiros.setBounds(20, 225, 116, 52);
		add(LblInfoTiros);
		


	}
}

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
	public JButton BTNSalir;

	public JLabel Foto1_H;
	public JLabel Foto2_H;
	public JLabel Foto3_H;

	public JLabel Foto1_B;
	public JLabel Foto2_B;
	public JLabel Foto3_B;
	public JLabel Foto1_P;
	public JLabel Foto2_P;
	public JLabel Foto3_P;



	
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

		Foto1_H = new JLabel("");
		Foto1_H.setIcon(new ImageIcon("Imagenes/imagenH.png"));
		Foto1_H.setBounds(10, 10, 165, 165);
		panel.add(Foto1_H);
		
		Foto2_H = new JLabel("");
		Foto2_H.setIcon(new ImageIcon("Imagenes/imagenH.png"));
		Foto2_H.setBounds(205, 10, 165, 165);
		panel.add(Foto2_H);
		
		Foto3_H = new JLabel("");
		Foto3_H.setIcon(new ImageIcon("Imagenes/imagenH.png"));
		Foto3_H.setBounds(405, 10, 165, 165);
		panel.add(Foto3_H);
		
		Foto1_B = new JLabel("");
		Foto1_B.setIcon(new ImageIcon("Imagenes/imagenB.png"));
		Foto1_B.setBounds(10, 10, 165, 165);
		panel.add(Foto1_B);
		
		Foto2_B = new JLabel("");
		Foto2_B.setIcon(new ImageIcon("Imagenes/imagenB.png"));
		Foto2_B.setBounds(205, 10, 165, 165);
		panel.add(Foto2_B);
		
		Foto3_B = new JLabel("");
		Foto3_B.setIcon(new ImageIcon("Imagenes/imagenB.png"));
		Foto3_B.setBounds(405, 10, 165, 165);
		panel.add(Foto3_B);
		
		Foto1_P = new JLabel("");
		Foto1_P.setIcon(new ImageIcon("Imagenes/imagenP.png"));
		Foto1_P.setBounds(10, 10, 165, 165);
		panel.add(Foto1_P);
		
		Foto2_P = new JLabel("");
		Foto2_P.setIcon(new ImageIcon("Imagenes/imagenP.png"));
		Foto2_P.setBounds(205, 10, 165, 165);
		panel.add(Foto2_P);
		
		Foto3_P = new JLabel("");
		Foto3_P.setIcon(new ImageIcon("Imagenes/imagenP.png"));
		Foto3_P.setBounds(405, 10, 165, 165);
		panel.add(Foto3_P);
		
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
		
		BTNSalir = new JButton("Salir");
		BTNSalir.setBackground(new Color(185, 0, 0));
		BTNSalir.setFont(new Font("Tahoma", Font.BOLD, 10));
		BTNSalir.setBounds(506, 270, 84, 20);
		add(BTNSalir);
		


	}
}

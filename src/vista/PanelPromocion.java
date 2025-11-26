package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class PanelPromocion extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JPanel panel_1;
	public JButton btnAtras;
	public JLabel LblTituloPro;
	public JPanel PanelPro1;
	public JPanel PanelPro2;
	public JLabel LblOferton1;
	public JLabel LblOferton2;
	public JLabel Foto1Of1;
	public JLabel Foto2Of1;
	public JLabel LblMas;
	public JLabel LblinfoOf;
	public JButton BTNAnadirOf1;
	public JLabel Foto1Of2;
	public JLabel lblSoloPor;
	public JButton BTNAnadirOf2;
	public JLabel Lblpor3;

	/**
	 * Create the panel.
	 */
	public PanelPromocion() {
		setBackground(new Color(128, 64, 0));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(0, 42, 859, 400);
		add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setBounds(0, 22, 859, 357);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		LblTituloPro = new JLabel("¡¡¡PROMOCIONES!!!");
		LblTituloPro.setFont(new Font("Rockwell", Font.BOLD, 40));
		LblTituloPro.setHorizontalAlignment(SwingConstants.CENTER);
		LblTituloPro.setBounds(87, 5, 685, 56);
		panel_1.add(LblTituloPro);
		
		PanelPro1 = new JPanel();
		PanelPro1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		PanelPro1.setBackground(new Color(255, 0, 0));
		PanelPro1.setBounds(10, 71, 375, 263);
		panel_1.add(PanelPro1);
		PanelPro1.setLayout(null);
		
		LblOferton1 = new JLabel() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.rotate(Math.toRadians(-35), getWidth() / 2, getHeight() / 2);
				super.paintComponent(g2);
				g2.dispose();
			}			
		};
		LblOferton1.setForeground(new Color(255, 255, 255));
		LblOferton1.setText("¡¡¡Oferton!!!");
		LblOferton1.setHorizontalAlignment(SwingConstants.CENTER);
		LblOferton1.setFont(new Font("Tahoma", Font.BOLD, 34));
		LblOferton1.setBounds(-28, -30, 206, 153);
		PanelPro1.add(LblOferton1);
		
		Foto1Of1 = new JLabel("New label");
		Foto1Of1.setBounds(10, 47, 150, 150);
		PanelPro1.add(Foto1Of1);
		
		
		Foto2Of1 = new JLabel("New label");
		Foto2Of1.setBounds(210, 47, 150, 150);
		PanelPro1.add(Foto2Of1);
		
		LblMas = new JLabel("+");
		LblMas.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblMas.setHorizontalAlignment(SwingConstants.CENTER);
		LblMas.setBounds(156, 105, 44, 43);
		PanelPro1.add(LblMas);
		
		LblinfoOf = new JLabel("Solo por: 13.99 €");
		LblinfoOf.setFont(new Font("Tahoma", Font.BOLD, 25));
		LblinfoOf.setBounds(10, 207, 231, 46);
		PanelPro1.add(LblinfoOf);
		
		BTNAnadirOf1 = new JButton("Añadir");
		BTNAnadirOf1.setBackground(new Color(255, 255, 128));
		BTNAnadirOf1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		BTNAnadirOf1.setBounds(237, 219, 123, 21);
		PanelPro1.add(BTNAnadirOf1);
		
		
		
		
		
		
		
		
		PanelPro2 = new JPanel();
		PanelPro2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		PanelPro2.setBackground(new Color(255, 0, 0));
		PanelPro2.setBounds(474, 71, 375, 263);
		panel_1.add(PanelPro2);
		PanelPro2.setLayout(null);
		
		LblOferton2 = new JLabel() {
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.rotate(Math.toRadians(35), getWidth() / 2, getHeight() / 2);
				super.paintComponent(g2);
				g2.dispose();
			}
		};
		LblOferton2.setForeground(new Color(255, 255, 255));
		LblOferton2.setBounds(196, -25, 206, 153);

		LblOferton2.setText("¡¡¡Oferton!!!");
		LblOferton2.setHorizontalAlignment(SwingConstants.CENTER);
		LblOferton2.setFont(new Font("Tahoma", Font.BOLD, 34));
		PanelPro2.add(LblOferton2);
		
		Foto1Of2 = new JLabel("New label");
		Foto1Of2.setBounds(35, 55, 150, 150);
		PanelPro2.add(Foto1Of2);
		
		lblSoloPor = new JLabel("Solo por: 19.99 €");
		lblSoloPor.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSoloPor.setBounds(10, 207, 231, 46);
		PanelPro2.add(lblSoloPor);
		
		BTNAnadirOf2 = new JButton("Añadir");
		BTNAnadirOf2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		BTNAnadirOf2.setBackground(new Color(255, 255, 128));
		BTNAnadirOf2.setBounds(237, 219, 123, 21);
		PanelPro2.add(BTNAnadirOf2);
		
		Lblpor3 = new JLabel("x3");
		Lblpor3.setFont(new Font("Tahoma", Font.BOLD, 35));
		Lblpor3.setHorizontalAlignment(SwingConstants.CENTER);
		Lblpor3.setBounds(237, 96, 64, 64);
		PanelPro2.add(Lblpor3);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(187, 0, 0));
		btnAtras.setBounds(766, 12, 84, 20);
		add(btnAtras);

	}
}

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
		LblOferton1.setText("¡¡¡Oferton!!!");
		LblOferton1.setHorizontalAlignment(SwingConstants.CENTER);
		LblOferton1.setFont(new Font("Tahoma", Font.BOLD, 34));
		LblOferton1.setBounds(-28, -30, 206, 153);
		PanelPro1.add(LblOferton1);
		
		
		
		
		
		
		
		
		PanelPro2 = new JPanel();
		PanelPro2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		PanelPro2.setBackground(new Color(255, 0, 0));
		PanelPro2.setBounds(454, 71, 375, 263);
		panel_1.add(PanelPro2);
		PanelPro2.setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(187, 0, 0));
		btnAtras.setBounds(766, 12, 84, 20);
		add(btnAtras);

	}
}

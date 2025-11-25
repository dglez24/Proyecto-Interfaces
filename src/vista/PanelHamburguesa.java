package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class PanelHamburguesa extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel nom1;
	public JLabel nom2;
	public JLabel nom3;
	public JButton BtnAtras;
	public JPanel panel;
	public JPanel panel_1;
	public JButton img1;
	public JButton img2;
	public JButton img3;
	public JLabel precio1;
	public JLabel precio2;
	public JLabel precio3;
	public JButton BtnHambu;
	public JButton BtnComple;
	public JButton BtnBebi;
	public JButton BtnPost;

	/**
	 * Create the panel.
	 */
	public PanelHamburguesa() {
		setBackground(new Color(128, 64, 0));
		setLayout(null);
		
		
		
		BtnAtras = new JButton("Atras");
		BtnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		BtnAtras.setBackground(new Color(187, 0, 0));
		BtnAtras.setBounds(766, 10, 84, 20);
		add(BtnAtras);
		
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
		
		nom1 = new JLabel("Texto prod 1");
		nom1.setForeground(new Color(255, 255, 255));
		nom1.setHorizontalAlignment(SwingConstants.CENTER);
		nom1.setBounds(48, 198, 177, 13);
		panel_1.add(nom1);
		
		nom2 = new JLabel("Texto prod 2");
		nom2.setHorizontalAlignment(SwingConstants.CENTER);
		nom2.setForeground(new Color(255, 255, 255));
		nom2.setBounds(334, 198, 177, 13);
		panel_1.add(nom2);
		
		nom3 = new JLabel("Texto prod 3");
		nom3.setHorizontalAlignment(SwingConstants.CENTER);
		nom3.setForeground(new Color(255, 255, 255));
		nom3.setBounds(626, 198, 177, 13);
		panel_1.add(nom3);
		
		img1 = new JButton("New button");
		img1.setBounds(61, 10, 156, 156);
		panel_1.add(img1);
		
		img2 = new JButton("New button");
		img2.setBounds(343, 10, 156, 156);
		panel_1.add(img2);
		
		img3 = new JButton("New button");
		img3.setBounds(638, 10, 156, 156);
		panel_1.add(img3);
		
		precio1 = new JLabel("Precio 1");
		precio1.setHorizontalAlignment(SwingConstants.CENTER);
		precio1.setBounds(111, 221, 44, 12);
		panel_1.add(precio1);
		
		precio2 = new JLabel("Precio 2");
		precio2.setHorizontalAlignment(SwingConstants.CENTER);
		precio2.setBounds(400, 221, 44, 12);
		panel_1.add(precio2);
		
		precio3 = new JLabel("Precio 3");
		precio3.setHorizontalAlignment(SwingConstants.CENTER);
		precio3.setBounds(696, 221, 44, 12);
		panel_1.add(precio3);
		
		BtnHambu = new JButton("Hamburguesas");
		BtnHambu.setBounds(61, 327, 101, 20);
		panel_1.add(BtnHambu);
		
		BtnComple = new JButton("Complementos");
		BtnComple.setBounds(255, 327, 101, 20);
		panel_1.add(BtnComple);
		
		BtnBebi = new JButton("Bebidas");
		BtnBebi.setBounds(483, 327, 101, 20);
		panel_1.add(BtnBebi);
		
		BtnPost = new JButton("Postres");
		BtnPost.setBounds(696, 327, 107, 20);
		panel_1.add(BtnPost);

	}
}

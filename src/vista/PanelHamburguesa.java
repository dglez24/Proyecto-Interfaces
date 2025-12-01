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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public JLabel LblAlertaStock;
	public JLabel LblPremio;

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
		BtnHambu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		BtnHambu.setBackground(new Color(255, 255, 128));
		BtnHambu.setBounds(42, 327, 141, 20);
		panel_1.add(BtnHambu);
		
		BtnComple = new JButton("Complementos");
		BtnComple.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		BtnComple.setBackground(new Color(255, 255, 128));
		BtnComple.setBounds(245, 327, 141, 20);
		panel_1.add(BtnComple);
		
		BtnBebi = new JButton("Bebidas");
		BtnBebi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		BtnBebi.setBackground(new Color(255, 255, 128));
		BtnBebi.setBounds(458, 327, 141, 20);
		panel_1.add(BtnBebi);
		
		BtnPost = new JButton("Postres");
		BtnPost.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		BtnPost.setBackground(new Color(255, 255, 128));
		BtnPost.setBounds(675, 327, 141, 20);
		panel_1.add(BtnPost);
		
		LblAlertaStock = new JLabel("");
		LblAlertaStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LblAlertaStock.setBounds(197, 0, 452, 22);
		panel.add(LblAlertaStock);
		LblAlertaStock.setHorizontalAlignment(SwingConstants.CENTER);
		LblAlertaStock.setForeground(new Color(255, 0, 0));
		
		LblPremio = new JLabel("");
		LblPremio.setHorizontalAlignment(SwingConstants.CENTER);
		LblPremio.setForeground(new Color(255, 255, 255));
		LblPremio.setBounds(27, 10, 159, 20);
		add(LblPremio);

	}
}

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

public class PanelHamburguesa extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel img1;
	public JSeparator separator;
	public JLabel img3;
	public JLabel img2;
	public JLabel nom1;
	public JLabel nom2;
	public JLabel nom3;
	public JButton BtnAtras;
	public JPanel panel;
	public JPanel panel_1;

	/**
	 * Create the panel.
	 */
	public PanelHamburguesa() {
		setBackground(new Color(128, 64, 0));
		setLayout(null);
		
		
		
		BtnAtras = new JButton("Atras");
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
		
		img1 = new JLabel("imagen");
		img1.setHorizontalAlignment(SwingConstants.CENTER);
		img1.setBounds(119, 98, 34, 13);
		panel_1.add(img1);
		
		separator = new JSeparator();
		separator.setBounds(315, 10, 0, 2);
		panel_1.add(separator);
		
		img3 = new JLabel("imagen");
		img3.setHorizontalAlignment(SwingConstants.CENTER);
		img3.setBounds(315, 115, 34, 13);
		panel_1.add(img3);
		
		img2 = new JLabel("imagen");
		img2.setHorizontalAlignment(SwingConstants.CENTER);
		img2.setBounds(465, 115, 34, 13);
		panel_1.add(img2);
		
		nom1 = new JLabel("Texto prod 1");
		nom1.setForeground(new Color(255, 255, 255));
		nom1.setHorizontalAlignment(SwingConstants.LEFT);
		nom1.setBounds(106, 147, 58, 13);
		panel_1.add(nom1);
		
		nom2 = new JLabel("Texto prod 2");
		nom2.setForeground(new Color(255, 255, 255));
		nom2.setBounds(446, 68, 58, 13);
		panel_1.add(nom2);
		
		nom3 = new JLabel("Texto prod 3");
		nom3.setForeground(new Color(255, 255, 255));
		nom3.setBounds(551, 98, 58, 13);
		panel_1.add(nom3);

	}
}

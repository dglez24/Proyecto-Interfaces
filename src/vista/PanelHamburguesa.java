package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class PanelHamburguesa extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JSeparator separator;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_5;

	/**
	 * Create the panel.
	 */
	public PanelHamburguesa() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 61, 121, 120);
		add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(10, 250, 840, 8);
		add(separator);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(683, 61, 121, 120);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(339, 322, 121, 120);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Texto prod 1");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(58, 322, 121, 120);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Texto prod 2");
		lblNewLabel_4.setBounds(339, 61, 121, 120);
		add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Texto prod 3");
		lblNewLabel_5.setBounds(683, 322, 121, 120);
		add(lblNewLabel_5);

	}
}

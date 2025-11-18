package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class PanelHamburguesa extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JSeparator separator;

	/**
	 * Create the panel.
	 */
	public PanelHamburguesa() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(60, 178, 119, 33);
		add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(10, 250, 840, 8);
		add(separator);

	}
}

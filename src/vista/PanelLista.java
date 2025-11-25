package vista;

import javax.swing.JPanel;
import java.awt.Color;

public class PanelLista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JPanel panel_1;

	/**
	 * Create the panel.
	 */
	public PanelLista() {
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

	}

}

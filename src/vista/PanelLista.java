package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class PanelLista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JPanel panel_1;
	public JButton btnAtras;

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
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(187, 0, 0));
		btnAtras.setBounds(768, 10, 84, 20);
		add(btnAtras);

	}
}

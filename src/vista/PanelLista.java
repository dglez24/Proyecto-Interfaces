package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PanelLista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JButton btnAtras;

	/**
	 * Create the panel.
	 */
	public PanelLista() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(60, 60, 60));
		panel.setBounds(0, 42, 859, 400);
		add(panel);
		panel.setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(255, 255, 255));
		btnAtras.setBounds(768, 10, 84, 20);
		add(btnAtras);

	}
}

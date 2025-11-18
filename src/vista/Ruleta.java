package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Ruleta extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;



	
	public Ruleta() {
		setBackground(new Color(255, 128, 64));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(49, 30, 501, 185);
		add(panel);
		


	}
}

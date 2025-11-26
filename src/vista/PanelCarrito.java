package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelCarrito extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel LblTituloCarrito;

	public PanelCarrito() {
		setBorder(new EmptyBorder(0, 2, 0, 0));
		setBackground(new Color(229, 229, 229));
		setLayout(null);
		
		LblTituloCarrito = new JLabel("Carrito");
		LblTituloCarrito.setFont(new Font("MV Boli", Font.PLAIN, 40));
		LblTituloCarrito.setHorizontalAlignment(SwingConstants.CENTER);
		LblTituloCarrito.setBounds(37, 10, 240, 58);
		add(LblTituloCarrito);

	}
}

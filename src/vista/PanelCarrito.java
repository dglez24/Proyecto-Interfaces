package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCarrito extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel LblTituloCarrito;
	public JScrollPane scrollPane;
	public JList list;
	public JButton BtnEliminar;
	public JButton BtnPagar;
	public JLabel LblTotalPagar;
	public JLabel LblCobroTotal;
	public JLabel LblDescuento;

	public PanelCarrito() {
		setBorder(new EmptyBorder(0, 2, 0, 0));
		setBackground(new Color(229, 229, 229));
		setLayout(null);
		
		LblTituloCarrito = new JLabel("Carrito");
		LblTituloCarrito.setFont(new Font("MV Boli", Font.PLAIN, 40));
		LblTituloCarrito.setHorizontalAlignment(SwingConstants.CENTER);
		LblTituloCarrito.setBounds(37, 10, 240, 58);
		add(LblTituloCarrito);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 80, 220, 208);
		add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		BtnEliminar = new JButton("🗑️");
		BtnEliminar.setForeground(new Color(0, 0, 0));
		BtnEliminar.setBackground(new Color(206, 0, 0));
		BtnEliminar.setBounds(58, 308, 53, 40);
		add(BtnEliminar);
		
		BtnPagar = new JButton("Pagar");
		BtnPagar.setFont(new Font("SimSun", Font.BOLD, 20));
		BtnPagar.setForeground(new Color(255, 255, 255));
		BtnPagar.setBackground(new Color(0, 255, 0));
		BtnPagar.setBounds(161, 308, 116, 40);
		add(BtnPagar);
		
		LblTotalPagar = new JLabel("Total a pagar:");
		LblTotalPagar.setHorizontalAlignment(SwingConstants.CENTER);
		LblTotalPagar.setBounds(60, 62, 99, 23);
		add(LblTotalPagar);
		
		LblCobroTotal = new JLabel("");
		LblCobroTotal.setBounds(147, 62, 45, 23);
		add(LblCobroTotal);
		
		LblDescuento = new JLabel("Descuento");
		LblDescuento.setBounds(202, 59, 45, 28);
		add(LblDescuento);

	}
}

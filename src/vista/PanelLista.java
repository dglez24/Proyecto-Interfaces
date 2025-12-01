package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class PanelLista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JButton btnAtras;
	public JScrollPane scrollPane;
	public JList list;
	public JButton BTNRestar;
	public JButton BTNSumar;
	public JPanel PanelUds;
	public JLabel LblUds;
	public JLabel LblTituloUds;

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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(128, 35, 399, 331);
		panel.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		BTNRestar = new JButton("-");
		BTNRestar.setForeground(new Color(255, 255, 255));
		BTNRestar.setFont(new Font("Tahoma", Font.BOLD, 30));
		BTNRestar.setBackground(new Color(0, 0, 0));
		BTNRestar.setBounds(34, 101, 84, 56);
		panel.add(BTNRestar);
		
		BTNSumar = new JButton("+");
		BTNSumar.setForeground(new Color(255, 255, 255));
		BTNSumar.setFont(new Font("Tahoma", Font.BOLD, 30));
		BTNSumar.setBackground(new Color(0, 0, 0));
		BTNSumar.setBounds(34, 35, 84, 56);
		panel.add(BTNSumar);
		
		PanelUds = new JPanel();
		PanelUds.setBorder(new LineBorder(new Color(255, 255, 255)));
		PanelUds.setBackground(new Color(0, 0, 0));
		PanelUds.setBounds(34, 246, 84, 120);
		panel.add(PanelUds);
		PanelUds.setLayout(null);
		
		LblUds = new JLabel("20");
		LblUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblUds.setHorizontalAlignment(SwingConstants.CENTER);
		LblUds.setBounds(10, 6, 64, 104);
		LblUds.setForeground(new Color(255, 255, 255));
		PanelUds.add(LblUds);
		
		LblTituloUds = new JLabel("Uds");
		LblTituloUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblTituloUds.setForeground(new Color(255, 255, 255));
		LblTituloUds.setHorizontalAlignment(SwingConstants.CENTER);
		LblTituloUds.setBounds(34, 202, 84, 34);
		panel.add(LblTituloUds);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(255, 255, 255));
		btnAtras.setBounds(768, 10, 84, 20);
		add(btnAtras);

	}
}

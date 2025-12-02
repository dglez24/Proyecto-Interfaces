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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class PanelLista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JButton btnAtras;
	public JPanel PanelModUds;
	public JScrollPane scrollPane;
	public JButton bTNRestar;
	public JButton bTNSumar;
	public JPanel panelUds;
	public JLabel lblUds;
	public JLabel lblTituloUds;
	public JLabel LblTituloComida;
	public JList listacomidas;
	public JPanel panelModUds;
	public JProgressBar Barracomida;
	public JLabel LblTitVentas;
	public JLabel LblVentas;
	public JLabel LblPorcentaje;

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
		
		PanelModUds = new JPanel();
		PanelModUds.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelModUds.setBackground(new Color(128, 128, 128));
		PanelModUds.setBounds(24, 10, 387, 380);
		panel.add(PanelModUds);
		PanelModUds.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 61, 239, 296);
		PanelModUds.add(scrollPane);
		
		listacomidas = new JList();
		scrollPane.setViewportView(listacomidas);
		
		bTNRestar = new JButton("-");
		bTNRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bTNRestar.setForeground(Color.WHITE);
		bTNRestar.setFont(new Font("Tahoma", Font.BOLD, 30));
		bTNRestar.setBackground(Color.BLACK);
		bTNRestar.setBounds(29, 127, 84, 56);
		PanelModUds.add(bTNRestar);
		
		bTNSumar = new JButton("+");
		bTNSumar.setForeground(Color.WHITE);
		bTNSumar.setFont(new Font("Tahoma", Font.BOLD, 30));
		bTNSumar.setBackground(Color.BLACK);
		bTNSumar.setBounds(29, 61, 84, 56);
		PanelModUds.add(bTNSumar);
		
		panelUds = new JPanel();
		panelUds.setLayout(null);
		panelUds.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelUds.setBackground(Color.BLACK);
		panelUds.setBounds(29, 237, 84, 120);
		PanelModUds.add(panelUds);
		
		lblUds = new JLabel("0");
		lblUds.setHorizontalAlignment(SwingConstants.CENTER);
		lblUds.setForeground(Color.WHITE);
		lblUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUds.setBounds(10, 6, 64, 104);
		panelUds.add(lblUds);
		
		lblTituloUds = new JLabel("Uds");
		lblTituloUds.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloUds.setForeground(Color.WHITE);
		lblTituloUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTituloUds.setBounds(29, 193, 84, 34);
		PanelModUds.add(lblTituloUds);
		
		LblTituloComida = new JLabel("Titulo");
		LblTituloComida.setForeground(new Color(255, 255, 255));
		LblTituloComida.setFont(new Font("Tahoma", Font.BOLD, 20));
		LblTituloComida.setHorizontalAlignment(SwingConstants.CENTER);
		LblTituloComida.setBounds(0, 10, 387, 41);
		PanelModUds.add(LblTituloComida);
		
		panelModUds = new JPanel();
		panelModUds.setLayout(null);
		panelModUds.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelModUds.setBackground(Color.GRAY);
		panelModUds.setBounds(442, 104, 387, 178);
		panel.add(panelModUds);
		
		Barracomida = new JProgressBar();
		Barracomida.setForeground(new Color(0, 255, 0));
		Barracomida.setBounds(28, 81, 331, 22);
		panelModUds.add(Barracomida);
		
		LblTitVentas = new JLabel("Ventas producto:");
		LblTitVentas.setHorizontalAlignment(SwingConstants.LEFT);
		LblTitVentas.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblTitVentas.setForeground(new Color(255, 255, 255));
		LblTitVentas.setBounds(28, 10, 275, 61);
		panelModUds.add(LblTitVentas);
		
		LblVentas = new JLabel("0");
		LblVentas.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblVentas.setForeground(new Color(255, 255, 255));
		LblVentas.setBounds(300, 10, 87, 61);
		panelModUds.add(LblVentas);
		
		LblPorcentaje = new JLabel("0 %");
		LblPorcentaje.setFont(new Font("Tahoma", Font.BOLD, 30));
		LblPorcentaje.setForeground(new Color(255, 255, 255));
		LblPorcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		LblPorcentaje.setBounds(28, 113, 331, 51);
		panelModUds.add(LblPorcentaje);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(255, 255, 255));
		btnAtras.setBounds(768, 10, 84, 20);
		add(btnAtras);

	}
}

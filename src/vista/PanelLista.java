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
		PanelModUds.setBounds(29, 28, 387, 349);
		panel.add(PanelModUds);
		PanelModUds.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 27, 239, 296);
		PanelModUds.add(scrollPane);
		
		bTNRestar = new JButton("-");
		bTNRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bTNRestar.setForeground(Color.WHITE);
		bTNRestar.setFont(new Font("Tahoma", Font.BOLD, 30));
		bTNRestar.setBackground(Color.BLACK);
		bTNRestar.setBounds(29, 93, 84, 56);
		PanelModUds.add(bTNRestar);
		
		bTNSumar = new JButton("+");
		bTNSumar.setForeground(Color.WHITE);
		bTNSumar.setFont(new Font("Tahoma", Font.BOLD, 30));
		bTNSumar.setBackground(Color.BLACK);
		bTNSumar.setBounds(29, 27, 84, 56);
		PanelModUds.add(bTNSumar);
		
		panelUds = new JPanel();
		panelUds.setLayout(null);
		panelUds.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelUds.setBackground(Color.BLACK);
		panelUds.setBounds(29, 203, 84, 120);
		PanelModUds.add(panelUds);
		
		lblUds = new JLabel("20");
		lblUds.setHorizontalAlignment(SwingConstants.CENTER);
		lblUds.setForeground(Color.WHITE);
		lblUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUds.setBounds(10, 6, 64, 104);
		panelUds.add(lblUds);
		
		lblTituloUds = new JLabel("Uds");
		lblTituloUds.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloUds.setForeground(Color.WHITE);
		lblTituloUds.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTituloUds.setBounds(29, 159, 84, 34);
		PanelModUds.add(lblTituloUds);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAtras.setBackground(new Color(255, 255, 255));
		btnAtras.setBounds(768, 10, 84, 20);
		add(btnAtras);

	}
}

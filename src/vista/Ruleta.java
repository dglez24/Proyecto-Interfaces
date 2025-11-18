package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class Ruleta extends JPanel {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JLabel Lblfoto1;
	public JLabel lblfoto1;
	public JLabel lblfoto1_1;
	public JButton BTNTirar;
	public JLabel LblInfoTiros;



	
	public Ruleta() {
		setBackground(new Color(255, 128, 64));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(10, 30, 580, 185);
		add(panel);
		panel.setLayout(null);
		
		Lblfoto1 = new JLabel("");
		Lblfoto1.setBounds(10, 10, 165, 165);
		panel.add(Lblfoto1);
		
		lblfoto1 = new JLabel("");
		lblfoto1.setBounds(205, 10, 165, 165);
		panel.add(lblfoto1);
		
		lblfoto1_1 = new JLabel("");
		lblfoto1_1.setBounds(405, 10, 165, 165);
		panel.add(lblfoto1_1);
		
		BTNTirar = new JButton("Tirar");
		BTNTirar.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		BTNTirar.setBackground(new Color(255, 255, 0));
		BTNTirar.setBounds(236, 236, 105, 41);
		add(BTNTirar);
		
		LblInfoTiros = new JLabel("Tiros : ");
		LblInfoTiros.setFont(new Font("Verdana", Font.PLAIN, 25));
		LblInfoTiros.setBounds(20, 225, 116, 52);
		add(LblInfoTiros);
		


	}
}



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salario extends JFrame {

	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtReceber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salario frame = new Salario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Salario() {
		setTitle("Sal\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 230, 528, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Sal\u00E1rio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbl5 = new JLabel("Bonus");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl5.setBounds(199, 11, 98, 14);
		contentPane.add(lbl5);
		
		JLabel lblSalrioAReceber = new JLabel("Sal\u00E1rio a Receber");
		lblSalrioAReceber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalrioAReceber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalrioAReceber.setBounds(370, 11, 132, 14);
		contentPane.add(lblSalrioAReceber);
		
		txtSalario = new JTextField();
		txtSalario.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSalario.setBounds(10, 28, 115, 26);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JSpinner spPorc = new JSpinner();
		spPorc.setModel(new SpinnerNumberModel(5, 0, 20, 5));
		spPorc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spPorc.setBounds(197, 28, 115, 26);
		contentPane.add(spPorc);
		
		txtReceber = new JTextField();
		txtReceber.setHorizontalAlignment(SwingConstants.CENTER);
		txtReceber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtReceber.setBounds(380, 28, 122, 26);
		contentPane.add(txtReceber);
		txtReceber.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 75, 236, 162);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Desconto");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 11, 216, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("INSS (7,5%)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 37, 107, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lbl3 = new JLabel("VT (6%)");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(10, 62, 107, 14);
		panel.add(lbl3);
		
		JLabel lbl2 = new JLabel("VA (4,5%)");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2.setBounds(10, 87, 107, 14);
		panel.add(lbl2);
		
		JLabel lblValorDoDesconto = new JLabel("Valor do Desconto");
		lblValorDoDesconto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDoDesconto.setBounds(10, 137, 129, 14);
		panel.add(lblValorDoDesconto);
		
		JLabel lblINSS = new JLabel("0");
		lblINSS.setHorizontalAlignment(SwingConstants.RIGHT);
		lblINSS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblINSS.setBounds(160, 36, 66, 14);
		panel.add(lblINSS);
		
		JLabel lblVT = new JLabel("0");
		lblVT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVT.setBounds(160, 64, 66, 14);
		panel.add(lblVT);
		
		JLabel lblVA = new JLabel("0");
		lblVA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVA.setBounds(160, 89, 66, 14);
		panel.add(lblVA);
		
		JLabel lblDesconto = new JLabel("0");
		lblDesconto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesconto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesconto.setBounds(160, 139, 66, 14);
		panel.add(lblDesconto);
		
		JLabel label = new JLabel("_____________");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(10, 112, 216, 23);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(266, 75, 236, 162);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBonificao1 = new JLabel("Bonifica\u00E7\u00E3o");
		lblBonificao1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonificao1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBonificao1.setBounds(10, 11, 216, 14);
		panel_1.add(lblBonificao1);
		
		JLabel lbl4 = new JLabel("Bonus");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(10, 36, 107, 14);
		panel_1.add(lbl4);
		
		JLabel lblVc = new JLabel("VC (5%)");
		lblVc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVc.setBounds(10, 61, 107, 14);
		panel_1.add(lblVc);
		
		JLabel lblTotalBonus = new JLabel("Total Bonus");
		lblTotalBonus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalBonus.setBounds(10, 137, 107, 14);
		panel_1.add(lblTotalBonus);
		
		JLabel lblBonus = new JLabel("0");
		lblBonus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBonus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBonus.setBounds(160, 38, 66, 14);
		panel_1.add(lblBonus);
		
		JLabel lblVC = new JLabel("0");
		lblVC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVC.setBounds(160, 63, 66, 14);
		panel_1.add(lblVC);
		
		JLabel lblBonificacao = new JLabel("0");
		lblBonificacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBonificacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBonificacao.setBounds(160, 139, 66, 14);
		panel_1.add(lblBonificacao);
		
		JLabel lblNewLabel_1 = new JLabel("_____________");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 115, 216, 23);
		panel_1.add(lblNewLabel_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.setBounds(413, 255, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salario.this.dispose();
			}
		});
		btnFechar.setBounds(10, 255, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(217, 255, 89, 23);
		contentPane.add(btnLimpar);
	}
}
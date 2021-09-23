package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salario extends JFrame {

	private JPanel contentPane;
	private JTextField txtSalario;

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
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 315, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(34, 24, 28));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Salario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 13, 120, 20);
		contentPane.add(lblNewLabel);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(10, 45, 130, 27);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblBonus = new JLabel("Digite o Bonus");
		lblBonus.setForeground(Color.WHITE);
		lblBonus.setFont(new Font("Arial", Font.PLAIN, 17));
		lblBonus.setBounds(179, 13, 120, 20);
		contentPane.add(lblBonus);
		
		JPanel panelDesconto = new JPanel();
		panelDesconto.setBounds(10, 92, 130, 125);
		contentPane.add(panelDesconto);
		panelDesconto.setLayout(null);
		panelDesconto.setBackground(new Color(166, 58, 80));
		panelDesconto.setForeground(new Color(255, 255, 255));
		panelDesconto.setVisible(false);
		
		JLabel lb = new JLabel("INSS");
		lb.setFont(new Font("Arial", Font.PLAIN, 12));
		lb.setBounds(10, 29, 46, 14);
		panelDesconto.add(lb);
		lb.setForeground(new Color(255, 255, 255));
		
		JLabel lblVt = new JLabel("VT( 6% )");
		lblVt.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVt.setBounds(10, 53, 46, 14);
		panelDesconto.add(lblVt);
		lblVt.setForeground(new Color(255, 255, 255));
		
		JLabel lblVa = new JLabel("VA( 6% )");
		lblVa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVa.setBounds(10, 76, 46, 14);
		panelDesconto.add(lblVa);
		lblVa.setForeground(new Color(255, 255, 255));
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblTotal.setBounds(10, 100, 46, 14);
		panelDesconto.add(lblTotal);
		
		
		JLabel txtInss = new JLabel("0");
		txtInss.setHorizontalAlignment(SwingConstants.CENTER);
		txtInss.setFont(new Font("Arial", Font.PLAIN, 12));
		txtInss.setBounds(84, 29, 36, 14);
		panelDesconto.add(txtInss);
		txtInss.setForeground(new Color(255, 255, 255));
		
		JLabel txtVt = new JLabel("0");
		txtVt.setHorizontalAlignment(SwingConstants.CENTER);
		txtVt.setFont(new Font("Arial", Font.PLAIN, 12));
		txtVt.setBounds(84, 54, 36, 14);
		panelDesconto.add(txtVt);
		txtVt.setForeground(new Color(255, 255, 255));
		
		JLabel txtVa = new JLabel("0");
		txtVa.setHorizontalAlignment(SwingConstants.CENTER);
		txtVa.setFont(new Font("Arial", Font.PLAIN, 12));
		txtVa.setBounds(84, 77, 36, 14);
		panelDesconto.add(txtVa);
		txtVa.setForeground(new Color(255, 255, 255));
		
		JLabel totalDesconto = new JLabel("0");
		totalDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		totalDesconto.setFont(new Font("Arial", Font.PLAIN, 12));
		totalDesconto.setBounds(84, 101, 36, 14);
		panelDesconto.add(totalDesconto);
		
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesconto.setFont(new Font("Arial", Font.BOLD, 12));
		lblDesconto.setBounds(21, 3, 99, 14);
		panelDesconto.add(lblDesconto);
		
		JSpinner spBonus = new JSpinner();
		spBonus.setModel(new SpinnerNumberModel(5, 0, 100, 5));
		spBonus.setBounds(169, 45, 130, 27);
		contentPane.add(spBonus);
		
		JButton btnClear = new JButton("");
		
		btnClear.setIcon(new ImageIcon(Salario.class.getResource("/imagens/limpeza-de-casa.png")));
		btnClear.setBounds(10, 228, 63, 32);
		contentPane.add(btnClear);
		btnClear.setBorder(new EmptyBorder(0,0,0,0));
		btnClear.setBackground(new Color(34, 24, 28));
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(Salario.class.getResource("/imagens/cursor (2).png")));
		btnCalcular.setBounds(118, 228, 82, 32);
		contentPane.add(btnCalcular);
		btnCalcular.setBorder(new EmptyBorder(0,0,0,0));
		btnCalcular.setBackground(new Color(34, 24, 28));
		
		JButton btnClose = new JButton("");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salario.this.dispose();
			}
		});
		btnClose.setIcon(new ImageIcon(Salario.class.getResource("/imagens/fechar (2).png")));
		btnClose.setBounds(242, 228, 57, 32);
		contentPane.add(btnClose);
		btnClose.setBorder(new EmptyBorder(0,0,0,0));
		btnClose.setBackground(new Color(34, 24, 28));
		

		JPanel panelBonus = new JPanel();
		panelBonus.setLayout(null);
		panelBonus.setBounds(169, 92, 130, 125);
		panelBonus.setBackground(new Color(166, 58, 80));
		panelBonus.setForeground(new Color(255, 255, 255));
		contentPane.add(panelBonus);
		panelBonus.setVisible(false);
		
		JLabel lblBonus_1 = new JLabel("Bonus");
		lblBonus_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBonus_1.setBounds(10, 29, 46, 14);
		panelBonus.add(lblBonus_1);
		lblBonus_1.setForeground(new Color(255, 255, 255));
		
		JLabel lblVt_1 = new JLabel("VT( 5% )");
		lblVt_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVt_1.setBounds(10, 53, 46, 14);
		panelBonus.add(lblVt_1);
		lblVt_1.setForeground(new Color(255, 255, 255));
		
		JLabel label_7 = new JLabel("Total");
		label_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		label_7.setBounds(10, 100, 46, 14);
		panelBonus.add(label_7);
		
		JLabel txtBonus = new JLabel("0");
		txtBonus.setHorizontalAlignment(SwingConstants.CENTER);
		txtBonus.setFont(new Font("Arial", Font.PLAIN, 12));
		txtBonus.setBounds(84, 29, 36, 14);
		panelBonus.add(txtBonus);
		txtBonus.setForeground(new Color(255, 255, 255));
		
		JLabel txtVt5 = new JLabel("0");
		txtVt5.setHorizontalAlignment(SwingConstants.CENTER);
		txtVt5.setFont(new Font("Arial", Font.PLAIN, 12));
		txtVt5.setBounds(84, 54, 36, 14);
		panelBonus.add(txtVt5);
		txtVt5.setForeground(new Color(255, 255, 255));
		
		JLabel totalBonus = new JLabel("0");
		totalBonus.setHorizontalAlignment(SwingConstants.CENTER);
		totalBonus.setFont(new Font("Arial", Font.PLAIN, 12));
		totalBonus.setBounds(84, 101, 36, 14);
		panelBonus.add(totalBonus);
		
		JLabel lblNewLabel_1 = new JLabel("Bonfica\u00E7\u00E3o");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 4, 99, 14);
		panelBonus.add(lblNewLabel_1);
		
		JLabel lbResul = new JLabel("");
		lbResul.setForeground(Color.WHITE);
		lbResul.setFont(new Font("Arial", Font.ITALIC, 20));
		lbResul.setHorizontalAlignment(SwingConstants.CENTER);
		lbResul.setBounds(10, 271, 289, 27);
		contentPane.add(lbResul);
		
		
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double salario = Double.parseDouble(txtSalario.getText());
				double seisPorcento = (salario * 6) / 100;
				
				txtVt.setText(String.valueOf(seisPorcento));
				txtVa.setText(String.valueOf(seisPorcento));
				
				if(salario <= 1045) {
					double resul = (salario * 7.5) / 100;
					txtInss.setText(String.valueOf(resul));
				}
				else if(salario >= 1045.01 && salario <= 2089.60) {
					double resul = (salario * 9) / 100;
					txtInss.setText(String.valueOf(resul));
				}
				else if(salario >= 2089.61 && salario <= 3134.40) {
					double resul = (salario * 12) / 100;
					txtInss.setText(String.valueOf(resul));
				}
				else if(salario >= 3134.41 && salario <= 6101.06) {
					double resul = (salario * 14) / 100;
					txtInss.setText(String.valueOf(resul));
				}else {
					txtInss.setText("ai eh osso");
				}
				
				double inss = Double.parseDouble(txtInss.getText());
				double ttlDesconto = (seisPorcento * 2) + inss;
				
				totalDesconto.setText(String.valueOf(ttlDesconto));
				
				double cincao = (salario * 5) / 100 ;
				
				txtVt5.setText(String.valueOf(cincao));
				
				
				panelDesconto.setVisible(true);
				panelBonus.setVisible(true);
				
				double bonus = Double.parseDouble(spBonus.getValue().toString());
				double resul = (salario*bonus) / 100;
				double ttlBonus = bonus + cincao ;
				
				txtBonus.setText(String.valueOf(resul));
				txtVt5.setText(String.valueOf(cincao));
				totalBonus.setText(String.valueOf(ttlBonus));
				
				double resultado = ( salario - ttlDesconto ) + ttlBonus;
				lbResul.setText("Salario : "+ String.valueOf(resultado));
				
				JOptionPane.showMessageDialog(null, "Salario a pagar: " + resultado);
				
			}
			
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSalario.setText("");
				spBonus.setValue(((SpinnerNumberModel) spBonus.getModel()).getMinimum());
				panelBonus.setVisible(false);
				panelDesconto.setVisible(false);
				}
		});
	}
}

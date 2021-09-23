package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimeiro;
	private JTextField txtSegundo;
	private JTextField txtResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setTitle("Calculadora");
		double valor1 = 0;
		double valor2 = 0;
		double resultado;
		
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 315, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(34, 24, 28));
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPrimeiro.getText() != "" && txtSegundo.getText() != "") {
					double valor1 = Double.parseDouble(txtPrimeiro.getText());
					double valor2 = Double.parseDouble(txtSegundo.getText());
					double resul = valor1 + valor2;
					txtResul.setText(Double.toString(resul));
					}else {
						double valor2 = 1, valor1 = 1;
						double resul = valor1 + valor2;
						txtResul.setText(Double.toString(resul));
					}
			}
		});
		btnSoma.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSoma.setBounds(50, 128, 60, 50);
		btnSoma.setBorder(new EmptyBorder(0,0,0,0));
		contentPane.add(btnSoma);
		btnSoma.setBackground(new Color(21, 96, 100));
		btnSoma.setForeground(new Color(255, 255, 255));
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPrimeiro.getText() != "" && txtSegundo.getText() != "") {
				double valor1 = Double.parseDouble(txtPrimeiro.getText());
				double valor2 = Double.parseDouble(txtSegundo.getText());
				double resul = valor1 - valor2;
				txtResul.setText(Double.toString(resul));
				}else {
					double valor2 = 1, valor1 = 1;
					double resul = valor1 - valor2;
					txtResul.setText(Double.toString(resul));
				}
			}
		});
		btnSub.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSub.setBounds(122, 128, 60, 50);
		contentPane.add(btnSub);
		btnSub.setBorder(new EmptyBorder(0,0,0,0));
		btnSub.setBackground(new Color(21, 96, 100));
		btnSub.setForeground(new Color(255, 255, 255));
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPrimeiro.getText() != "" && txtSegundo.getText() != "") {
					double valor1 = Double.parseDouble(txtPrimeiro.getText());
					double valor2 = Double.parseDouble(txtSegundo.getText());
					double resul = valor1 / valor2;
					txtResul.setText(Double.toString(resul));
					}else {
						double valor2 = 1, valor1 = 1;
						double resul = valor1 / valor2;
						txtResul.setText(Double.toString(resul));
					}
				
			}
		});
		btnDiv.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDiv.setBounds(122, 189, 60, 50);
		contentPane.add(btnDiv);
		btnDiv.setBorder(new EmptyBorder(0,0,0,0));
		btnDiv.setBackground(new Color(21, 96, 100));
		btnDiv.setForeground(new Color(255, 255, 255));
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPrimeiro.getText() != "" && txtSegundo.getText() != "") {
					double valor1 = Double.parseDouble(txtPrimeiro.getText());
					double valor2 = Double.parseDouble(txtSegundo.getText());
					double resul = valor1 * valor2;
					txtResul.setText(Double.toString(resul));
					}else {
						double valor2 = 1, valor1 = 1;
						double resul = valor1 * valor2;
						txtResul.setText(Double.toString(resul));
					}
			}
		});
		btnMult.setFont(new Font("Arial", Font.PLAIN, 20));
		btnMult.setBounds(50, 189, 60, 50);
		contentPane.add(btnMult);
		btnMult.setBorder(new EmptyBorder(0,0,0,0));
		btnMult.setBackground(new Color(21, 96, 100));
		btnMult.setForeground(new Color(255, 255, 255));
		
		JButton btnClean = new JButton("C");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimeiro.setText("");
				txtSegundo.setText("");
				txtResul.setVisible(false);
				
			}
		});
		btnClean.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClean.setBounds(192, 128, 60, 50);
		contentPane.add(btnClean);
		btnClean.setBorder(new EmptyBorder(0,0,0,0));
		btnClean.setBackground(new Color(21, 96, 100));
		btnClean.setForeground(new Color(255, 255, 255));
		
		JButton btnResul = new JButton("=");
		btnResul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResul.setVisible(true);
			}
		});
		btnResul.setFont(new Font("Arial", Font.PLAIN, 20));
		btnResul.setBounds(192, 189, 60, 50);
		btnResul.setBorder(new EmptyBorder(0,0,0,0));
		contentPane.add(btnResul);
		btnResul.setBackground(new Color(21, 96, 100));
		btnResul.setForeground(new Color(255, 255, 255));
		
		txtPrimeiro = new JTextField();
		txtPrimeiro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		txtPrimeiro.setBounds(50, 54, 86, 26);
		contentPane.add(txtPrimeiro);
		txtPrimeiro.setColumns(10);
		
		txtSegundo = new JTextField();
		txtSegundo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		txtSegundo.setColumns(10);
		txtSegundo.setBounds(166, 54, 86, 26);
		contentPane.add(txtSegundo);
		
		txtResul = new JTextField();
		txtResul.setFont(new Font("Arial", Font.PLAIN, 14));
		txtResul.setEnabled(false);
		txtResul.setText("");
		txtResul.setColumns(10);
		txtResul.setBounds(50, 91, 202, 26);
		txtResul.setBackground(new Color(166, 58, 80));
		txtResul.setForeground(new Color(255, 255, 255));
		contentPane.add(txtResul);
		txtResul.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("1\u00BA Valor");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(50, 29, 66, 14);
		lblNewLabel.setForeground(new Color(21, 96, 100));
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("2\u00BA Valor");
		lblValor.setForeground(new Color(21, 96, 100));
		lblValor.setFont(new Font("Arial", Font.BOLD, 17));
		lblValor.setBounds(166, 30, 66, 14);
		contentPane.add(lblValor);
		
		JButton btnClose = new JButton("");
		btnClose.setIcon(new ImageIcon(calculadora.class.getResource("/imagens/fechar (2).png")));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.this.dispose();
			}
		});
		btnClose.setBackground(new Color(34, 24, 28));
		btnClose.setBorder(new EmptyBorder(0,0,0,0));
		btnClose.setBounds(254, 11, 51, 32);
		btnClose.setForeground(new Color(166, 58, 80));
		contentPane.add(btnClose);
	}
}

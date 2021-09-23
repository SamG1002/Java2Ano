package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Rodizio extends JFrame {

	private JPanel contentPane;
	private JTextField txtAbc;
	private JTextField txtNumeros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rodizio frame = new Rodizio();
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
	public Rodizio() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 450, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(34, 24, 28));
		
		
		
		
		JButton btnClose = new JButton("");
		btnClose.setBounds(383, 11, 51, 32);
		btnClose.setIcon(new ImageIcon(calculadora.class.getResource("/imagens/fechar (2).png")));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rodizio.this.dispose();
			}
		});
		contentPane.setLayout(null);
		btnClose.setBackground(new Color(34, 24, 28));
		btnClose.setBorder(new EmptyBorder(0,0,0,0));
		btnClose.setForeground(new Color(166, 58, 80));
		contentPane.add(btnClose);
		
		txtAbc = new JTextField();
		txtAbc.setHorizontalAlignment(SwingConstants.CENTER);
		txtAbc.setFont(new Font("Arial", Font.BOLD, 65));
		txtAbc.setText("ABC");
		txtAbc.setBounds(53, 114, 157, 86);
		contentPane.add(txtAbc);
		txtAbc.setColumns(10);
		txtAbc.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtAbc.getText().length() >= 3 ) // limit textfield to 3 characters
		            e.consume(); 
		    }  
		});
		
		txtNumeros = new JTextField();
		txtNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeros.setFont(new Font("Arial", Font.BOLD, 55));
		txtNumeros.setText("1234");
		txtNumeros.setBounds(261, 114, 130, 86);
		contentPane.add(txtNumeros);
		txtNumeros.setColumns(10);
		txtNumeros.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtNumeros.getText().length() >= 4 ) // limit textfield to 3 characters
		            e.consume(); 
		    }  
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Rodizio.class.getResource("/imagens/placaEtec.png")));
		label.setBounds(30, 56, 380, 185);
		contentPane.add(label);
		
		JButton btnVerificar = new JButton("Verificar");
		
		btnVerificar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVerificar.setBounds(151, 255, 168, 35);
		contentPane.add(btnVerificar);
		btnVerificar.setBorder(new EmptyBorder(0,0,0,0));
		btnVerificar.setBackground(new Color(166, 58, 80));
		
		JLabel lbDIa = new JLabel("New label");
		lbDIa.setHorizontalAlignment(SwingConstants.CENTER);
		lbDIa.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 30));
		lbDIa.setBounds(106, 11, 246, 26);
		lbDIa.setBackground(new Color(166, 58, 80));
		lbDIa.setForeground(new Color(255, 255, 255));
		lbDIa.setVisible(false);
		contentPane.add(lbDIa);
		
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numero = txtNumeros.getText();
				int numeroF = Integer.parseInt(numero.substring(numero.length()-1));
				if(numeroF == 1  || numeroF == 2) {
					lbDIa.setText("Segunda-Feira");
				}else if(numeroF == 3  || numeroF == 4) {
					lbDIa.setText("Terça-Feira");
				}else if(numeroF == 5  || numeroF == 6) {
					lbDIa.setText("Quarta-Feira");
				}else if(numeroF == 7  || numeroF == 8) {
					lbDIa.setText("Quinta-Feira");
				}else if(numeroF == 9  || numeroF == 0) {
					lbDIa.setText("Sexta-Feira");
				}else  {
					lbDIa.setText("Invalido");
				}
				lbDIa.setVisible(true);
			}
		});
		
		
	}
}

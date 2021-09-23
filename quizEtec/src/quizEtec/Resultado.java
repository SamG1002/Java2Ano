package quizEtec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Resultado extends JFrame {

	private JPanel contentPane;
	private JTextField txtErros;
	private JTextField txtAcertosPorc;
	private JTextField txtErrosPorc;
	private JLabel lblErros_1;
	private JLabel lblAcertos;
	private JLabel lblErros;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultado frame = new Resultado();
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
	public Resultado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextField txtAcertos = new JTextField();
		txtAcertos.setEditable(false);
		txtAcertos.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAcertos.setForeground(Color.LIGHT_GRAY);
		txtAcertos.setBounds(107, 134, 162, 25);
		contentPane.add(txtAcertos);
		txtAcertos.setColumns(10);
		txtAcertos.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 0, 0)));
		txtAcertos.setBackground(contentPane.getBackground());
		txtAcertos.setText(String.valueOf(Pontuacao.getAcertos()));
		
		JButton btnComecar = new JButton("Voltar");
		btnComecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				principal tela = new principal();
				tela.setVisible(true);
				Resultado.this.dispose();
				
				Pontuacao.acertos = 0;
				Pontuacao.erros = 0;
			}
		});
		btnComecar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComecar.setForeground(Color.WHITE);
		btnComecar.setBounds(34, 356, 228, 25);
		btnComecar.setBackground(contentPane.getBackground());
		btnComecar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		contentPane.add(btnComecar);
		
		JLabel lblNewLabel = new JLabel("Acertos");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 133, 74, 25);
		contentPane.add(lblNewLabel);
		
		txtErros = new JTextField();
		txtErros.setEditable(false);
		txtErros.setForeground(Color.LIGHT_GRAY);
		txtErros.setFont(new Font("Arial", Font.PLAIN, 15));
		txtErros.setColumns(10);
		txtErros.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 0, 0)));
		txtErros.setBackground(Color.BLACK);
		txtErros.setBounds(107, 184, 162, 25);
		contentPane.add(txtErros);
		txtErros.setText(String.valueOf(Pontuacao.getErros()));
		
		txtAcertosPorc = new JTextField();
		txtAcertosPorc.setEditable(false);
		txtAcertosPorc.setForeground(Color.LIGHT_GRAY);
		txtAcertosPorc.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAcertosPorc.setColumns(10);
		txtAcertosPorc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 0, 0)));
		txtAcertosPorc.setBackground(Color.BLACK);
		txtAcertosPorc.setBounds(107, 241, 162, 25);
		contentPane.add(txtAcertosPorc);
		txtAcertosPorc.setText(String.valueOf((Pontuacao.getAcertos() * 100) /10)+"%");
		
		txtErrosPorc = new JTextField();
		txtErrosPorc.setEditable(false);
		txtErrosPorc.setForeground(Color.LIGHT_GRAY);
		txtErrosPorc.setFont(new Font("Arial", Font.PLAIN, 15));
		txtErrosPorc.setColumns(10);
		txtErrosPorc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 0, 0)));
		txtErrosPorc.setBackground(Color.BLACK);
		txtErrosPorc.setBounds(107, 295, 162, 25);
		contentPane.add(txtErrosPorc);
		txtErrosPorc.setText(String.valueOf((Pontuacao.getErros() * 100) /10)+"%");
		
		lblErros_1 = new JLabel("Erros");
		lblErros_1.setForeground(Color.WHITE);
		lblErros_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblErros_1.setBounds(10, 189, 74, 25);
		contentPane.add(lblErros_1);
		
		lblAcertos = new JLabel("Acertos (%)");
		lblAcertos.setForeground(Color.WHITE);
		lblAcertos.setFont(new Font("Arial", Font.BOLD, 15));
		lblAcertos.setBounds(10, 246, 81, 25);
		contentPane.add(lblAcertos);
		
		lblErros = new JLabel("Erros (%)");
		lblErros.setForeground(Color.WHITE);
		lblErros.setFont(new Font("Arial", Font.BOLD, 15));
		lblErros.setBounds(10, 300, 74, 25);
		contentPane.add(lblErros);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Resultado.class.getResource("/imagens/bannerMain (2).png")));
		lblNewLabel_1.setBounds(0, 0, 294, 124);
		contentPane.add(lblNewLabel_1);
	}
}

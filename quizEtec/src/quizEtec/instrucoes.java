package quizEtec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class instrucoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instrucoes frame = new instrucoes();
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
	public instrucoes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComecar = new JButton("Voltar");
		btnComecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				principal tela = new principal();
				tela.setVisible(true);
				instrucoes.this.dispose();
			}
		});
		
		btnComecar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComecar.setForeground(Color.WHITE);
		btnComecar.setBounds(34, 356, 228, 25);
		btnComecar.setBackground(contentPane.getBackground());
		btnComecar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		contentPane.add(btnComecar);
		
		JLabel label_1 = new JLabel("Sobre");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.BOLD, 40));
		label_1.setBounds(34, 154, 228, 62);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("Este Teste serve para");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(34, 227, 228, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("descobrir sua lealdade");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 254, 228, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ao Dinizismo");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(44, 290, 218, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(sobre.class.getResource("/imagens/opaDiniz (1).jpeg")));
		lblNewLabel_3.setBounds(0, 0, 294, 150);
		contentPane.add(lblNewLabel_3);
		
	}

}

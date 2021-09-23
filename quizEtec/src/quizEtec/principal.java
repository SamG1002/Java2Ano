package quizEtec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 100, 300, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(principal.class.getResource("/imagens/bannerMain (2).png")));
		label.setBounds(0, 0, 294, 189);
		contentPane.add(label);
		
		JButton btnComecar = new JButton("Comecar");
		btnComecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pergunta01 tela = new pergunta01();
				tela.setVisible(true);
			}
		});
		
		btnComecar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComecar.setForeground(Color.WHITE);
		btnComecar.setBounds(32, 215, 228, 25);
		btnComecar.setBackground(contentPane.getBackground());
		btnComecar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		contentPane.add(btnComecar);
		
		JButton btnInstrucoes = new JButton("Instrucoes");
		btnInstrucoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sobre tela = new sobre();
				tela.setVisible(true);
			}
		});
		btnInstrucoes.setForeground(Color.WHITE);
		btnInstrucoes.setFont(new Font("Arial", Font.PLAIN, 15));
		btnInstrucoes.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		btnInstrucoes.setBackground(Color.BLACK);
		btnInstrucoes.setBounds(32, 267, 228, 25);
		contentPane.add(btnInstrucoes);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instrucoes tela = new instrucoes();
				tela.setVisible(true);
			}
		});
		btnSobre.setForeground(Color.WHITE);
		btnSobre.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSobre.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		btnSobre.setBackground(Color.BLACK);
		btnSobre.setBounds(32, 323, 228, 25);
		contentPane.add(btnSobre);
		
		
	}
}

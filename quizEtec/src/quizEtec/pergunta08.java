package quizEtec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class pergunta08 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pergunta08 frame = new pergunta08();
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
	public pergunta08() {
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
				pergunta08.this.dispose();
				
				Pontuacao.acertos = 0;
				Pontuacao.erros = 0;
			}
		});
		
		btnComecar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComecar.setForeground(Color.WHITE);
		btnComecar.setBounds(31, 346, 80, 25);
		btnComecar.setBackground(contentPane.getBackground());
		btnComecar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		contentPane.add(btnComecar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(pergunta08.class.getResource("/imagens/dinizOticas.jpg")));
		lblNewLabel.setBounds(0, 0, 294, 186);
		contentPane.add(lblNewLabel);
		
		JButton btnDica = new JButton("Dica");
		btnDica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "O cara eh visionario no Futebol");
				
			}
		});
		btnDica.setForeground(Color.WHITE);
		btnDica.setFont(new Font("Arial", Font.PLAIN, 15));
		btnDica.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		btnDica.setBackground(Color.BLACK);
		btnDica.setBounds(181, 346, 80, 25);
		contentPane.add(btnDica);
		
		JButton btnProsseguir = new JButton("Prosseguir");
		
		btnProsseguir.setForeground(Color.WHITE);
		btnProsseguir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnProsseguir.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		btnProsseguir.setBackground(Color.BLACK);
		btnProsseguir.setBounds(31, 385, 230, 25);
		contentPane.add(btnProsseguir);
		
		JRadioButton rdOp1 = new JRadioButton("Visao de Futebol");
		rdOp1.setFont(new Font("Arial", Font.PLAIN, 11));
		rdOp1.setBounds(31, 256, 109, 23);
		contentPane.add(rdOp1);
		
		JRadioButton rdOp2 = new JRadioButton("Saida de bola ");
		rdOp2.setFont(new Font("Arial", Font.PLAIN, 11));
		rdOp2.setBounds(152, 256, 109, 23);
		contentPane.add(rdOp2);
		
		JRadioButton rdOp3 = new JRadioButton("Posse de bola");
		rdOp3.setFont(new Font("Arial", Font.PLAIN, 11));
		rdOp3.setBounds(31, 302, 109, 23);
		contentPane.add(rdOp3);
		
		JRadioButton rdOp4 = new JRadioButton("tontura");
		rdOp4.setFont(new Font("Arial", Font.PLAIN, 11));
		rdOp4.setBounds(152, 302, 109, 23);
		contentPane.add(rdOp4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdOp1);
		bg.add(rdOp2);
		bg.add(rdOp3);
		bg.add(rdOp4);
		
		btnProsseguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bg.isSelected(null)){
					JOptionPane.showMessageDialog(null, "selecione Alguma opcao");
				}else {
					
					if(rdOp1.isSelected()){
						Pontuacao.setAcertos();
					}else{
						Pontuacao.setErros();
					}
					pergunta09 tela = new pergunta09();
					tela.setVisible(true);
					pergunta08.this.dispose();
					
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Oticas diniz te da?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(31, 197, 230, 52);
		contentPane.add(lblNewLabel_1);
	}

}

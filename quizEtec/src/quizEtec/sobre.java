package quizEtec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sobre frame = new sobre();
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
	public sobre() {
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
				sobre.this.dispose();
			}
		});
		
		btnComecar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComecar.setForeground(Color.WHITE);
		btnComecar.setBounds(34, 356, 228, 25);
		btnComecar.setBackground(contentPane.getBackground());
		btnComecar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 0, 0)));
		contentPane.add(btnComecar);
		
		JLabel lblNewLabel = new JLabel("Copyright Samuel, 2020");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 309, 228, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Respeite com Silencio");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(46, 20, 216, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblBrennerEstaDormindo = new JLabel("Brenner ta dormindo");
		lblBrennerEstaDormindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrennerEstaDormindo.setForeground(Color.WHITE);
		lblBrennerEstaDormindo.setFont(new Font("Arial", Font.BOLD, 20));
		lblBrennerEstaDormindo.setBounds(46, 56, 216, 25);
		contentPane.add(lblBrennerEstaDormindo);
		
		JLabel lblLogoTemJogo = new JLabel("Kingnaldo Esta de olho");
		lblLogoTemJogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoTemJogo.setForeground(Color.WHITE);
		lblLogoTemJogo.setFont(new Font("Arial", Font.BOLD, 18));
		lblLogoTemJogo.setBounds(46, 92, 216, 25);
		contentPane.add(lblLogoTemJogo);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(sobre.class.getResource("/imagens/theKingnaldo.png")));
		lblNewLabel_2.setBounds(0, 128, 294, 158);
		contentPane.add(lblNewLabel_2);
		
		
	}
}

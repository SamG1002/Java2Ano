package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Principal");
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 300, 210);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 24, 28));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalario = new JButton("");
		btnSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salario janela = new Salario();
				janela.setVisible(true);
			}
		});
		btnSalario.setIcon(new ImageIcon(Menu.class.getResource("/imagens/salary.png")));
		btnSalario.setBounds(113, 26, 65, 65);
		contentPane.add(btnSalario);
		btnSalario.setBorder(new EmptyBorder(0,0,0,0));
		btnSalario.setBackground(new Color(34, 24, 28));
		
		JButton btnMercado = new JButton("");
		btnMercado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mercado janela = new Mercado();
				janela.setVisible(true);
			}
		});
		btnMercado.setIcon(new ImageIcon(Menu.class.getResource("/imagens/comprar.png")));
		btnMercado.setBounds(113, 112, 65, 65);
		contentPane.add(btnMercado);
		btnMercado.setBorder(new EmptyBorder(0,0,0,0));
		btnMercado.setBackground(new Color(34, 24, 28));
		
		JButton btnRodizio = new JButton("");
		btnRodizio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rodizio janela = new Rodizio();
				janela.setVisible(true);
			}
		});
		btnRodizio.setIcon(new ImageIcon(Menu.class.getResource("/imagens/numero.png")));
		btnRodizio.setBounds(192, 26, 65, 65);
		contentPane.add(btnRodizio);
		btnRodizio.setBorder(new EmptyBorder(0,0,0,0));
		btnRodizio.setBackground(new Color(34, 24, 28));
		
		JButton btnFechar = new JButton("");
		btnFechar.setIcon(new ImageIcon(Menu.class.getResource("/imagens/fechar.png")));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu.this.dispose();
			}
		});
		btnFechar.setBounds(192, 112, 65, 65);
		contentPane.add(btnFechar);
		btnFechar.setBorder(new EmptyBorder(0,0,0,0));
		btnFechar.setBackground(new Color(34, 24, 28));
		
		JButton btnRestaurante = new JButton("");
		btnRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restaurante janela = new Restaurante();
				janela.setVisible(true);
			}
		});
		btnRestaurante.setIcon(new ImageIcon(Menu.class.getResource("/imagens/cardapio.png")));
		btnRestaurante.setBounds(34, 112, 65, 65);
		contentPane.add(btnRestaurante);
		btnRestaurante.setBorder(new EmptyBorder(0,0,0,0));
		btnRestaurante.setBackground(new Color(34, 24, 28));
		
		JButton btnCalculadora = new JButton("");
		btnCalculadora.setIcon(new ImageIcon(Menu.class.getResource("/imagens/maths.png")));
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora janela = new calculadora();
				janela.setVisible(true);
			}
		});
		btnCalculadora.setBounds(34, 26, 65, 65);
		btnCalculadora.setBackground(new Color(34, 24, 28));
		contentPane.add(btnCalculadora);
		btnCalculadora.setBorder(new EmptyBorder(0,0,0,0));
	}
}

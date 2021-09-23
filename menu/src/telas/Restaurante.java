package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurante extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;
	private JTextField txtCouver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurante frame = new Restaurante();
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
	public Restaurante() {
		setTitle("Restaurante");
		setResizable(false);
		setUndecorated(true);
		setBackground(new Color(34, 24, 28));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 160, 347, 363);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(34, 24, 28));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(166, 58, 80));
		panel.setBounds(10, 11, 315, 140);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Consumo Total");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 152, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblCouverArtistico = new JLabel("Couver Artistico");
		lblCouverArtistico.setForeground(Color.WHITE);
		lblCouverArtistico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCouverArtistico.setBounds(10, 48, 152, 14);
		panel.add(lblCouverArtistico);
		
		JLabel lblDividirContaPor = new JLabel("Dividir conta por?");
		lblDividirContaPor.setForeground(Color.WHITE);
		lblDividirContaPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDividirContaPor.setBounds(10, 81, 152, 14);
		panel.add(lblDividirContaPor);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTotal.setBounds(172, 8, 133, 20);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		JSpinner spDividir = new JSpinner();
		spDividir.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spDividir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spDividir.setBounds(172, 78, 133, 20);
		panel.add(spDividir);
		
		JLabel lblPagarDa = new JLabel("Pagar 10% da Mesa");
		lblPagarDa.setForeground(Color.WHITE);
		lblPagarDa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPagarDa.setBounds(10, 119, 152, 14);
		panel.add(lblPagarDa);
			
		JRadioButton rdSim = new JRadioButton("Sim");
		rdSim.setBackground(new Color(166, 58, 80));
		rdSim.setSelected(true);
		rdSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdSim.setBounds(172, 115, 57, 23);
		panel.add(rdSim);
		
		JRadioButton rdNao = new JRadioButton("N\u00E3o");
		rdNao.setBackground(new Color(166, 58, 80));
		rdNao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdNao.setBounds(248, 115, 57, 23);
		panel.add(rdNao);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdSim);
		grupo.add(rdNao);
		
		txtCouver = new JTextField();
		txtCouver.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCouver.setEnabled(false);
		txtCouver.setText("R$ 5,00");
		txtCouver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCouver.setColumns(10);
		txtCouver.setBounds(172, 45, 133, 20);
		panel.add(txtCouver);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(166, 58, 80));
		panel_1.setBounds(10, 162, 315, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Taxa de Servi\u00E7o (10%)");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 11, 149, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setForeground(Color.WHITE);
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorTotal.setBounds(10, 48, 149, 14);
		panel_1.add(lblValorTotal);
		
		JLabel lblValorPorPessoa = new JLabel("Valor Por Pessoa");
		lblValorPorPessoa.setForeground(Color.WHITE);
		lblValorPorPessoa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorPorPessoa.setBounds(10, 84, 149, 14);
		panel_1.add(lblValorPorPessoa);
		
		JLabel lblTaxa = new JLabel("R$ 0,00");
		lblTaxa.setForeground(Color.GRAY);
		lblTaxa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTaxa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTaxa.setBounds(200, 12, 105, 14);
		panel_1.add(lblTaxa);
		
		JLabel lblTotal = new JLabel("R$ 0,00");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setForeground(Color.GRAY);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(200, 49, 105, 14);
		panel_1.add(lblTotal);
		
		JLabel lblDividir = new JLabel("R$ 0,00");
		lblDividir.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDividir.setForeground(Color.GRAY);
		lblDividir.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDividir.setBounds(200, 85, 105, 14);
		panel_1.add(lblDividir);
		
		JButton btnFechar = new JButton("");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fechar Somente a Tela
				Restaurante.this.dispose();
			}
			
			
		});
		btnFechar.setIcon(new ImageIcon(Salario.class.getResource("/imagens/fechar (2).png")));
		btnFechar.setBorder(new EmptyBorder(0,0,0,0));
		btnFechar.setBackground(new Color(34, 24, 28));
		btnFechar.setBounds(10, 281, 63, 32);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotal.setText("");
				spDividir.setValue(1);
				rdSim.setSelected(true);
				lblTaxa.setText("R$ 0,00");
				lblTotal.setText("R$ 0,00");
				lblDividir.setText("R$ 0,00");
			}
			
		});
		btnLimpar.setIcon(new ImageIcon(Salario.class.getResource("/imagens/limpeza-de-casa.png")));
		btnLimpar.setBorder(new EmptyBorder(0,0,0,0));
		btnLimpar.setBackground(new Color(34, 24, 28));
		
		btnLimpar.setBounds(135, 281, 63, 32);
		contentPane.add(btnLimpar);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double consumido = Double.parseDouble(txtTotal.getText());
				//JOptionPane.showMessageDialog(null, total);
				double taxa = consumido *0.1; 
				//Calcular Taxa 
				lblTaxa.setText(String.format("R$ %.2f", taxa));
				
				double total= 0; 
				//Calcular Total com e sem Serviço 
				if (rdSim.isSelected()) {
					total = consumido + taxa + 5; 
				}else {
					total = consumido + 5; 
				}
				lblTotal.setText(String.format("R$ %.2f", total));

				//Calcular Divisão
				int dividir = Integer.parseInt(spDividir.getValue().toString());
				double divisao = total / dividir;
				lblDividir.setText(String.format("R$ %.2f", divisao));

			}
			
		});
		btnCalcular.setIcon(new ImageIcon(Salario.class.getResource("/imagens/cursor (2).png")));
		btnCalcular.setBorder(new EmptyBorder(0,0,0,0));
		btnCalcular.setBackground(new Color(34, 24, 28));
		btnCalcular.setBounds(262, 281, 63, 32);
		contentPane.add(btnCalcular);
		
	
	}
}

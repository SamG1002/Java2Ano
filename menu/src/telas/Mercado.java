package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Mercado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mercado frame = new Mercado();
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
	public Mercado() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 350, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(34, 24, 28));
		contentPane.setLayout(null);
		JLabel bl = new JLabel("Valor Total");
		bl.setForeground(Color.WHITE);
		bl.setHorizontalAlignment(SwingConstants.CENTER);
		bl.setFont(new Font("Arial", Font.BOLD, 25));
		bl.setBounds(78, 0, 196, 41);
		contentPane.add(bl);
		
		JLabel txtTotal = new JLabel("R$ 00.00");
		txtTotal.setForeground(new Color(166, 58, 80));
		txtTotal.setFont(new Font("Arial", Font.BOLD, 22));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setBounds(49, 41, 250, 26);
		contentPane.add(txtTotal);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 78, 324, 164);
		contentPane.add(panel);
		panel.setBackground(new Color(166, 58, 80));
		panel.setLayout(null);
		
		JCheckBox chQueijo = new JCheckBox("Queijo (9.50)");
		chQueijo.setForeground(Color.WHITE);
		chQueijo.setHorizontalAlignment(SwingConstants.LEFT);
		chQueijo.setFont(new Font("Arial", Font.ITALIC, 11));
		chQueijo.setBounds(109, 106, 101, 23);
		panel.add(chQueijo);
		chQueijo.setOpaque(false);
		
		JCheckBox chCereal = new JCheckBox("Cereal (13.90)");
		chCereal.setForeground(Color.WHITE);
		chCereal.setHorizontalAlignment(SwingConstants.LEFT);
		chCereal.setFont(new Font("Arial", Font.ITALIC, 11));
		chCereal.setBounds(109, 73, 101, 23);
		panel.add(chCereal);
		chCereal.setOpaque(false);
		
		JCheckBox chFarinha = new JCheckBox("Farinha (3.60)");
		chFarinha.setForeground(Color.WHITE);
		chFarinha.setHorizontalAlignment(SwingConstants.LEFT);
		chFarinha.setFont(new Font("Arial", Font.ITALIC, 11));
		chFarinha.setBounds(109, 38, 101, 23);
		panel.add(chFarinha);
		chFarinha.setOpaque(false);
		
		JCheckBox chAzeite = new JCheckBox("Azeite (13.80)");
		chAzeite.setForeground(Color.WHITE);
		chAzeite.setHorizontalAlignment(SwingConstants.LEFT);
		chAzeite.setFont(new Font("Arial", Font.ITALIC, 11));
		chAzeite.setBounds(109, 7, 101, 23);
		panel.add(chAzeite);
		chAzeite.setOpaque(false);
		
		JCheckBox chArroz = new JCheckBox("Arroz (18.50)");
		chArroz.setForeground(Color.WHITE);
		chArroz.setHorizontalAlignment(SwingConstants.LEFT);
		chArroz.setFont(new Font("Arial", Font.ITALIC, 11));
		chArroz.setBounds(6, 7, 101, 23);
		panel.add(chArroz);
		chArroz.setOpaque(false);
		
		JCheckBox chFeijao = new JCheckBox("Feijao (8.90)");
		chFeijao.setForeground(Color.WHITE);
		chFeijao.setHorizontalAlignment(SwingConstants.LEFT);
		chFeijao.setFont(new Font("Arial", Font.ITALIC, 11));
		chFeijao.setBounds(6, 38, 101, 23);
		panel.add(chFeijao);
		chFeijao.setOpaque(false);
		
		JCheckBox chAcucar = new JCheckBox("A\u00E7ucar (3.40)");
		chAcucar.setForeground(Color.WHITE);
		chAcucar.setHorizontalAlignment(SwingConstants.LEFT);
		chAcucar.setFont(new Font("Arial", Font.ITALIC, 11));
		chAcucar.setBounds(6, 73, 101, 23);
		panel.add(chAcucar);
		chAcucar.setOpaque(false);
		
		JCheckBox chCafe = new JCheckBox("Cafe (9.80)");
		chCafe.setForeground(Color.WHITE);
		chCafe.setHorizontalAlignment(SwingConstants.LEFT);
		chCafe.setFont(new Font("Arial", Font.ITALIC, 11));
		chCafe.setBounds(6, 106, 101, 23);
		panel.add(chCafe);
		chCafe.setOpaque(false);
		
		JCheckBox chSal = new JCheckBox("Sal (1.90)");
		chSal.setForeground(Color.WHITE);
		chSal.setHorizontalAlignment(SwingConstants.LEFT);
		chSal.setFont(new Font("Arial", Font.ITALIC, 11));
		chSal.setBounds(217, 7, 101, 23);
		panel.add(chSal);
		chSal.setOpaque(false);
		
		JCheckBox chGelatina = new JCheckBox("Gelatina (0.90)");
		chGelatina.setForeground(Color.WHITE);
		chGelatina.setHorizontalAlignment(SwingConstants.LEFT);
		chGelatina.setFont(new Font("Arial", Font.ITALIC, 11));
		chGelatina.setBounds(217, 38, 101, 23);
		panel.add(chGelatina);
		chGelatina.setOpaque(false);
		
		JCheckBox chBatata = new JCheckBox("Batata (6.60)");
		chBatata.setForeground(Color.WHITE);
		chBatata.setHorizontalAlignment(SwingConstants.LEFT);
		chBatata.setFont(new Font("Arial", Font.ITALIC, 11));
		chBatata.setBounds(217, 73, 101, 23);
		panel.add(chBatata);
		chBatata.setOpaque(false);
		
		JCheckBox chTempero = new JCheckBox("Tempero(1.50)");
		chTempero.setForeground(Color.WHITE);
		chTempero.setHorizontalAlignment(SwingConstants.LEFT);
		chTempero.setFont(new Font("Arial", Font.ITALIC, 11));
		chTempero.setBounds(217, 106, 101, 23);
		panel.add(chTempero);
		chTempero.setOpaque(false);
		
		JCheckBox chBiscoito = new JCheckBox("Biscoito (3.60)");
		chBiscoito.setOpaque(false);
		chBiscoito.setHorizontalAlignment(SwingConstants.LEFT);
		chBiscoito.setForeground(Color.WHITE);
		chBiscoito.setFont(new Font("Arial", Font.ITALIC, 11));
		chBiscoito.setBounds(6, 134, 101, 23);
		panel.add(chBiscoito);
		
		JCheckBox chHeinz = new JCheckBox("Heinz (6.30)");
		chHeinz.setOpaque(false);
		chHeinz.setHorizontalAlignment(SwingConstants.LEFT);
		chHeinz.setForeground(Color.WHITE);
		chHeinz.setFont(new Font("Arial", Font.ITALIC, 11));
		chHeinz.setBounds(109, 132, 101, 23);
		panel.add(chHeinz);
		
		JCheckBox chMiojo = new JCheckBox("Miojo (1.50)");
		chMiojo.setOpaque(false);
		chMiojo.setHorizontalAlignment(SwingConstants.LEFT);
		chMiojo.setForeground(Color.WHITE);
		chMiojo.setFont(new Font("Arial", Font.ITALIC, 11));
		chMiojo.setBounds(217, 132, 101, 23);
		panel.add(chMiojo);
		

		JCheckBox ch[] = {
						chArroz, chFeijao, chAcucar, chCafe, chBiscoito, chAzeite, 
						chFarinha, chCereal, chQueijo, chHeinz, chSal, chGelatina, chBatata,
						chTempero, chMiojo 
				};
		double precos[] = {
				18.50, 8.90, 3.40, 9.80, 3.60, 13.80, 3.60, 
				13.90, 9.50, 6.30, 1.90, 0.90, 6.60, 1.50, 1.50
		};
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorTotal = 0;
				for(int i = 0; i < ch.length; i++) {
					if(ch[i].isSelected()) {
						valorTotal += precos[i];
					}
				}
				txtTotal.setText("R$ " + String.format("%.2f",valorTotal));
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Salario.class.getResource("/imagens/cursor (2).png")));
		btnCalcular.setBorder(new EmptyBorder(0,0,0,0));
		btnCalcular.setBackground(new Color(34, 24, 28));
		btnCalcular.setBounds(152, 253, 48, 32);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fechar Somente a Tela
				Mercado.this.dispose();
			}
			
		});
		btnFechar.setIcon(new ImageIcon(Salario.class.getResource("/imagens/fechar (2).png")));
		btnFechar.setBorder(new EmptyBorder(0,0,0,0));
		btnFechar.setBackground(new Color(34, 24, 28));
		btnFechar.setBounds(51, 253, 48, 32);
		contentPane.add(btnFechar);
		
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double valorTotal = 0;
				for(int i = 0; i < ch.length; i++) {
					ch[i].setSelected(false);
					txtTotal.setText("R$ 00.00");
				}
				
			}
		});
		btnLimpar.setSize(48, 32);
		btnLimpar.setLocation(251, 253);
		contentPane.add(btnLimpar);
		btnLimpar.setIcon(new ImageIcon(Salario.class.getResource("/imagens/limpeza-de-casa.png")));
		btnLimpar.setBorder(new EmptyBorder(0,0,0,0));
		btnLimpar.setBackground(new Color(34, 24, 28));
	}
}

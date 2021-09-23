import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.Math;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class CalcOperation extends JFrame{
	
	private JPanel container;
	public double numero;
	private JLabel lbResposta;
	private JButton btnQuadrado, btnCubica, btnElevadoCubica, btnNumeroAbsoluto, btnResto, btnNumero;
	
	public CalcOperation() {
		screen();
		iniciarComponentes();
		eventos();
	}
	private void screen() {
		container = new JPanel();
		container.setLayout(null);
		container.setBackground(Color.darkGray);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora dos irmãos");
		setBounds(0, 0, 312, 300);
		setLocationRelativeTo(null);
		setContentPane(container);
	}

	private void iniciarComponentes() {
		
		lbResposta = new JLabel("Resposta");
		btnQuadrado = new JButton("Quadrada"); btnCubica = new JButton("Cubica");
		btnElevadoCubica = new JButton("Elevação"); btnNumeroAbsoluto = new JButton("Absoluto");
		btnResto= new JButton("Resto");btnNumero = new JButton("Numero"); 
		
		//barrinha de resposta
		lbResposta.setBounds(3, 3, 289, 40);
		lbResposta.setBorder(BorderFactory.createLineBorder(new Color(37, 38, 36), 2));
		Border border = lbResposta.getBorder();
		Border margin = new EmptyBorder(10, 10, 10, 100);
		lbResposta.setBorder(new CompoundBorder(border, margin));
		lbResposta.setForeground(Color.white);
		
		//botoes
		btnQuadrado.setBounds(3, 152, 95, 90); btnCubica.setBounds(101, 152, 95, 90);
		btnElevadoCubica.setBounds(199, 152, 95, 90); btnNumeroAbsoluto.setBounds(101, 50, 95, 90);
		btnResto.setBounds(3, 50, 95, 90); btnNumero.setBounds(199, 50, 95, 90);
		
		//design
		ButtonsDesign(btnQuadrado); ButtonsDesign(btnCubica);
		ButtonsDesign(btnElevadoCubica); ButtonsDesign(btnNumeroAbsoluto);
		ButtonsDesign(btnResto);ButtonsDesign(btnNumero);
		
		
		add(lbResposta);
		add(btnQuadrado); add(btnCubica);
		add(btnElevadoCubica); add(btnNumeroAbsoluto);
		add(btnResto);add(btnNumero);
		
		peticao();
	}
	private void eventos() {
		
		btnQuadrado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String result = String.format("%.2f", quadrado(numero));
                lbResposta.setText(result);
			}	
		});
		
		btnCubica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String result = String.format("%.2f", cubica(numero));
                lbResposta.setText(result);
			}	
		});
		
		btnElevadoCubica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				elevadoCubica(numero);
				String result = String.format("%.2f", elevadoCubica(numero));
                lbResposta.setText(result);
			}	
		});
		
		btnNumeroAbsoluto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String result = String.format("%.2f", numeroAbsoluto(numero));
                lbResposta.setText(result);
			}	
		});
		
		btnResto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = String.format("%.2f", resto(numero));
                lbResposta.setText(result);
			}	
		});
	
		btnNumero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				peticao();
			}	
		});
}
	
	
	private void ButtonsDesign(JButton btn) {
		btn.setBackground(new Color(37, 38, 36));
		btn.setForeground(Color.white);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(44, 44, 44));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(new Color(38, 38, 38));
	        }
		});
	}
	
	public double quadrado(double numero){
		return Math.sqrt(numero);
	}
	public double cubica(double numero){
		return Math.cbrt(numero);
	}
	public double resto(double numero){
		return numero % 2;
	}
	public double elevadoCubica(double numero){
		return Math.pow(numero,3);
	}
	public double numeroAbsoluto(double numero){
		return Math.abs(numero);
	}
	public void setNumero(double num){
		this.numero = num;
	}
	public double getNumero(){
		return this.numero;
	}
	public void peticao() {
		String resp = JOptionPane.showInputDialog(null, " Entre com um Valor: ");
		if(resp == null) {
			resp = "1";
		}
		double n = Double.parseDouble(resp);
		if(n <= 0) {
			setNumero(0);
		}else {
			setNumero(n);
		}
	}
}

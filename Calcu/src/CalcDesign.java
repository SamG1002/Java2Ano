import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CalcDesign {
	public double numero;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcDesign window = new CalcDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 225, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira um valor");
		lblNewLabel.setBounds(23, 26, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spNumero = new JSpinner();
		spNumero.setModel(new SpinnerNumberModel(0, -50, 100, 1));
		spNumero.setBounds(23, 51, 71, 20);
		frame.getContentPane().add(spNumero);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 94, 168, 156);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Resto divisao");
		lblNewLabel_1.setBounds(10, 11, 64, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblRaizQuadrada = new JLabel("Raiz Quadrada");
		lblRaizQuadrada.setBounds(10, 36, 79, 14);
		panel.add(lblRaizQuadrada);
		
		JLabel lblRaizCubica = new JLabel("Raiz Cubica");
		lblRaizCubica.setBounds(10, 61, 79, 14);
		panel.add(lblRaizCubica);
		
		JLabel lblElevadoA = new JLabel("Elevado a 3");
		lblElevadoA.setBounds(10, 86, 79, 14);
		panel.add(lblElevadoA);
		
		JLabel lblNumeroAbsoluto = new JLabel("Numero Absoluto");
		lblNumeroAbsoluto.setBounds(10, 111, 90, 14);
		panel.add(lblNumeroAbsoluto);
		
		JLabel lbResto = new JLabel("0");
		lbResto.setForeground(Color.CYAN);
		lbResto.setHorizontalAlignment(SwingConstants.CENTER);
		lbResto.setBounds(112, 11, 46, 14);
		panel.add(lbResto);
		
		JLabel lbQuadrada = new JLabel("0");
		lbQuadrada.setForeground(Color.CYAN);
		lbQuadrada.setHorizontalAlignment(SwingConstants.CENTER);
		lbQuadrada.setBounds(112, 36, 46, 14);
		panel.add(lbQuadrada);
		
		JLabel lbElevado = new JLabel("0");
		lbElevado.setForeground(Color.CYAN);
		lbElevado.setHorizontalAlignment(SwingConstants.CENTER);
		lbElevado.setBounds(112, 86, 46, 14);
		panel.add(lbElevado);
		
		JLabel lbCubica = new JLabel("0");
		lbCubica.setForeground(Color.CYAN);
		lbCubica.setHorizontalAlignment(SwingConstants.CENTER);
		lbCubica.setBounds(112, 61, 46, 14);
		panel.add(lbCubica);
		
		JLabel lbAbsoluto = new JLabel("0");
		lbAbsoluto.setForeground(Color.CYAN);
		lbAbsoluto.setHorizontalAlignment(SwingConstants.CENTER);
		lbAbsoluto.setBounds(112, 111, 46, 14);
		panel.add(lbAbsoluto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(102, 50, 89, 23);
		frame.getContentPane().add(btnCalcular);
		
		panel.setVisible(false);
		
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
				numero = Double.parseDouble(spNumero.getValue().toString());
				String result = String.format("%.2f", quadrado(numero));
				lbQuadrada.setText(result);
				
				numero = Double.parseDouble(spNumero.getValue().toString());
				result = String.format("%.2f", resto(numero));
				lbResto.setText(result);
				
				numero = Double.parseDouble(spNumero.getValue().toString());
				result = String.format("%.2f", cubica(numero));
				lbCubica.setText(result);
				
				numero = Double.parseDouble(spNumero.getValue().toString());
				result = String.format("%.0f", elevadoCubica(numero));
				lbElevado.setText(result);
				
				numero = Double.parseDouble(spNumero.getValue().toString());
				result = String.format("%.2f", numeroAbsoluto(numero));
				lbAbsoluto.setText(result);
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
		
		
	
}

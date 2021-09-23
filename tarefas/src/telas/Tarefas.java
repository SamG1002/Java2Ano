package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.Format;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarefas extends JFrame {

	private JPanel contentPane;
	private JTextField txtTarefa;
	private JTextField txtData;
	private GregorianCalendar data=new GregorianCalendar();
	private DefaultListModel listFazer = new DefaultListModel();
	private DefaultListModel listFeito = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarefas frame = new Tarefas();
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
	public Tarefas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel cadastrar = new JPanel();
		cadastrar.setBounds(400, 0, 392, 411);
		cadastrar.setBackground(new Color(51,51,51));
		contentPane.add(cadastrar);
		cadastrar.setLayout(null);
		
		txtTarefa = new JTextField();
		txtTarefa.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTarefa.setForeground(Color.LIGHT_GRAY);
		txtTarefa.setBounds(100, 65, 200, 25);
		cadastrar.add(txtTarefa);
		txtTarefa.setColumns(10);
		txtTarefa.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtTarefa.setBackground(cadastrar.getBackground());
		
		txtData = new JTextField();
		txtData=new JFormattedTextField(DateFormat.getDateInstance(DateFormat.MEDIUM));
		txtData.setText(data.get(Calendar.DAY_OF_MONTH)+"/"+(data.get(Calendar.MONTH)+1)+"/"+(data.get(Calendar.YEAR)));
		txtData.setColumns(6);
		txtData.setForeground(Color.LIGHT_GRAY);
		txtData.setFont(new Font("Arial", Font.PLAIN, 15));
		txtData.setColumns(10);
		txtData.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtData.setBackground(new Color(51, 51, 51));
		txtData.setBounds(100, 140, 200, 25);
		cadastrar.add(txtData);
		
		JComboBox cbxCategoria = new JComboBox();
		cbxCategoria.setForeground(Color.BLACK);
		cbxCategoria.setBorder(null);
		cbxCategoria.setBounds(100, 215, 200, 25);
		cbxCategoria.setBackground(new Color(102, 204, 204));
		cadastrar.add(cbxCategoria);
		//add item
		cbxCategoria.addItem("Escola");
		cbxCategoria.addItem("Trabalho");
		cbxCategoria.addItem("Casa");
		cbxCategoria.addItem("Outros");
		
		JButton btnLimpar = new JButton("Limpar");
		
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBounds(100, 304, 200, 25);
		btnLimpar.setBackground(cadastrar.getBackground());
		btnLimpar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		
		cadastrar.add(btnLimpar);
		
		JButton btnAdd = new JButton("Adicionar Tarefa");
		
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnAdd.setBackground(new Color(51, 51, 51));
		btnAdd.setBounds(100, 265, 200, 25);
		cadastrar.add(btnAdd);
		
		JButton button = new JButton("Refazer");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.PLAIN, 15));
		button.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		button.setBackground(new Color(51, 51, 51));
		button.setBounds(-44, 287, 32, 25);
		cadastrar.add(button);
		
		JButton button_1 = new JButton("Refazer");
		button_1.setBounds(-42, 300, 32, 32);
		cadastrar.add(button_1);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.PLAIN, 15));
		button_1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		button_1.setBackground(new Color(51, 51, 51));
		
		JLabel lblNewLabel = new JLabel("Digite a Tarefa");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(100, 35, 140, 25);
		cadastrar.add(lblNewLabel);
		
		JLabel label = new JLabel("Digite a Tarefa");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		label.setBounds(100, 110, 140, 25);
		cadastrar.add(label);
		
		JLabel label_1 = new JLabel("Digite a Tarefa");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		label_1.setBounds(100, 185, 140, 25);
		cadastrar.add(label_1);
		
		JPanel resultado = new JPanel();
		resultado.setBackground(new Color(102, 204, 204));
		resultado.setBounds(0, 0, 400, 411);
		contentPane.add(resultado);
		resultado.setLayout(null);
		resultado.setVisible(false);
		
		JPanel pnlFazer = new JPanel();
		pnlFazer.setForeground(Color.WHITE);
		pnlFazer.setBackground(cadastrar.getBackground());
		pnlFazer.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Fazer", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		pnlFazer.setBounds(50, 5, 300, 180);
		resultado.add(pnlFazer);
		pnlFazer.setLayout(null);
		
		JList listarFazer = new JList();
		listarFazer.setBounds(10, 25, 280, 133);
		pnlFazer.add(listarFazer);
		listarFazer.setModel(listFazer);
		
		
		JPanel pnlFeito = new JPanel();
		pnlFeito.setForeground(Color.WHITE);
		pnlFeito.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Feito", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlFeito.setBackground(cadastrar.getBackground());
		pnlFeito.setBounds(50, 220, 300, 180);
		resultado.add(pnlFeito);
		pnlFeito.setLayout(null);
		
		JList listarFeito = new JList();
		listarFeito.setBounds(10, 25, 280, 133);
		pnlFeito.add(listarFeito);
		listarFeito.setModel(listFeito);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setForeground(Color.WHITE);
		btnConcluir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnConcluir.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(51, 51, 51)));
		btnConcluir.setBackground(resultado.getBackground());
		btnConcluir.setBounds(50, 189, 94, 25);
		resultado.add(btnConcluir);
		
		JButton btnRefazer = new JButton("Refazer");
		btnRefazer.setForeground(Color.WHITE);
		btnRefazer.setFont(new Font("Arial", Font.PLAIN, 15));
		btnRefazer.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(51, 51, 51)));
		btnRefazer.setBackground(resultado.getBackground());
		btnRefazer.setBounds(256, 189, 94, 25);
		resultado.add(btnRefazer);
		
		JButton btnLimpFazer = new JButton("");
		btnLimpFazer.setIcon(new ImageIcon(Tarefas.class.getResource("/imagens/fechar (2).png")));
		btnLimpFazer.setForeground(Color.WHITE);
		btnLimpFazer.setFont(new Font("Arial", Font.PLAIN, 15));
		btnLimpFazer.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnLimpFazer.setBackground(resultado.getBackground());
		btnLimpFazer.setBounds(10, 90, 35, 30);
		resultado.add(btnLimpFazer);
		
		JButton btnLimpFeito = new JButton("");
		btnLimpFeito.setIcon(new ImageIcon(Tarefas.class.getResource("/imagens/fechar (2).png")));
		btnLimpFeito.setForeground(Color.WHITE);
		btnLimpFeito.setFont(new Font("Arial", Font.PLAIN, 15));
		btnLimpFeito.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnLimpFeito.setBackground(resultado.getBackground());
		btnLimpFeito.setBounds(10, 310, 35, 30);
		resultado.add(btnLimpFeito);
		btnLimpFeito.setBackground(resultado.getBackground());
		
		JPanel pnlSafe = new JPanel();
		pnlSafe.setBounds(0, 0, 400, 411);
		pnlSafe.setBackground(resultado.getBackground());
		contentPane.add(pnlSafe);
		
		JLabel lblIconTop = new JLabel("");
		lblIconTop.setIcon(new ImageIcon(Tarefas.class.getResource("/imagens/toptop.png")));
		lblIconTop.setBounds(100, 100, 300, 411);
		pnlSafe.add(lblIconTop);
		
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tarefa = "    "+txtTarefa.getText() + "   |   " + cbxCategoria.getSelectedItem().toString() + " para : "+ txtData.getText();
				listFazer.addElement(tarefa);
				txtTarefa.requestFocus();
				listarFazer.setForeground(new Color(102, 204, 204));
				resultado.setVisible(true);
				pnlSafe.setVisible(false);
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTarefa.setText("");
				txtData.setText(data.get(Calendar.DAY_OF_MONTH)+"/"+(data.get(Calendar.MONTH)+1)+"/"+(data.get(Calendar.YEAR)));
				cbxCategoria.setSelectedIndex(0);
			}
		});
		
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listFeito.addElement(listarFazer.getSelectedValue());
				listarFeito.setForeground(new Color(102, 204, 204));
				int indice = listarFazer.getSelectedIndex();
				if(indice != -1) {
					listFazer.remove(indice);
				}
			}
		});
		
		btnRefazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listFazer.addElement(listarFeito.getSelectedValue());
				int indice = listarFeito.getSelectedIndex();
				if(indice != -1) {
					listFeito.remove(indice);
				}
			}
		});
		
		btnLimpFazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listFazer.removeAllElements();
				if(listFeito.getSize() == 0 ) {
					pnlSafe.setVisible(true);
					resultado.setVisible(false);
				}
			}
		});
		
		btnLimpFeito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listFeito.removeAllElements();
				if(listFazer.getSize() == 0 ) {
					pnlSafe.setVisible(true);
					resultado.setVisible(false);
				}
			}
		});
	}
}

package Telas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import App.Conexao;
import App.Livro;
import App.LivroDAO;

import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

public class Principal extends JFrame {

	//layout
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtPag;
	private GregorianCalendar data=new GregorianCalendar();
	private JTextField txtCpf;
	private JTextField txtEnd;
	private JTextField txtDiaMes;
	private JTable table;
	
	//tabela
	DefaultTableModel modeloTabela = new DefaultTableModel();
	private DefaultListModel listFazer = new DefaultListModel();
	private DefaultListModel listFeito = new DefaultListModel();
	
	//banco de dados
	LivroDAO LDAO = new LivroDAO();
	Livro l;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
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
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 15));
		txtNome.setForeground(Color.LIGHT_GRAY);
		txtNome.setBounds(72, 57, 270, 25);
		cadastrar.add(txtNome);
		txtNome.setColumns(10);
		txtNome.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtNome.setBackground(cadastrar.getBackground());
		
		txtData = new JTextField();
		
		txtPag = new JTextField();
		
		JButton btnAdd = new JButton("Adicionar");
		
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBounds(250, 375, 100, 25);
		btnAdd.setBackground(cadastrar.getBackground());
		btnAdd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		
		cadastrar.add(btnAdd);
		
		JButton btnExcluir = new JButton("Excluir");
		
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnExcluir.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnExcluir.setBackground(new Color(51, 51, 51));
		btnExcluir.setBounds(250, 351, 100, 25);
		cadastrar.add(btnExcluir);
		
		JLabel lblNewLabel = new JLabel("Nome Cliente");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(72, 27, 140, 25);
		cadastrar.add(lblNewLabel);
		
		JLabel lblAno = new JLabel("Endereco");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Arial", Font.BOLD, 15));
		lblAno.setBounds(72, 166, 100, 25);
		cadastrar.add(lblAno);
		
		JLabel lblPaginas = new JLabel("DIa/Mes");
		lblPaginas.setForeground(Color.WHITE);
		lblPaginas.setFont(new Font("Arial", Font.BOLD, 15));
		lblPaginas.setBounds(250, 166, 77, 25);
		cadastrar.add(lblPaginas);
		
		txtCpf = new JTextField();
		txtCpf.setForeground(Color.LIGHT_GRAY);
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 15));
		txtCpf.setColumns(10);
		txtCpf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtCpf.setBackground(new Color(51, 51, 51));
		txtCpf.setBounds(72, 130, 270, 25);
		cadastrar.add(txtCpf);
		
		JLabel lblAutor = new JLabel("CPF");
		lblAutor.setForeground(Color.WHITE);
		lblAutor.setFont(new Font("Arial", Font.BOLD, 15));
		lblAutor.setBounds(72, 100, 140, 25);
		cadastrar.add(lblAutor);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAlterar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnAlterar.setBackground(new Color(51, 51, 51));
		btnAlterar.setBounds(250, 325, 100, 25);
		cadastrar.add(btnAlterar);
		
		txtEnd = new JTextField();
		txtEnd.setForeground(Color.LIGHT_GRAY);
		txtEnd.setFont(new Font("Arial", Font.PLAIN, 15));
		txtEnd.setColumns(10);
		txtEnd.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtEnd.setBackground(new Color(51, 51, 51));
		txtEnd.setBounds(72, 202, 165, 25);
		cadastrar.add(txtEnd);
		
		txtDiaMes = new JTextField();
		txtDiaMes.setForeground(Color.LIGHT_GRAY);
		txtDiaMes.setFont(new Font("Arial", Font.PLAIN, 15));
		txtDiaMes.setColumns(10);
		txtDiaMes.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtDiaMes.setBackground(new Color(51, 51, 51));
		txtDiaMes.setBounds(250, 202, 90, 25);
		cadastrar.add(txtDiaMes);
		
		JComboBox cmbCompras = new JComboBox();
		cmbCompras.setBounds(250, 280, 100, 20);
		cadastrar.add(cmbCompras);
		
		txtTelefone = new JTextField();
		txtTelefone.setForeground(Color.LIGHT_GRAY);
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtTelefone.setBackground(new Color(51, 51, 51));
		txtTelefone.setBounds(72, 271, 170, 25);
		cadastrar.add(txtTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 15));
		lblTelefone.setBounds(72, 242, 140, 25);
		cadastrar.add(lblTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.LIGHT_GRAY);
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtEmail.setBackground(new Color(51, 51, 51));
		txtEmail.setBounds(72, 340, 170, 25);
		cadastrar.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 15));
		lblEmail.setBounds(72, 311, 140, 25);
		cadastrar.add(lblEmail);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setBounds(250, 245, 100, 20);
		cadastrar.add(cmbSexo);
		
		JPanel resultado = new JPanel();
		resultado.setBackground(new Color(102, 204, 204));
		resultado.setBounds(0, 0, 400, 411);
		contentPane.add(resultado);
		resultado.setLayout(null);
		resultado.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 18, 365, 370);
		resultado.add(scrollPane);
		
		
		
		
		//modelo
		modeloTabela.addColumn("Id");
		modeloTabela.addColumn("Titulo");
		modeloTabela.addColumn("Autor");
		modeloTabela.addColumn("Ano");
		modeloTabela.addColumn("Pagina");
		
		

		table = new JTable(modeloTabela);
		
		UIManager.getDefaults().put("TableHeader.cellBorder", BorderFactory.createEmptyBorder(0, 0, 0, 0));
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.setFillsViewportHeight(true);
		table.setGridColor(new Color(51, 51, 51));
		table.setBackground(Color.darkGray);
		table.setForeground(Color.LIGHT_GRAY);
		
		table.getTableHeader().setBackground(new Color(51, 51, 51));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.BOLD, 14));
		
		int sizes[] = new int[] {3, 100, 70, 5, 5};
		
		for(int i = 0; i < 5; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			table.getColumnModel().getColumn(i).setPreferredWidth(sizes[i]);
		}
		
		JTableHeader header = table.getTableHeader();
		header.setPreferredSize(new Dimension(0, 40));
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				if(i > -1) {
				txtNome.setText(modeloTabela.getValueAt(i, 1).toString());
				txtCpf.setText(modeloTabela.getValueAt(i, 2).toString());
				txtEnd.setText(modeloTabela.getValueAt(i, 3).toString());
				txtDiaMes.setText(modeloTabela.getValueAt(i, 4).toString());
				txtData.setText(modeloTabela.getValueAt(i, 5).toString());
				txtPag.setText(modeloTabela.getValueAt(i, 6).toString());
				txtTelefone.setText(modeloTabela.getValueAt(i, 7).toString());
				txtEmail.setText(modeloTabela.getValueAt(i, 8).toString());
				}else {
					
					JOptionPane.showMessageDialog(null, "Tem parada errada ai irmao!");
				}
			}
		});
		
		scrollPane.setViewportView(table);
		try {
			selectLivros();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnAlterar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(null, 
				        "Deseja mesmo modificar o Livro " + table.getValueAt(table.getSelectedRow(), 1),
				        "Mudanças traz incerteza",
				        JOptionPane.OK_CANCEL_OPTION
			        );
			
				if(resposta == JOptionPane.YES_OPTION) {
				if(		txtNome.getText().isEmpty() 
						&& txtCpf.getText().isEmpty() 
						&& txtEnd.getText().isEmpty() 
						&& txtDiaMes.getText().isEmpty()) {
				
					JOptionPane.showMessageDialog(null, "Faz Favor e preenche o baguio direito po");
					
				}else {
				
					
				int i = table.getSelectedRow();
				int id = (int) modeloTabela.getValueAt(i, 0);
				l  = new Livro(
						id,
						txtNome.getText(),
						txtCpf.getText(), 
						Integer.parseInt(txtEnd.getText()), 
						Integer.parseInt(txtDiaMes.getText())
						);
				
				
				LDAO.update(l);
				
				try {
					selectLivros();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			}
		});
		
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, 
				        "Tem certeza que quer Deletar o Livro " + table.getValueAt(table.getSelectedRow(), 1),
				        "Excluir mesmo irmao?",
				        JOptionPane.OK_CANCEL_OPTION
			        );
			
			if(resposta == JOptionPane.YES_OPTION) {
				
				if(table.getSelectedRow() > -1) {
				int id = (int) modeloTabela.getValueAt(table.getSelectedRow(), 0);
				LDAO.delete(id);
				try {
					selectLivros();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				limpar();
				
				
				}
			}
				
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(		txtNome.getText().isEmpty() 
						&& txtCpf.getText().isEmpty() 
						&& txtEnd.getText().isEmpty() 
						&& txtDiaMes.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Faz Favor e preenche o baguio direito po");
				}else {
					
					
				l  = new Livro(
						txtNome.getText(),
						txtCpf.getText(), 
						Integer.parseInt(txtEnd.getText()), 
						Integer.parseInt(txtDiaMes.getText())
						);
				
				
				LDAO.insert(l);
				try {
					selectLivros();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

				limpar();
				}
			}
		});
		
		Conexao.conectando();
		
	}
	
	public void limpar() {
		
		txtNome.setText(""); 
		txtCpf.setText("");
		txtEnd.setText("");
		txtDiaMes.setText("");
	}
	private void selectLivros() throws SQLException {

		modeloTabela.setRowCount(0);
		for(Livro lv : LDAO.select()) {
			modeloTabela.addRow(new Object[] {
					lv.getIdLivro(),
					lv.getTitulo(),
					lv.getAutor(),
					lv.getAno(),
					lv.getPaginas()
			});
		}
	}
}

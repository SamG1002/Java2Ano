

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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.JList;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtData;
	private JTextField txtPag;
	private GregorianCalendar data=new GregorianCalendar();
	private DefaultListModel listFazer = new DefaultListModel();
	private DefaultListModel listFeito = new DefaultListModel();
	private JTextField txtAutor;
	private JTextField txtAno;
	private JTextField txtPagina;
	private JTable table;

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
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Arial", Font.PLAIN, 15));
		txtTitulo.setForeground(Color.LIGHT_GRAY);
		txtTitulo.setBounds(72, 65, 228, 25);
		cadastrar.add(txtTitulo);
		txtTitulo.setColumns(10);
		txtTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtTitulo.setBackground(cadastrar.getBackground());
		
		txtData = new JTextField();
		
		txtPag = new JTextField();
		
		JButton btnAdd = new JButton("Adicionar");
		
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBounds(72, 304, 228, 25);
		btnAdd.setBackground(cadastrar.getBackground());
		btnAdd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		
		cadastrar.add(btnAdd);
		
		JButton btnExcluir = new JButton("Excluir");
		
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnExcluir.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnExcluir.setBackground(new Color(51, 51, 51));
		btnExcluir.setBounds(72, 268, 100, 25);
		cadastrar.add(btnExcluir);
		
		JLabel lblNewLabel = new JLabel("Titulo do Livro");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(72, 35, 140, 25);
		cadastrar.add(lblNewLabel);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Arial", Font.BOLD, 15));
		lblAno.setBounds(72, 174, 77, 25);
		cadastrar.add(lblAno);
		
		JLabel lblPaginas = new JLabel("Paginas");
		lblPaginas.setForeground(Color.WHITE);
		lblPaginas.setFont(new Font("Arial", Font.BOLD, 15));
		lblPaginas.setBounds(200, 174, 77, 25);
		cadastrar.add(lblPaginas);
		
		txtAutor = new JTextField();
		txtAutor.setForeground(Color.LIGHT_GRAY);
		txtAutor.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAutor.setColumns(10);
		txtAutor.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtAutor.setBackground(new Color(51, 51, 51));
		txtAutor.setBounds(72, 138, 228, 25);
		cadastrar.add(txtAutor);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setForeground(Color.WHITE);
		lblAutor.setFont(new Font("Arial", Font.BOLD, 15));
		lblAutor.setBounds(72, 108, 140, 25);
		cadastrar.add(lblAutor);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAlterar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 204, 204)));
		btnAlterar.setBackground(new Color(51, 51, 51));
		btnAlterar.setBounds(200, 268, 100, 25);
		cadastrar.add(btnAlterar);
		
		txtAno = new JTextField();
		txtAno.setForeground(Color.LIGHT_GRAY);
		txtAno.setFont(new Font("Arial", Font.PLAIN, 15));
		txtAno.setColumns(10);
		txtAno.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtAno.setBackground(new Color(51, 51, 51));
		txtAno.setBounds(72, 210, 100, 25);
		cadastrar.add(txtAno);
		
		txtPagina = new JTextField();
		txtPagina.setForeground(Color.LIGHT_GRAY);
		txtPagina.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPagina.setColumns(10);
		txtPagina.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 204, 204)));
		txtPagina.setBackground(new Color(51, 51, 51));
		txtPagina.setBounds(200, 210, 100, 25);
		cadastrar.add(txtPagina);
		
		JPanel resultado = new JPanel();
		resultado.setBackground(new Color(102, 204, 204));
		resultado.setBounds(0, 0, 400, 411);
		contentPane.add(resultado);
		resultado.setLayout(null);
		resultado.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 42, 300, 311);
		resultado.add(scrollPane);
		
		//modelo
		DefaultTableModel modeloTabela = new DefaultTableModel();
		modeloTabela.addColumn("Titulo");
		modeloTabela.addColumn("Autor");
		modeloTabela.addColumn("Ano");
		modeloTabela.addColumn("Pagina");
		

		table = new JTable(modeloTabela);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				txtTitulo.setText(modeloTabela.getValueAt(i, 0).toString());
				txtAutor.setText(modeloTabela.getValueAt(i, 1).toString());
				txtAno.setText(modeloTabela.getValueAt(i, 2).toString());
				txtPagina.setText(modeloTabela.getValueAt(i, 3).toString());
			}
		});
		
		scrollPane.setViewportView(table);
		
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				modeloTabela.setValueAt(txtTitulo.getText() ,i , 0);
				modeloTabela.setValueAt(txtAutor.getText() ,i , 1);
				modeloTabela.setValueAt(txtAno.getText() ,i , 2);
				modeloTabela.setValueAt(txtPagina.getText() ,i , 3);
			}
		});
		
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() > -1)
				modeloTabela.removeRow(table.getSelectedRow());
				
				txtTitulo.setText(""); 
				txtAutor.setText("");
				txtAno.setText("");
				txtPagina.setText("");
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modeloTabela.addRow(new Object[] {
						txtTitulo.getText(), txtAutor.getText(), txtAno.getText(), txtPagina.getText()
				});
				
				txtTitulo.setText(""); 
				txtAutor.setText("");
				txtAno.setText("");
				txtPagina.setText("");
				
			}
		});
	}
}

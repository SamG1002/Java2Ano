package Screens;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import App.Book;
import App.BookDAO;
import App.Connect;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Index extends JFrame {
	
	// Attributes
	
	private JTextField tfTitle, tfAuthor, tfYear, tfPages;
	private DefaultTableModel tableModel = new DefaultTableModel();
	private BookDAO bookDAO = new BookDAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Index() throws SQLException {
		setTitle("BookList");
		setResizable(false);
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 370);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		// Background
		
		JPanel panelData = new JPanel();
		panelData.setBackground(Color.DARK_GRAY);
		panelData.setBounds(0, 0, 285, 341);
		contentPane.add(panelData);
		panelData.setLayout(null);
		
		// Data
		
		JLabel lblRegisterABook = new JLabel("Register a book");
		lblRegisterABook.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		lblRegisterABook.setForeground(new Color(192, 192, 192));
		lblRegisterABook.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterABook.setBounds(64, 22, 141, 27);
		panelData.add(lblRegisterABook);
		
		JPanel panelTitleBg = new JPanel();
		panelTitleBg.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 2), " Title ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelTitleBg.setBackground(Color.DARK_GRAY);
		panelTitleBg.setBounds(47, 65, 172, 39);
		panelData.add(panelTitleBg);
		panelTitleBg.setLayout(null);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		tfTitle.setForeground(Color.GRAY);
		tfTitle.setBounds(9, 13, 154, 22);
		panelTitleBg.add(tfTitle);
		tfTitle.setBackground(Color.DARK_GRAY);
		tfTitle.setColumns(10);
		tfTitle.setBorder(new LineBorder(Color.RED, 0));
		
		JPanel panelAuthorBg = new JPanel();
		panelAuthorBg.setLayout(null);
		panelAuthorBg.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 2), " Author ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelAuthorBg.setBackground(Color.DARK_GRAY);
		panelAuthorBg.setBounds(47, 115, 172, 39);
		panelData.add(panelAuthorBg);
		
		tfAuthor = new JTextField();
		tfAuthor.setForeground(Color.GRAY);
		tfAuthor.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		tfAuthor.setColumns(10);
		tfAuthor.setBorder(new LineBorder(Color.RED, 0));
		tfAuthor.setBackground(Color.DARK_GRAY);
		tfAuthor.setBounds(9, 13, 154, 22);
		panelAuthorBg.add(tfAuthor);
		
		JPanel panelYearBg = new JPanel();
		panelYearBg.setLayout(null);
		panelYearBg.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 2), " Year ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelYearBg.setBackground(Color.DARK_GRAY);
		panelYearBg.setBounds(47, 165, 172, 39);
		panelData.add(panelYearBg);
		
		tfYear = new JTextField();
		tfYear.setForeground(Color.GRAY);
		tfYear.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		tfYear.setColumns(10);
		tfYear.setBorder(new LineBorder(Color.RED, 0));
		tfYear.setBackground(Color.DARK_GRAY);
		tfYear.setBounds(9, 13, 154, 22);
		panelYearBg.add(tfYear);
		
		JPanel panelPagesBg = new JPanel();
		panelPagesBg.setLayout(null);
		panelPagesBg.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 2), " Total Pages ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panelPagesBg.setBackground(Color.DARK_GRAY);
		panelPagesBg.setBounds(47, 218, 172, 39);
		panelData.add(panelPagesBg);
		
		tfPages = new JTextField();
		tfPages.setForeground(Color.GRAY);
		tfPages.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		tfPages.setColumns(10);
		tfPages.setBorder(new LineBorder(Color.RED, 0));
		tfPages.setBackground(Color.DARK_GRAY);
		tfPages.setBounds(9, 15, 154, 20);
		panelPagesBg.add(tfPages);
		
		// Table
		
		JLabel lblError = new JLabel("");
		lblError.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblError.setForeground(new Color(178, 34, 34));
		lblError.setBackground(new Color(128, 0, 0));
		lblError.setBounds(329, 301, 369, 21);
		lblError.setVisible(false);
		contentPane.add(lblError);
		
		tableModel.addColumn("Id");
		tableModel.addColumn("Title");
		tableModel.addColumn("Author");
		tableModel.addColumn("Year");
		tableModel.addColumn("Pages");
		
		loadBooks();
		
		JScrollPane scrollPane = new JScrollPane();
		LineBorder lb = new LineBorder(new Color(0,0,0,0));
		scrollPane.setBounds(329, 32, 424, 264);
		scrollPane.setViewportBorder(null);
		scrollPane.setBorder(lb);
		scrollPane.setBackground(Color.darkGray);
		contentPane.add(scrollPane);
		
		JTable table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblError.setVisible(false);
				int index = table.getSelectedRow();
				if(index > -1) {
					tfTitle.setText(tableModel.getValueAt(index, 1).toString());
					tfAuthor.setText(tableModel.getValueAt(index, 2).toString());
					tfYear.setText(tableModel.getValueAt(index, 3).toString());
					tfPages.setText(tableModel.getValueAt(index, 4).toString());
				}else{
					lblError.setVisible(true);
					lblError.setText("There is nothing here!");
				}
			}
		});
		UIManager.getDefaults().put("TableHeader.cellBorder", BorderFactory.createEmptyBorder(0, 0, 0, 0));
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.setFillsViewportHeight(true);
		table.setGridColor(new Color(51, 51, 51));
		table.setBackground(Color.darkGray);
		table.setForeground(Color.LIGHT_GRAY);
		
		table.getTableHeader().setBackground(new Color(51, 51, 51));
		table.getTableHeader().setForeground(Color.gray);
		table.getTableHeader().setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		
		int sizes[] = new int[] {5, 100, 20, 5, 5};
		
		for(int i = 0; i < 5; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
			table.getColumnModel().getColumn(i).setPreferredWidth(sizes[i]);
		}
		
		JTableHeader header = table.getTableHeader();
		header.setPreferredSize(new Dimension(0, 40));
		scrollPane.setViewportView(table);
		// Buttons
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblError.setVisible(false);
				if(!tfTitle.getText().isEmpty() && !tfAuthor.getText().isEmpty() && !tfYear.getText().isEmpty() 
						&& !tfPages.getText().isEmpty()) {
					Book book = new Book(
							Integer.parseInt(tfYear.getText()), 
							Integer.parseInt(tfPages.getText()), 
							tfTitle.getText(), 
							tfAuthor.getText());
					bookDAO.insertDB(book);
					try { loadBooks(); } catch (SQLException e) { e.printStackTrace(); }
					clean();
				}else{
					lblError.setVisible(true);
					lblError.setText("Please, insert all fields!");
				}
			}
		});
		btnSave.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnSave.setBounds(29, 282, 67, 23);
		onButtons(btnSave);
		panelData.add(btnSave);
		
		JButton btnAlter = new JButton("Alter");
		btnAlter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblError.setVisible(false);
				int index = table.getSelectedRow();
				if(index > -1) {
					int i = JOptionPane.showConfirmDialog(
					        null, 
					        "Are you sure? It'll alter " + tableModel.getValueAt(table.getSelectedRow(), 1),
					        "Alter?",
					        JOptionPane.OK_CANCEL_OPTION
				        );
					
					if(i == JOptionPane.YES_OPTION) {
						int id = (int) tableModel.getValueAt(table.getSelectedRow(), 0);
						Book book = new Book(
								id, Integer.parseInt(tfYear.getText()), 
								Integer.parseInt(tfPages.getText()), 
								tfTitle.getText(), tfAuthor.getText());
						bookDAO.updateDB(book);
						try { loadBooks(); } catch (SQLException e) { e.printStackTrace(); }
					}
					
				}else{
					lblError.setVisible(true);
					lblError.setText("Nothing selected!");
				}
				clean();
			}
		});
		btnAlter.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnAlter.setBounds(104, 282, 67, 23);
		onButtons(btnAlter);
		panelData.add(btnAlter);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblError.setVisible(false);
				if(table.getSelectedRow() > -1) {
					
					int i = JOptionPane.showConfirmDialog(
						        null, 
						        "Are you sure? It'll delete " + tableModel.getValueAt(table.getSelectedRow(), 1),
						        "Delete?",
						        JOptionPane.OK_CANCEL_OPTION
					        );
					
					if(i == JOptionPane.YES_OPTION) {
						int id = (int) tableModel.getValueAt(table.getSelectedRow(), 0);
						bookDAO.deleteDB(id);
						try { loadBooks(); } catch (SQLException e) { e.printStackTrace(); }
					}
					
				}else{
					lblError.setVisible(true);
					lblError.setText("Nothing selected!");
				}
				clean();
			}
		});
		btnDelete.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnDelete.setBounds(178, 282, 68, 23);
		onButtons(btnDelete);
		panelData.add(btnDelete);
		
		
	}
	
	// Methods
	
	private void loadBooks() throws SQLException {
		tableModel.setRowCount(0);
		
		for(Book book : bookDAO.selectDB()) {
			tableModel.addRow(new Object[] {
					book.getId(), 
					book.getTitle(), 
					book.getAuthor(), 
					book.getYear(), 
					book.getPages()
			});
		}
	}
	
	private void clean() {
		tfTitle.setText(null);
		tfAuthor.setText(null);
		tfYear.setText(null);
		tfPages.setText(null);
	}
		
	private void onButtons(JButton btn) {
		btn.setBackground(Color.gray);
		btn.setForeground(Color.white);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(44, 44, 44));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(Color.gray);
	        }
		});
	}
}
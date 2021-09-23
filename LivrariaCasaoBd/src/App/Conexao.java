package App;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexao {
	private static final String url = "jdbc:mysql://localhost:3306/bdLivraria?useTimezone=true&serverTimezone=UTC";
	private static final String usuario = "root";
	private static final String senha = "";
	
	public static Connection conectando() {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url, usuario, senha);
			if(connect != null) {
				//JOptionPane.showMessageDialog(null, "FOI!!");
				//System.out.println("FOI!");
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ai zuou");
			e.printStackTrace();
		}
		return connect;
	}
}

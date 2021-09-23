package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class LivroDAO {
	
	ResultSet r;
	Connection c;
	private PreparedStatement stmt;
	
	public void insert(Livro l){
		c = Conexao.conectando();
		String sqlInsert = "INSERT INTO tbLivros(tituloLivro, autorLivro, anoLivro, paginasLivro) "
						+ "VALUES(?, ?, ?, ?)";
		try {
			stmt = c.prepareStatement(sqlInsert);
			
			stmt.setString(1, l.getTitulo());
			stmt.setString(2, l.getAutor());
			stmt.setInt(3, l.getAno());
			stmt.setInt(4, l.getPaginas());
			
			stmt.execute();
			
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
		
		
	public List<Livro> select() throws SQLException {
		
		List<Livro> livross = new ArrayList();
		c = Conexao.conectando();
		
		try {
			String sqlSelect = "SELECT * FROM tbLivros";
			stmt = c.prepareStatement(sqlSelect);
			r = stmt.executeQuery(sqlSelect);

			while(r.next()) {
				
				Livro liv = new Livro(
						r.getString("tituloLivro"),
						r.getString("autorLivro"),
						r.getInt("anoLivro"),
						r.getInt("paginasLivro")
				);
				liv.setIdLivro(r.getInt("idLivro"));
				
				livross.add(liv);
			}
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return livross;
		
	}
	
	public void delete(int id) {
			c = Conexao.conectando();
			String sqlDelete = "DELETE FROM tbLivros "
							 + "WHERE idLivro = ?";
			try {
			stmt = c.prepareStatement(sqlDelete);
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	
	public void update(Livro l) {
		c = Conexao.conectando();
		String sqlUpdate = "UPDATE tbLivros "
						+ "SET tituloLivro = ?, autorLivro = ?, anoLivro = ?, paginasLivro = ? WHERE idLivro = ? ";
		
		try {
			stmt = c.prepareStatement(sqlUpdate);
			stmt.setString(1, l.getTitulo());
			stmt.setString(2, l.getAutor());
			stmt.setInt(3, l.getAno());
			stmt.setInt(4, l.getPaginas());
			stmt.setInt(5, l.getIdLivro());
			
			stmt.executeUpdate();
			
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
}

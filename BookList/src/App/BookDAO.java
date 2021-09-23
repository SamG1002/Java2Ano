package App;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	// Attributes
	
	private Connection connect;
	private PreparedStatement stmt = null;
	private ResultSet resultSet = null;
	
	// Methods
	
	public void insertDB(Book book) {
		connect = Connect.getConnection();
		String sqlQuery = "INSERT INTO tbBook(titleBook, authorBook, yearBook, pagesBook) VALUES(?, ?, ?, ?)";
		try {
			stmt = connect.prepareStatement(sqlQuery);
			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getAuthor());
			stmt.setInt(3, book.getYear());
			stmt.setInt(4, book.getPages());
			
			stmt.executeUpdate();
			connect.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Book> selectDB() throws SQLException {
		List<Book> books = new ArrayList<>();
		connect = Connect.getConnection();
		String sqlQuery = "SELECT * FROM tbBook";
		try {
			stmt = connect.prepareStatement(sqlQuery);
			resultSet = stmt.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				Book book = new Book(
						resultSet.getInt("idBook"), 
						resultSet.getInt("yearBook"), 
						resultSet.getInt("pagesBook"), 
						resultSet.getString("titleBook"), 
						resultSet.getString("authorBook"));
				books.add(book);
			}
			connect.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		return books;
	}
	
	public void deleteDB(int id) {
		connect = Connect.getConnection();
		String sqlQuery = "DELETE FROM tbBook WHERE idBook = ?";
		try {
			stmt = connect.prepareStatement(sqlQuery);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			connect.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	
	public void updateDB(Book book) {
		connect = Connect.getConnection();
		String sqlQuery = "UPDATE tbBook SET yearBook = ?, pagesBook = ?, titleBook = ?, authorBook = ? WHERE idBook = ?";
		try {
			stmt = connect.prepareStatement(sqlQuery);
			stmt.setInt(1, book.getYear());
			stmt.setInt(2, book.getPages());
			stmt.setString(3, book.getTitle());
			stmt.setString(4, book.getAuthor());
			stmt.setInt(5, book.getId());
			stmt.executeUpdate();
			connect.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}











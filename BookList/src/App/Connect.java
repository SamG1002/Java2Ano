package App;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	// Constants
	
	public static final String URL = "jdbc:mysql://localhost:3306/dblib?useTimezone=true&serverTimezone=UTC";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			// if(connection != null) System.out.println("Connected!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
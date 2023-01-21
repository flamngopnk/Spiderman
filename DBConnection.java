import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String DRIVER = "org.apache.derby.jdc.EmbeddedDriver";
	private static final String JDBC_URL =  "jdbc:derby:Spiderman;create=true";
	
	Connection conn;
	public java.sql.ResultSet rs;
	public java.sql.Statement stmt;
	public java.sql.PreparedStatement prep;
	
	public DBConnection() {
		try {
			this.conn = DriverManager.getConnection(JDBC_URL);
			if (this.conn !=null) {
				System.out.println("You are connected");
			}
		}catch(SQLException e) {
			System.out.println("Connection Failed");
		}
	}
	
	public void Create_stmt(String query) throws SQLException
	{
		conn.createStatement().execute(query);
		System.out.println("Connecting and running query");
	}
	 
	
	public void Result_set(String query) throws SQLException
	{
		stmt = conn.createStatement();
		rs=stmt.executeQuery(query);
	}
		
	
}

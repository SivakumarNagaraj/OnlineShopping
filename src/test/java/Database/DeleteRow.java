package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DeleteRow {

	@Test
	public void delete() throws SQLException {
		Driver Dbdriver = new Driver();
		DriverManager.registerDriver(Dbdriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		Statement statement = connection.createStatement();
	 statement.executeQuery("DELETE FROM ename;");
		//System.out.println(result);
		
	}
}

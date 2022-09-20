package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertTheData 
{
public static void main(String[] args) throws SQLException
	{
		Driver Dbdriver = new Driver();
		DriverManager.registerDriver(Dbdriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate("insert into sdet40 values(3,'Swaraj',123456783,'Bengaluru');");
		System.out.println(result);
		connection.close();
	}
}

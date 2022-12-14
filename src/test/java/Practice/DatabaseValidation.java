package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DatabaseValidation {

	@Test
	public void database() throws SQLException {

		DriverManager.registerDriver(new Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		Statement statement = connection.createStatement();
		try {
			statement.executeUpdate("create table RMG(Ename varchar(10) unique);");
		} catch (Exception e) {
			// TODO: handle exception
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name :");
			String name = sc.next();
				ResultSet dname = statement.executeQuery("select Ename from RMG;");
				int count=0;
				while(dname.next()) {
				if (dname.getString(1).equals(name)) {
					System.out.println(name);
					count++;
				}
			}
				if (count==0)  {
					statement.executeUpdate("insert into RMG values('" + name + "');");
					System.out.println("Name updated");
				}
		}
	}
}
package Org.Onlineshopping.GenricUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility 
{ 
	/**
	 * This method is contains get the connection to database and close the connections 
	 * @param DbUrl
	 * @param Username
	 * @param Password
	 * @param Query
	 * @param Coluom
	 */
	Connection connection;
	Statement statement;
	public void getTheData(String DbUrl, String Username, String Password, String Query, String Coluom)
	{
		Driver Dbdriver = null;
		try {
			Dbdriver = new Driver();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			DriverManager.registerDriver(Dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(DbUrl, Username, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet result = null;
		try {
			result = statement.executeQuery(Query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(result.next())
			{
				System.out.println(result.getString(Coluom));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * This method is used to get the connection to database
	 * @param DbUrl
	 * @param Username
	 * @param Password
	 */
	public void openDataBaseConnection(String DbUrl, String Username, String Password) 
	{
		Driver Dbdriver = null;
		try {
			Dbdriver = new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(Dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(DbUrl, Username, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * 
	 * This method is used to get the data from database
	 * @param Query
	 */
	public void getDataFromDatabase(String Query)
	{

		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.executeQuery(Query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * This methos is used to close the connection from database
	 */
	public void closeDataBaseConnection()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

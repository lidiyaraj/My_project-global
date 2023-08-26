package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadingDataFromJDBC {

	
	public static void main(String[] args) throws SQLException {
		//creating a driver reference
	//	Driver dbDriver = new Driver();
		
		//register the driver
		//DriverManager.registerDriver(dbDriver);
		
		//getconnection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		
		Statement statement = connection.createStatement();
		
		ResultSet data = statement.executeQuery("select * from students");
		
		while(data.next()) {
			System.out.println(data.getString("id")+" "+data.getString("name")+" "+data.getString("contact"));
			
		}
		
		connection.close();
		}
}

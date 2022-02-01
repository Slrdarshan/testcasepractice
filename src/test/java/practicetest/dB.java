package practicetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class dB {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try {
			Driver driverRef=new Driver();
			//load or register mysql to the data base
			DriverManager.registerDriver(driverRef);
			
			//connection to db
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			System.out.println("connection is done");
			
			//create a query statement
			Statement stat = conn.createStatement();
			String query="select * from project";
			ResultSet resultSet = stat.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));;
			}	
		}
		catch(Exception e){
			
		}
		finally {
			//close the connection
			conn.close();
			System.out.println("---------------Db close---------------");
		}
	}

}

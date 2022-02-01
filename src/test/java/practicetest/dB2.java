package practicetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class dB2 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		int result=0;
		try {
			Driver driverRef=new Driver();
			//load or register mysql to the data base
			DriverManager.registerDriver(driverRef);
			
			//connection to db
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			System.out.println("connection is done");
			
			//create a query statement
			Statement stat = conn.createStatement();
			String query="insert into project values('TY_PROJ_30','SUDARSHAN','12/01/2022','BankOfBoroda_2','On Going',10)";
			
			//exceute the query
			result=stat.executeUpdate(query);
		}
		catch(Exception e){
			
		}
		finally {
			if(result==1) {
				System.out.println("inserted");
			}
			else {
				System.out.println("not inserted");
			}
			//close the connection
			conn.close();
			System.out.println("---------------Db close---------------");
		}
	}

	}



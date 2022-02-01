package practicetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class whiteB {

	@Test
	public void projectUnitTest() throws SQLException {
		String projectName="SD_PA_111";
		Connection conn=null;
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			System.out.println("connected");
			Statement stat = conn.createStatement();
			String query = "select * from project";
			ResultSet result = stat.executeQuery(query);
			boolean flag=false;
			while(result.next()) {
				String pName = result.getString(4);
				if(pName.equals(projectName)) {
					flag=true;
				}
			}
			Assert.assertTrue(flag);
		}
		catch(Exception e) {}
		finally {
			conn.close();
			System.out.println("----close------");
		}
	}
}

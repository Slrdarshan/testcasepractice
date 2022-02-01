package practicetest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider3DArray {

	@Test(dataProvider="bookTicketDataProvider")
	public void bookTicket(String src,String dest, int ticket) {
		System.out.println("execute source => "+src+",Destination==>"+dest);
	}
	
	@DataProvider
	public Object[][] bookTicketDataProvider() {
		Object[][] objArr=new Object[4][3];
		objArr[0][0]="Bengaluru";
		objArr[0][1]="Mysore";
		objArr[0][2]=10;
		
		objArr[1][0]="Bengaluru";
		objArr[1][1]="Goa";
		objArr[1][2]=11;
		
		objArr[2][0]="Bengaluru";
		objArr[2][1]="Belagavi";
		objArr[2][2]=01;
		
		objArr[3][0]="Bengaluru";
		objArr[3][1]="Chikodi";
		objArr[3][2]=15;
		
		return objArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package practicetest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvader2Darray {

	
	@Test(dataProvider = "dataprovider_bookTicketTest")
	public void bookTicket(String src,String dist) {
		System.out.println("book ticket from"+src+"to"+dist);
	}
	
	@DataProvider
	public Object[][] dataprovider_bookTicketTest() {
		Object[][] objArr=new Object[5][2];
		
		objArr[0][0]="Bengaluru";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Bengaluru";
		objArr[1][1]="Mysore";
		
		objArr[2][0]="Benglore";
		objArr[2][1]="Mangaluru";
		
		objArr[3][0]="Benglore";
		objArr[3][1]="Hyd";
		
		objArr[4][0]="Benglore";
		objArr[4][1]="Mp";
		
		
		return objArr;
	}
	
	
	
	
}

package practicetest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericpackage.ExcelUtility;

public class dataProvaderFromExcelSheet {

	@Test(dataProvider="dp_addToCartAndBill")
	public void addToCartAndBill(String product, String qty) {
		System.out.println("execute"+product+"att to cart & bill");
	}
	
	@DataProvider
	public Object[][] dp_addToCartAndBill() throws Throwable {
		ExcelUtility eu=new ExcelUtility();
		int rowcount = eu.getRowCount("sheet2");
		
		Object[][] objArr=new Object[rowcount][2];
		for(int i=0;i<rowcount;i++) {
			objArr[i][0]=eu.getDataFromExcel("sheet2", i, 0);
			objArr[i][1]=eu.getDataFromExcel("sheet2", i, 1);
		}
		return objArr;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

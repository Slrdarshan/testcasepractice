package com.crm.comcast.orgTest;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericpackage.BaseCls;
import genericpackage.ExcelUtility;
import genericpackage.webdriverUtility;
import objectRepository.contactRepo;
import objectRepository.cratingNewOrganizationRepo;
import objectRepository.homePageRepo;
import objectRepository.orgInformRepo;

//@Listeners(genericpackage.LisImpClass.class)
public class tc_001Test extends BaseCls  {


	@Test //(groups="smokeTest")
	
    public void crtOrgModule() throws EncryptedDocumentException, IOException, InterruptedException
	{

		webdriverUtility wbul=new webdriverUtility();
		ExcelUtility eu=new ExcelUtility();
		
		homePageRepo hp=new homePageRepo(driver);
		hp.setorg();
			
		cratingNewOrganizationRepo cnor=new cratingNewOrganizationRepo(driver);
		cnor.setcreateOrg(driver);
		
		orgInformRepo oir=new orgInformRepo(driver);
		String data = eu.getDataFromExcel("sheet1", 4, 2);
		oir.setExcelData(data);
		oir.setorgInformRepo(driver);

		//contact with org name
		contactRepo cr=new contactRepo(driver);
		cr.setcreatCont();	
		cr.setSendT();
		cr.setExcelD(data);
		wbul.switchToWindow(driver, "Accounts&action");
		cr.searchBox(data);
		driver.findElement(By.xpath("//a[text()= '"+data+"']")).click();
		Thread.sleep(2000);
		wbul.switchToWindow(driver, "EditView&return_action");
		cr.setSave();	
		
	}
	
	
	
	
	
}

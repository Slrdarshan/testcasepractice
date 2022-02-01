package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import genericpackage.BaseCls;
import objectRepository.crateingNewPurchaseOrder;
import objectRepository.homePageRepo;
import objectRepository.purchasePageRepo;

//@Listeners(genericpackage.LisImpClass.class)
public class tc_25Test extends BaseCls {

	
	@Test //(groups="smokeTest")
	public void moduleTest()  {

		
		homePageRepo hpr=new homePageRepo(driver);
		hpr.setMore(driver);

		purchasePageRepo pp=new purchasePageRepo(driver);
		pp.setcreatPg(driver);

		crateingNewPurchaseOrder cnp=new crateingNewPurchaseOrder(driver);
		cnp.creatOrder(driver);

	}

}

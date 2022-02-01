package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericpackage.ExcelUtility;




public class orgInformRepo extends ExcelUtility {

	@FindBy(name = "accountname")
	private WebElement textf1;
	 
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement savebtn;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement header;
	
	
	
	public orgInformRepo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setExcelData(String data) {
		textf1.sendKeys(data);
		
	}
  
	public void setorgInformRepo(WebDriver driver) {
		savebtn.click();	
	}

	

	
	
}

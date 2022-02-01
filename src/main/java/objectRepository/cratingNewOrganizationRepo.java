package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class cratingNewOrganizationRepo {

	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement crtbtn;
	
	
	public cratingNewOrganizationRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void setcreateOrg(WebDriver driver) {
		crtbtn.click();
	}
	
	
	
}

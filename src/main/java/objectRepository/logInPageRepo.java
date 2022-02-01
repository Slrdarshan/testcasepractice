package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPageRepo {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement untbox;
	
	@FindBy(xpath = "//input[@name='user_password']") 
	private WebElement pwtbox;
	
	@FindBy(id="submitButton")
	private WebElement logInBt;
	
	public logInPageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	public void setLogIn(String un, String pwd) {
		untbox.sendKeys(un);
		pwtbox.sendKeys(pwd);
		logInBt.click();
	}
	
	
}

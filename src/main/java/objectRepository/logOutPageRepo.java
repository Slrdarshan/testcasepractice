package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPageRepo {

	
	
	@FindBy(xpath = "(//img[@style='padding: 0px;padding-left:5px'])[1]")
	private WebElement logoutB;
	
	public logOutPageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void setlogOutP(WebDriver driver)
	{
		
		Actions b=new Actions(driver);
	    WebElement logout = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
	    b.moveToElement(logout).perform();
	    logoutB.click();
	        
	}
	
}

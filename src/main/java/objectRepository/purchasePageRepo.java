package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchasePageRepo {

	
	@FindBy(xpath = "//img[@title='Create Purchase Order...']")
	private WebElement creatButton;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement textVis;
	
	public purchasePageRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setcreatPg(WebDriver driver) {
		creatButton.click();
		boolean tv = textVis.isDisplayed();
		System.out.println(tv + "  new Order Pager Is Display");
	}
	
	
//	driver.findElement(By.xpath("//img[@title='Create Purchase Order...']")).click();
//	boolean newOrder = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).isDisplayed();
//	System.out.println(newOrder + "  new Order Pager Is Display");
	
	
	
	
	
	
	
	
	
}

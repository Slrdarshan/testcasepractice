package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageRepo {

	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreoption;
	
	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement purOrdOption;
	
	@FindBy(xpath = "(//a[text()='Purchase Order'])[3]")
	private WebElement perorderDiplay;
	
	@FindBy(linkText = "Organizations")
	private WebElement org;
	
	
	public homePageRepo(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	
	public void setorg() {
		org.click();
	}
	
	
	public void setMore(WebDriver driver) {
	//WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
	Actions a = new Actions(driver);
	a.moveToElement(moreoption).perform();
	//driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
	purOrdOption.click();
	//boolean purchaseOrder = driver.findElement(By.xpath("(//a[text()='Purchase Order'])[3]")).isDisplayed();
	boolean page = perorderDiplay.isDisplayed();
	System.out.println(page + " Parchase page is display");
	
	}
	
}
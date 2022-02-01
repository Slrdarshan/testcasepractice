package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class crateingNewPurchaseOrder {

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement radiobt;
	
	@FindBy(xpath = "(//select[@class='small'])[5]")
	private WebElement Option;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement textFild;
	
	public crateingNewPurchaseOrder(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	
	public void creatOrder(WebDriver driver) {
		radiobt.click();
		Select s = new Select(Option);
		s.selectByIndex(2);
		textFild.sendKeys("rema sky view appartments, 3rd floor, B-31, Murgeshpallya,KR Garden, pin-500017");
	}

//	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
//	WebElement option = driver.findElement(By.xpath("(//select[@class='small'])[5]"));
//	Select s = new Select(option);
//	s.selectByIndex(2);
//	
//	driver.findElement(By.xpath("//textarea[@name='bill_street']"))
//			.sendKeys("rema sky view appartments, 3rd floor, B-31, Murgeshpallya,KR Garden, pin-500017");
	
	
	
	
	
}

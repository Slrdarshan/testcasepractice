package genericpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class webdriverUtility {
	
     /**
      * this method wait for 20 sec for page loading
      * @param driver
      */
	public void waitUntilPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * this method wait for the element visibility
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method wait until the element visible
	 * @param driver
	 * @param element
	 */
	public void waitExplicitly(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method wait for the element to be clicked, its custom wait created to avoid element Acceptable exception 
	 * @param element
	 * @throws InterruptedException
	 */
public void waitAndClick(WebElement element) throws InterruptedException	{
	int count=0;
	while(count<20) {
		try {
			element.click();
			break;
		}
		catch(Throwable e) {
			Thread.sleep(1000);
			count++;
			
		}
	}	
}


    /**
     * this method enables user to handle dropdown using visible text
     * @param element
     * @param option
     */
   public void  select(WebElement element,String option) {
	Select s=new Select(element);
	s.selectByVisibleText(option);
   }
 
     /**
      * this method enables user to handle dropdown using index
      * @param element
      * @param index
      */
   public void select(WebElement element, int index) {
	   Select s=new Select(element);
	   s.selectByIndex(index);
   }
	
   /**
    * this method will perform mousehover action
    * @param driver
    * @param element
    */
	public void mouseHover(WebDriver driver,WebElement element ) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * this method perform right click operation
	 * @param driver
	 * @param element
	 */
	public void rigthClick(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		
	}
    
	/**
	 * this method helps to switch from one window to another
	 * @param driver
	 * @param partialWinTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWinTitle ) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext()) 
		{
			String winld = it.next();
			String title = driver.switchTo().window(winld).getTitle();
			if (title.contains(partialWinTitle)) 
			{
				break;
			}
		}
	}
	
	/**
	 * cancel the Alert
	 * @param driver
	 */
	public void cancleAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method used for scrolling in a webpage
	 * @param driver
	 * @param element
	 */
	public void scrollToWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0"+y+")", element);
	}
	
	/**
	 * this method  move the next frame using index value
	 * @param driver
	 * @param index
	 */
    public void switchFrame(WebDriver driver, int index) {
	 driver.switchTo().frame(index);
    }
	
    /**
     * this method  move the next frame using element 
     * @param driver
     * @param element
     */
    public void switchFrame(WebDriver driver, WebElement element) {
    	driver.switchTo().frame(element);
    }
    
    /**
     * this method  move the next frame using  idOrName
     * @param driver
     * @param element
     */
    public void switchFrame(WebDriver driver, String idOrName) {
    	driver.switchTo().frame(idOrName);
    }
	
    /**
     * this method helps to take screenshot when test case fail  
     * @param driver
     * @param screenshortName
     * @throws IOException
     */
    public void takeScreenShort(WebDriver driver, String screenshortName) throws IOException {
    	TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshrot/"+screenshortName+".png");
		Files.copy(src, dest);
		
    }
    
    /**
     * press enter key appertain in to Browser
     * @param driver
     */
    public void pressEnterKey(WebDriver driver) {
    	Actions a=new Actions(driver);
    	a.sendKeys(Keys.ENTER).perform();
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}

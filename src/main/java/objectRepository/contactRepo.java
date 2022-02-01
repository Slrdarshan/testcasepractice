package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericpackage.ExcelUtility;




public class contactRepo extends ExcelUtility {
	
	
	

          @FindBy(xpath = "(//a[text()='Contacts'])[1]")
		  private WebElement cont;
          
          @FindBy(xpath = "//img[@alt='Create Contact...']")
          private WebElement crtopt;
	
          @FindBy(xpath = "//input[@name='lastname']")
          private WebElement text1;
          
          @FindBy(xpath = "(//img[@alt='Select'])[1]")
          private WebElement crtcont;
          
          @FindBy(id = "search_txt")
        	private WebElement srtbox;
          
          @FindBy(xpath = "//input[@type='button']")
          private WebElement srcbtn;
          
          @FindBy(xpath = "(//input[@value='  Save  '])[1]")
          private WebElement savebtm;
          
	      public contactRepo(WebDriver driver) {
	    	  PageFactory.initElements(driver, this);
	    	  
	      }      
	      
	      public void setcreatCont() throws InterruptedException {
	    	  Thread.sleep(8000);
	    	 	  cont.click();  	
	      }
	      
	      public void setSendT() {
	    	  crtopt.click();
	      }
	      
	      public void setExcelD(String data) {
	    	  text1.sendKeys(data);
	    	  crtcont.click();
	      }
	      
	    public void searchBox(String data) {
	    	srtbox.sendKeys(data);
	    	srcbtn.click();
	    }
	     
	    public void setSave() throws InterruptedException {
	    	
	    	savebtm.click();
	    }
}

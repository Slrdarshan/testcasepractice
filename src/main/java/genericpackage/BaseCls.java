package genericpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.logInPageRepo;
import objectRepository.logOutPageRepo;


public class BaseCls {

	public static WebDriver driver=null;
	
	 
   // @Parameters("BROWSER")
	@BeforeClass //(groups={"smokeTest","regressionTest"})
	public void openBrowser() {
    	
   	/*
		if(BROWSER.equals("chrome"))
		{
		  driver=new ChromeDriver()
			}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
			}
		else if(BROWSER.equals("ie"))
		{
				driver= new InternetExplorerDriver();
			*/
         driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	

	@AfterClass //(groups={"smokeTest","regressionTest"})
	public void closeBrowser() {
        driver.close();
	}
	
	@BeforeMethod //(groups={"smokeTest","regressionTest"})
	public void logIn() {

		fileLib c=new fileLib();
		  String Url = c.getPropertydata("url");
		  String un = c.getPropertydata("username");
		  String pwd = c.getPropertydata("password");
		  driver.get(Url);
		  logInPageRepo lnpg=new logInPageRepo(driver);
	      lnpg.setLogIn(un,pwd);
		boolean homePage = driver.findElement(By.xpath("//a[@class='hdrLink']")).isDisplayed();
	    System.out.println(homePage+"  home page is display");
	}
	
	@AfterMethod //(groups={"smokeTest","regressionTest"})
	public void logOut() {
		
		logOutPageRepo lgot=new logOutPageRepo(driver);
		lgot.setlogOutP(driver);
				
	}

	
	
}

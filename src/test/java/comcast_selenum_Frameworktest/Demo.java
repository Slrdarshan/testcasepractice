package comcast_selenum_Frameworktest;




import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testcase.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		FileInputStream fs=new FileInputStream("./data/Excelsh.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		String data = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        driver.findElement(By.name("accountname")).sendKeys(data);
        driver.findElement(By.xpath("(//input[@value='  Save  '])[2]")).click();
        String actualValue = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
        if(actualValue.contains(data))
        {
        	System.out.println("test pass");
        	FileInputStream fos=new FileInputStream("./data/Excelsh.xlsx");
    		Workbook b = WorkbookFactory.create(fos);
    	    b.getSheet("sheet1").getRow(1).getCell(3).setCellValue("pass");
        	FileOutputStream f=new FileOutputStream("./data/Excelsh.xlsx");
        	b.write(f);
        	b.close();
        }
        else {
        	System.out.println("test fail");
        }
        
        Actions a=new Actions(driver);
       WebElement logout = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
        a.moveToElement(logout).perform();
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}

package TestPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Testpage.GooglePage;

public class BaseClass
{
	public WebDriver driver;
   public GooglePage gp;
	
   @BeforeTest
	public void SetBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		gp=new GooglePage (driver);
	
	}
   
   @BeforeClass
   public void setpage()
   
   {
	   
   }
}

package Guru99cartPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Guru99cartpage.Guru99homepage;
import Guru99cartpage.guruPage;
import Sourcecode1.hlepcode;

public class BaseClass 
{
	public WebDriver driver;
	public guruPage gp;
	public Guru99homepage hp;

	
	
	@BeforeTest
	public void selectDropdown() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		gp=new guruPage(driver);
		hp=new Guru99homepage (driver);
	}
	
	@BeforeClass
	public void setpage()
	{
		hp.selectQuantity();
		hlepcode.getScreenshot(driver);
		
		hp.selectbutton();
		hlepcode.getScreenshot(driver);
		
		 gp.setCardnumber();
			hlepcode.getScreenshot(driver);
		 
		 gp.setmonth();
			hlepcode.getScreenshot(driver);
		 
		 gp.setyaer();
			hlepcode.getScreenshot(driver);
		 
		  gp.setcod();
			hlepcode.getScreenshot(driver);
		 
		  gp.clickbutton();
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

package Guru99cartPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Guru99cartpage.Guru99homepage;
import Guru99cartpage.guruPage;

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
		hp.selectbutton();
		 gp.setCardnumber();
		 gp.setmonth();
		 gp.setyaer();
		  gp.setcod();
		  gp.clickbutton();
	}
	

}

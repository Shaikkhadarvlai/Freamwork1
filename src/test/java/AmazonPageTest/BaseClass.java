package AmazonPageTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import AmazonPage.ProductSearchPage;
import AmazonPage.WatchesPage;

public class BaseClass
{
	
	public WebDriver driver;
	public ProductSearchPage pp;
	public WatchesPage wp;
	
	//setBrowser
	@BeforeTest
	public void SetBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		pp=new ProductSearchPage(driver);
		wp=new WatchesPage(driver);
		
		
	}
	
	
	
	@BeforeClass
	public void setPage()
	{
		pp.getOption();
		pp.getsearch();
		 pp.geturl();
		 wp.Scroll();
		 wp.selectwatches();
		 
	}

}

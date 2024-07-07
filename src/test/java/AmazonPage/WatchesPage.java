package AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WatchesPage 
{

	private WebDriver driver;
	
	public WatchesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By Wathes=By.xpath("(//img[@alt='Sponsored Ad - BRUNO MILANO Luxury Fashion Watch for Men Dual Tone Quartz Stainless Steel with Calendar Sport Business Wri...'])[1]");
	
	
	
	
	
	
	//Methods
	public void Scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
	  js.executeScript("window.scroll(0,500)");
	  
	}
	
	public void selectwatches()
	{
		driver.findElement(Wathes).click();
	}
	
	
	
}

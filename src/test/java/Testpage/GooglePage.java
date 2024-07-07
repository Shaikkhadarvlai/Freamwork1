package Testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage 
{
	private WebDriver driver;

	
	public  GooglePage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Locators
	private By search=By.id("searchDropdownBox");
	private By searchelement=By.id("twotabsearchtextbox");		
	
	//Methods 
	public void Search()
	{
	 driver.findElement(search).click();	
		
	}
	
	public void element()
	{
		driver.findElement(searchelement).sendKeys("Waches",Keys.ENTER);
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,3000)");
	}
}
